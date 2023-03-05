// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
// The returned string should only have a single space separating the words. Do not include any extra spaces.

package HW01;
import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.trim().replaceAll("\s{2,}", " "); //Почему-то ни один регэксп не срабатывает, ни \s{2,}, ни \\s+, ни просто " {2,}". Изгалялся по-всякому.
        String[] words = str.split(" ");
        String[] result = new String[words.length];
        for (int i = 0; i < result.length; i++) {
            result[i]=words[words.length - 1 - i];
        }
        System.out.print(result[0]);
        for (int i = 1; i < result.length; i++) {
            System.out.print(" "+result[i]);
        }
        System.out.println();
        sc.close();
    }
}

