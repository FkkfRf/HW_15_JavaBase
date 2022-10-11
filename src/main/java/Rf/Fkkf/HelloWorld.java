package rf.fkkf;

public class HelloWorld {
    public static void main(String[] args) {

        boolean flag;

        // присвоение значений больше, чем диапазон
        byte mByte1 = (byte) 128;     // 8бит	-128/127
        byte mByte2 = (byte) 129;
        byte sumByte = (byte) (mByte1 + mByte2);

        System.out.println("Set byte: 128 + 129");
        System.out.println("Out byte : " + mByte1 + " + " + mByte2 + " = " + sumByte);

        short mShort1 = (short) 32770;      // 16бит (-32768 / 32767)
        short mShort2 = 5;
        short sumShort = (short) (mShort1 + mShort2);

        System.out.println("Set short: 32770 + 5");
        System.out.println("Out short: " + mShort1 + "+" + mShort2 + "=" + sumShort);

        int mInt1 = 3;        // 32 бит	-2147483648	2147483647
        int mInt2 = 8;

        long mlong ;            // 64 бит   -9223372036854775808	9223372036854775807

        float mFloat1 = (float) 0.01;   // 4 байта -3.4*10^38 до 3.4*10^38
        float mFloat2 = (float) 0.1;   // 4 байта -3.4*10^38 до 3.4*10^38
        double mDouble1 = 0.01; // 8 байт  (от ±4.9*10^-324 до ±1.7976931348623157*10^308)
        double mDouble2 = 0.1; // 8 байт  (от ±4.9*10^-324 до ±1.7976931348623157*10^308)

        System.out.println("\n Out Int: " + mInt2 + " / " + mInt1 + " = " + (mInt2 / mInt1) );
        System.out.println("Out Int: " + mInt2 + " % " + mInt1 + " = " + (mInt2 % mInt1) );
        System.out.println("Out take Int2 if Int2>Int1 else take Int1 : \n mInt2 > mInt1 ? take Int2 : take Int1 =  " + (mInt2 > mInt1 ? mInt2 : mInt1) );
        System.out.println("Out take Int2 if Int2<Int1 else take Int1 : \n mInt2 > mInt1 ? take Int2 : take Int1 =  " + (mInt2 < mInt1 ? mInt2 : mInt1) );

        System.out.println("\n Out Float: " + mFloat2 + " - " + mFloat1 + " = " + (mFloat2 - mFloat1));
        System.out.println("Out Float: " + mFloat2 + " / " + mFloat1 + " = " + (mFloat2 / mFloat1));
        System.out.println("Out Float: " + mFloat2 + " % " + mFloat1 + " = " + (mFloat2 % mFloat1));
        System.out.println("\n Out Double: " + mDouble2 + " - " + mDouble1 + " = " + (mDouble2 - mDouble1));
        System.out.println("Out Double: " + mDouble2 + " / " + mDouble1 + " = " + (mDouble2 / mDouble1));
        System.out.println("Out Double: " + mDouble2 + " % " + mDouble1 + " = " + (mDouble2 % mDouble1));

        System.out.println("\n Out false : \n mInt1 > mInt2 AND mDouble1 > mFloat1 = " + (mInt1 > mInt2 && mDouble1 > mFloat1) );
        System.out.println("Out true : \n mInt1 > mInt2 OR mDouble1 > mFloat1 = " + (mInt1 > mInt2 || mDouble1 > mFloat1) );

        System.out.println("\n Out Int+Doble: " + mInt1 + " + " + mDouble1 + " = " + (mInt1 + mDouble1) );
        System.out.println("Out Int-Doble: " + mInt1 + " - " + mDouble1 + " = " + (mInt1 - mDouble1) );
        System.out.println("Out Int/Floate: " + mInt1 + " / " + mFloat1 + " = " + (mInt1 / mFloat1) );
        System.out.println("Out Int*Doble: " + mInt1 + " * " + mDouble1 + " = " + (mInt1 * mDouble1) );
    }
}
