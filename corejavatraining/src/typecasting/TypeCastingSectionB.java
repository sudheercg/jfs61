package typecasting;
public class TypeCastingSectionB {

    public static void main(String[] args) {

        /*
         * PROGRAM 5: Convert char to int
         *
         * Problem:
         * Store a character in a char variable and
         * display its ASCII value.
         *
         * Type: Implicit Type Casting (Widening)
         *
         * char occupies 2 bytes.
         * int occupies 4 bytes.
         *
         * Every character has a Unicode numeric value.
         * ASCII characters have the same numeric values
         * in Unicode.
         *
         * 'A' has the ASCII value 65.
         *
         * Expected Output:
         * Character: A
         * ASCII value: 65
         */

        char ch = 'A';
        int ascii = ch;

        System.out.println("Program 5: char to int");
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);


        /*
         * PROGRAM 6: Convert int to char
         *
         * Problem:
         * Store an ASCII value and display the
         * corresponding character.
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * int occupies 4 bytes.
         * char occupies 2 bytes.
         *
         * Explicit casting is required when converting
         * an int variable into a char.
         *
         * ASCII value 66 represents character 'B'.
         *
         * Expected Output:
         * ASCII value: 66
         * Character: B
         */

        int asciiValue = 66;
        char character = (char) asciiValue;

        System.out.println("\nProgram 6: int to char");
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("Character: " + character);


        /*
         * PROGRAM 7: Convert double to byte
         *
         * Problem:
         * Convert a double value into a byte.
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * double occupies 8 bytes.
         * byte occupies 1 byte.
         *
         * byte range: -128 to 127
         *
         * The fractional part is discarded.
         *
         * Here, 125.75 becomes 125.
         * Since 125 is within the byte range,
         * the value is stored successfully.
         *
         * Expected Output:
         * Double value: 125.75
         * Byte value: 125
         */

        double d = 125.75;
        byte b = (byte) d;

        System.out.println("\nProgram 7: double to byte");
        System.out.println("Double value: " + d);
        System.out.println("Byte value: " + b);


        /*
         * PROGRAM 8: Convert int to char
         *
         * Problem:
         * Convert an integer value into a character.
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * int occupies 4 bytes.
         * char occupies 2 bytes.
         *
         * Java uses Unicode to represent characters.
         *
         * Unicode value 97 represents 'a'.
         *
         * Explicit casting is required because
         * we are converting an int variable to char.
         *
         * Expected Output:
         * Integer value: 97
         * Character: a
         */

        int number = 97;
        char letter = (char) number;

        System.out.println("\nProgram 8: int to char");
        System.out.println("Integer value: " + number);
        System.out.println("Character: " + letter);
        		
    }}