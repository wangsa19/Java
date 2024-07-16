package com.tutorial;

public class Main
{
    public static void main(String[] args) {
        // tipe data di java:
        // integer, byte, short, long, double, char, boolean
        int i = 2147483647;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer i = " + (i+1));
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + "bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + "bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte = " + Byte.BYTES + "bytes");
        System.out.println("Besar byte = " + Byte.SIZE + "bit");

        // short (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai short s = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar short = " + Short.BYTES + "bytes");
        System.out.println("Besar short = " + Short.SIZE + "bit");

        // long (satuan)
        long l = 10L;
        System.out.println("=====LONG=====");
        System.out.println("nilai long l = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + "bytes");
        System.out.println("Besar long = " + Long.SIZE + "bit");

        // double (koma, bil real)
        double d = 10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai double d = " + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar double = " + Double.BYTES + "bytes");
        System.out.println("Besar double = " + Double.SIZE + "bit");

        // float (koma, bil real)
        float f = -8.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai float f = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar float = " + Float.BYTES + "bytes");
        System.out.println("Besar float = " + Float.SIZE + "bit");

        // char (koma, bil real)
        char c = 'C';
        System.out.println("=====CHAR=====");
        System.out.println("nilai char c = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("Besar char = " + Character.BYTES + "bytes");
        System.out.println("Besar char = " + Character.SIZE + "bit");

        // boolean (koma, bil real)
        boolean val = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean val = " + val);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);
    }
}
