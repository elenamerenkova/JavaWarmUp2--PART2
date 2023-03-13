/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

https://codingbat.com/java
 */
public class stringBits {
    public static void main(String[] args) {
        stringBits("Heeololeo"); // input your str here
    }

    public static String stringBits(String str) {

        for ( int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
        return str;
    }
}
