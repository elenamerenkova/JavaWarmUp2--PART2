/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

https://codingbat.com/java
 */
public class doubleX {
    public static void main(String[] args) {
        doubleX("oxxxymiron"); // enter your str value here
    }

    static boolean doubleX(String str) {

        for ( int i = 0; i < str.length(); i++) {
            String x = "x";
            if ( String.valueOf(str.charAt(i)).contains(x)) {
                String newSt = str.substring(i);
                if (newSt.substring(1, 2).contains(x)) {
                    System.out.println("true"); return true;
                } else System.out.println("false"); return false;
            }
        } return true;
    }
}
