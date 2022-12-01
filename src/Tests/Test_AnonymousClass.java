package Tests;

public class Test_AnonymousClass {
    public static void main(String[] args) {
        String line = "line";
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                String reversedString = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversedString += str.charAt(i);
                }
                return reversedString;

                // On peut aussi faire new StringBuilder(str).reverse().toString();
            }
        };

        System.out.println(reverser.reverse(line));
    }
}

interface StringReverser {

    String reverse(String str);
}
