package typecasting;
public class TypeCastingDemo {

    public static void main(String[] args) {

        /*
         * PROGRAM 1: Convert double to int
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * double occupies 8 bytes.
         * int occupies 4 bytes.
         *
         * Explicit casting is required.
         * The fractional part is discarded, not rounded.
         *
         * Expected Output:
         * Double value: 125.75
         * Integer value: 125
         */

        double d = 125.75;
        int i = (int) d;

        System.out.println("Program 1: double to int");
        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);


        /*
         * PROGRAM 2: Convert int to double
         *
         * Type: Implicit Type Casting (Widening)
         *
         * int occupies 4 bytes.
         * double occupies 8 bytes.
         *
         * Java automatically performs the conversion.
         * No explicit casting is required.
         * No data loss occurs for int to double.
         *
         * Expected Output:
         * Integer value: 250
         * Double value: 250.0
         */

        int num = 250;
        double result = num;

        System.out.println("\nProgram 2: int to double");
        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + result);


        /*
         * PROGRAM 3: Convert float to long
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * float occupies 4 bytes.
         * long occupies 8 bytes.
         *
         * Even though long occupies more bytes,
         * explicit casting is required.
         *
         * Reason:
         * float can store fractional values.
         * long stores only whole numbers.
         * The fractional part is discarded.
         *
         * Expected Output:
         * Float value: 12345.67
         * Long value: 12345
         */

        float f = 12345.67f;
        long l = (long) f;

        System.out.println("\nProgram 3: float to long");
        System.out.println("Float value: " + f);
        System.out.println("Long value: " + l);


        /*
         * PROGRAM 4: Convert long to short
         *
         * Type: Explicit Type Casting (Narrowing)
         *
         * long occupies 8 bytes.
         * short occupies 2 bytes.
         *
         * short range: -32768 to 32767
         *
         * Value 40000 exceeds the short range.
         * During casting, higher-order bits are discarded.
         *
         * Result:
         * 40000 - 65536 = -25536
         *
         * This demonstrates wraparound during
         * narrowing conversion.
         *
         * Expected Output:
         * Long value: 40000
         * Short value: -25536
         */

        long largeNumber = 40000L;
        short smallNumber = (short) largeNumber;

        System.out.println("\nProgram 4: long to short");
        System.out.println("Long value: " + largeNumber);
        System.out.println("Short value: " + smallNumber);
    }
}