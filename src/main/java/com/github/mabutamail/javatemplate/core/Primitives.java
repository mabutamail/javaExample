package com.github.mabutamail.javatemplate.core;
//https://javarush.ru/groups/posts/630-primitivnihe-tipih-v-java--ne-takie-uzh-oni-i-primitivnihe
public class Primitives {
    private static final byte byt = 127;
    private static final short s = 256;
    private static final int i = 0;
    private static final long l = 123_456_78L;
    private static final float f = 123.456F;
    private static final double d = 123.456D;
    private static final char c = 'c';
    private static final boolean b = true;

    public static void main(String[] args) {

        System.out.println("\n\t\t\tТип\t\t\tРазмер\tДиапазон\tЗначение по умолчанию\tПример");
        System.out.println(byt + "\t\t\tbyte\t\t8 bits\t[-128,127] или\t[-2^7 to 2^7-1]\t0\tbyte b = 10;byte b = 0b010;");
        System.out.println(s + "\t\t\tshort\t\t16 bits\t[-32768,32767]\t0\tshort s = 32;\tshort s = ‘A’;");
        System.out.println(i + "\t\t\tint\t\t\t32 bits\t[-2147483648,2147483647]\t0\tint i = 10; int i = ‘A’;");
        System.out.println(l + "\tlong\t\t64 bits\t[-2^63,2^63-1]\t0\tlong l = 3200L; long l = 3200;");
        System.out.println(f + "\t\tfloat\t\t32 bits\t[-3.4E38, 3.4E38]\t0.0f\tfloat f = (float) 12.34;float f = 12.34f;");
        System.out.println(d + "\t\tdouble\t\t64 bits\t[-1.7E308, 1.7E308]\t0.0\tdouble d = 12.34;");
        System.out.println(c + "\t\t\tchar\t\t16 bits\tСимволы Unicode\t‘\\u0000′ или 0\tchar c = ‘A’; char c = ‘\\u0041′; char c = 65; char c = ‘\\t’;");
        System.out.println(b + "\t\tboolean\t\t1 bit\tNA\tfalse\tboolean bool = true;\n\n");


        char c = 'A';
        System.out.println(c); //печатаем A

        char c1 = '\u0041';
        System.out.println(c1); //печатаем A

        char c2 = 0;
        System.out.println("Стандартное значение: " + c2 + ":"); // печатает стандартное значение: :

        char c3 = 65;
        System.out.println(c3); //печатаем A

        char c4 = '\t';
        System.out.println("Табуляция:" + c4 + ":конец табуляции"); //печатаем табуляцию

        byte b = 10;
        System.out.println(b); //печатаем 10

        byte b1 = (byte) 200;
        System.out.println(b1); // печатаем -56
        //<0...>_11001000 (int), конвертируется в 11001000 (byte) путем удаления ведущих 24 бит
        // с левый бит равен 1, нам нужно найти значение
        // дополняет 11001000 -1 = 11000111
        //инвертируем 00111000 т.е 56, следовательно, печатаем 56

        b1 = (byte) 0b11001000;
        System.out.println(b1); //печатаем -56

        byte b2 = (byte) 320; //256+64 i.e 00000000_00000000_00000001_01000000, byte 01000000
        //так как первый бит равен 0, то ничего не мешает определить значение
        System.out.println(b2); //печатаем 64

        short s = 32;
        short s1 = 'A'; //неявное преобразование char в short
        System.out.println(s1); //печатаем 65

        int i = 'A';
        System.out.println(i); //печатаем 65

        long l = 3200L;
        long l1 = 3200;

        float f = 12.34f;

        //примеры
        byte x, y = 1, z = 2;
        x = (byte) (y + z);

    }
}