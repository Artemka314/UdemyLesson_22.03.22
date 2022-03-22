package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 12;
        byte b3 = 0xC;
        byte b4 = 0b1100;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        short s1 = -1_300;
        short s2 = -0x514;
        short s3 = -1300;
        short s4 = 0b1100;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 1;
        int i2 = 0x1;
        int i3 = 1;
        int i4 = 0B0001;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789;
        long l2 = 0x75BCD15;
        long l3 = 123456789;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        float f1 = 12.0f;
        float f2 = 12.4f;

        double d1 = 1212d;
        double d2 = 12.12d;

        boolean bol1 = true;
        boolean bol2 = false;

        char ch = 'z';

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(bol1);
        System.out.println(bol2);
        System.out.println(ch);
    }
}
