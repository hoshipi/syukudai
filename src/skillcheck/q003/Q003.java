package q003;

import java.util.HashMap;   // importが必要
import java.util.Map;
import java.io.*;
import java.util.*;

/**
 * Q003 集計と並べ替え
 *
 * 以下のデータファイルを読み込んで、出現する単語ごとに数をカウントし、アルファベット辞書順に並び変えて出力してください。
 * resources/q003/data.txt
 * 単語の条件は以下となります
 * - "I"以外は全て小文字で扱う（"My"と"my"は同じく"my"として扱う）
 * - 単数形と複数形のように少しでも文字列が異れば別単語として扱う（"dream"と"dreams"は別単語）
 * - アポストロフィーやハイフン付の単語は1単語として扱う（"isn't"や"dead-end"）
 *
 * 出力形式:単語=数
 *
[出力イメージ]
（省略）
highest=1
I=3
if=2
ignorance=1
（省略）

 * 参考
 * http://eikaiwa.dmm.com/blog/4690/
 */
public class Q003 {
    /**
     * データファイルを開く
     * resources/q003/data.txt
     */
    private static final String SEPARATOR = "(;?.,)";

    private static InputStream openDataFile() {
        return Q003.class.getResourceAsStream("data.txt");
    }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try {

            FileReader fr = new FileReader(Q003.class.getResource("data.txt").getFile());


            BufferedReader br = new BufferedReader(fr);


            //splitメソッドで分割した単語をword[]配列に格納していく。
            String[] words = br.split(SEPARATOR);


            //繰り返し処理
            for (String word : words) {
                //もしwordが空でないなら…　　　文字列が空かどうかを判定する – isEmptyメソッド
                //分解後に空白1文字が残る場合に備え、単語の出現数のカウントではisEmpty()メソッドを使用

                String nKey = "";

                if (!word.isEmpty()) {
                       /*
                       containsKeyメソッドは、指定したキーが存在するか確認を行い、キーが存在する場合は「true」を返します
                       Map.containsKey(検索するキー)
                       キー→単語
                       値　→出現数
                       単語wordが与えられたときの処理は以下の考え方。　
                       　単語がMapのキーに含まれている場合、出現数を加算する。
                       　単語がMapのキーに含まれていない場合、以下をMapに格納する。　　
                       　キー   word
                       　値　　   1
                        */


                    if (word.equals("I")) {
                        nKey = word;
                    } else {
                        nKey = word.toLowerCase(Locale.getDefault());
                    }

                    if (map.containsKey(nKey)) {
                           /*
                           要素を取り出すためにgetメソッドを使用する。　get(Object key)
                           要素を格納するためにputメソッドを使用する。　put(K key, V value)
                            */
                        int count = map.get(nKey) + 1;
                        map.put(nKey, count);
                        //空じゃなくて初登場なら1をwordに付与する
                    } else {
                        map.put(nKey, 1);
                    }


                }
            }

        } catch (
                FileNotFoundException e) {
            System.out.println("ファイルが見つかりませんでした。");
        } catch (
                IOException e) {
            System.out.println("読み取りに失敗しました。");
        }

       /*
       アルファベット辞書順に並び変えて出力
       条件
           * - "I"以外は全て小文字で扱う（"My"と"my"は同じく"my"として扱う）　　
           * - 単数形と複数形のように少しでも文字列が異れば別単語として扱う（"dream"と"dreams"は別単語）
           * - アポストロフィーやハイフン付の単語は1単語として扱う（"isn't"や"dead-end"）
        */

        List<String> list = new ArrayList<>();
        //formatを最大文字数に合わせて揃えたい
        int maxLengthOfSpelling = 0;

        for (String key : map.keySet()) {
            list.add(key);
            //順番にみていって、maxLengthOfSpellingを更新していく
            if (maxLengthOfSpelling < key.length()) {
                maxLengthOfSpelling = key.length();
            }
        }

       /*
       アルファベット順にソート
       "I"以外は全て小文字で扱う（"My"と"my"は同じく"my"として扱う）
       Comparatorインターフェースを用いた方法ではソートするための条件をプログラマが決めることができる。
       複雑な条件でのソートやオブジェクトの並び替えを特定のルールに沿って行いたいときは、この方法を用いる
        */
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        // 全部の値を出力
        String format = "%-" + maxLengthOfSpelling + "s= %3d";


        for (String word : list) {
            int count = map.get(word);
            //出力の回数を制限するなら、ここで if (出現させたい件数 <= count)で可能

            System.out.printf(format, word, count);
            System.out.println();
        }
    }
}

// 完成までの時間: xx時間 xx分