/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

https://codingbat.com/java
 */
public class stringSplosion {
    public static void main(String[] args) {
        stringSplosion("Code"); // insert your str value here
    }
    public static String stringSplosion(String str) {
        if (str.length() > 0) {
            for ( int i = 0; i < str.length(); i ++) {
                System.out.print(str.substring(0, i+1));
            }
        } return str;
    }
}
