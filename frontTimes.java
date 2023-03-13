/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

https://codingbat.com/java
 */

public class frontTimes {
    public static void main(String[] args) {
        frontTimes("Ac", 2);

    }

    public static String frontTimes(String str, int n) {
        String front = "";
        for ( int i = 0; i < n; i++) {
            if ( str.length() > 3) {
                front = str.substring(0, 3);
                System.out.print(front);
            } else front=str; System.out.print(front);

        } return front;
    }
}
