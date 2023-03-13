/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

https://codingbat.com/java
 */
public class stringTimes {
    public static void main(String[] args) {
        stringTimes("Hi", 5); // insert your data here

    }
    public static String stringTimes(String str, int n) {
        for ( int x = 0; x < n; x++) {
            System.out.print(str);
        } return str;
    }
}
