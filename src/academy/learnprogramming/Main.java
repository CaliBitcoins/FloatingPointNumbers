package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Floating point numbers known as real numbers, and have fractional parts
        // TWO TYPES: Single & Double Precision

        // SINGLE PRECISION: occupies 32 bits (a width of 32)
        float minSinglePrecision = Float.MIN_VALUE;
        float maxSinglePrecision = Float.MAX_VALUE;
        System.out.println("Single Precision Float Minimum Value = " + minSinglePrecision);
        System.out.println("Single Precision Float Maximum Value = " + maxSinglePrecision);
        
        // DOUBLE PRECISION: occupies 64 bits (a width of 64)
        double minDoublePrecision = Double.MIN_VALUE;
        double maxDoublePrecision = Double.MAX_VALUE;
        System.out.println("Double Precision Double Minimum Value = " + minDoublePrecision);
        System.out.println("Double Precision Double Maximum Value = " + maxDoublePrecision);

        // Declaration of primitive types
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


        // Variable with decimals default to double
        // Use casting or punctuate with "f" to declare single precision
        float floatValue = (float) 5.24;
        double doubleValue = 5.24;

        // Operations
        // Double is preferred - faster on modern computers and more precise
        int myIntValue1 = 5 / 2;
        float myFloatValue1 = 5f / 2f;
        double myDoubleValue1 = 5d / 2d;
        System.out.println("MyIntValue / 2 = " + myIntValue1);
        System.out.println("MyFloatValue / 2f = " + myFloatValue1);
        System.out.println("MyDoubleValue / 2d = " + myDoubleValue1);

        int myIntValue2 = 5 / 3;
        float myFloatValue2 = 5f / 3f;
        double myDoubleValue2 = 5d / 3d;
        System.out.println("MyIntValue / 3 = " + myIntValue2);
        System.out.println("MyFloatValue / 3f = " + myFloatValue2);
        System.out.println("MyDoubleValue / 3d = " + myDoubleValue2);

    }
}
