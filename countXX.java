/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

https://codingbat.com/java
 */
public class countXX {
    public static void main(String[] args) {
        countXX("abcxx"); // enter your values here
    }

    static int countXX(String str) {
        int count = 0;
        for ( int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).contains("x")) {
                count++;
            }
        }
        System.out.println(count-1);return count-1;

    }
}
