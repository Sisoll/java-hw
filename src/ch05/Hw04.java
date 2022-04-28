
package ch05;

import java.util.Arrays;

/**
 * @author SisolShie
 * 4.有一字串陣列內容如下…
 * String[] mySkills = {"java", "javascript", "sql", "c", "python", "php", "swift"};
 * 請統計並印出陣列內每個字母各有幾個，EX…a:4	 c:2
 */

public class Hw04 {

    public static void main(String[] args) {
        var mySkills = new String[]{"java", "javascript", "sql", "c", "python", "php", "swift"};
        System.out.println(Arrays.toString(mySkills));

        var counts = new int[26];
        // Use for-loop
        for (var mySkill : mySkills) {

            var characters = mySkill.toCharArray();
            for (char character : characters) {
                var index = character - 'a';
                counts[index]++;
            }
        }

        System.out.println("a:" + counts[0]); // 'a' - 'a' = 0
        System.out.println("s:" + counts['s' - 'a']);
    }


}
