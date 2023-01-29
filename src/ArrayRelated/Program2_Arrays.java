package ArrayRelated;

import java.util.Arrays;

public class Program2_Arrays {

    //Sorting in different types of Arrays
    public static void main(String[]args) {

//***************************************************************************************
        //Array Of Integers
        //Initializing an integer array of size 2
        int[] intarr = new int[2];

        //Inserting data in an Array
        for (int i = 0; i <= intarr.length-1; i++) {
            intarr[i]=i;
        }
        System.out.println("**** Please find below Array of Integers details **********");
        //Printing Integer Array
        for (int i = 0; i <= intarr.length-1; i++) {
            System.out.println("Element at index "+i+" is "+intarr[i]);
        }

        //Sorting using built-in function
        Arrays.sort(intarr);

        //Printing Values after sorting
        for (int i = 0; i <= intarr.length-1; i++) {
            System.out.println("Element at index "+i+" is "+intarr[i]);
        }

//***************************************************************************************
        //Array Of characters
        //Initializing an character array of size 2
        char[] arrchar = new char[2];

        //Inserting data in an Array

        arrchar[0]='z';
        arrchar[1]='a';

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing Integer Array
        for (int i = 0; i <= arrchar.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrchar[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrchar);

        //Printing Values after sorting
        for (int i = 0; i <= arrchar.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrchar[i]);
        }
//***************************************************************************************
        //Array Of String
        //Initializing String array of size 2
        String[] arrstr = new String[2];

        //Inserting data in an Array

        arrstr[0]="Welcome!";
        arrstr[1]="All";

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing Integer Array
        for (int i = 0; i <= arrstr.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrstr[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrstr);

        //Printing Values after sorting
        for (int i = 0; i <= arrstr.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrstr[i]);
        }

//***************************************************************************************


//***************************************************************************************
        //Array Of Long datatype
        //Initializing Long array of size 2
        long[] arrlong = new long[2];

        //Inserting data in an Array

        arrlong[0]=30000000000000000L;
        arrlong[1]=20000000000000000L;

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing Long Array
        for (int i = 0; i <= arrlong.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrlong[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrlong);

        //Printing Values after sorting
        for (int i = 0; i <= arrlong.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrlong[i]);
        }
//***************************************************************************************
//The short data type in Java is a primitive type used to represent 16-bit signed integers. It has a range of values from -32768 to 32767.
        //Array Of Short datatype
        //Initializing short array of size 2
        short[] arrshort = new short[2];

        //Inserting data in an Array
        arrshort[0]=3267;
        arrshort[1]=-3268;

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing Long Array
        for (int i = 0; i <= arrlong.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrlong[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrlong);

        //Printing Values after sorting
        for (int i = 0; i <= arrlong.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrlong[i]);
        }
//**********************************************************************************************************************
//The double data type in Java is a primitive type used to represent double-precision floating-point numbers.
// A double-precision floating-point number has a larger range and precision compared to the single-precision floating-point float data type.
// In Java, a double value can represent a wide range of real numbers with approximately 15 to 16 decimal digits of precision.
        //Array Of doubles
        //Initializing double array of size 2
        double[] arrdouble = new double[2];

        //Inserting data in an Array

        arrdouble[0]=3.2;
        arrdouble[1]=1.6;

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing double Array
        for (int i = 0; i <= arrdouble.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrdouble[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrdouble);

        //Printing Values after sorting
        for (int i = 0; i <= arrdouble.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrdouble[i]);
        }
//*************************************************************************************************************
//single-precision floating-point numbers.
// A single-precision floating-point number has a smaller range and precision compared to the double-precision floating-point double data type.
// In Java, a float value can represent a wide range of real numbers with approximately 7 decimal digits of precision.
        //Array Of Float datatype
        //Initializing Float array of size 2
        float[] arrfloat = new float[2];

        //Inserting data in an Array
        arrfloat[0]=3267;
        arrfloat[1]=-3268;

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing float Array
        for (int i = 0; i <= arrfloat.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrfloat[i]);
        }

        //Sorting using built-in function
        Arrays.sort(arrfloat);

        //Printing Values after sorting
        for (int i = 0; i <= arrfloat.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrfloat[i]);
        }

//*****************************************************************************************
        //Very Important we cannot do sorting on Array of booleans
        //As a result it is commented
        //The boolean data type in Java is a primitive type that can have only two possible values: true or false.
        // The Arrays.sort() method is used to sort arrays of type int, long, short, char, byte, float, or double.
        // The boolean type is not a valid argument for the Arrays.sort() method.

        //Array Of boolean datatype
        //Initializing Boolean array of size 2
        boolean[] arrboolean = new boolean[2];

        //Inserting data in an Array
        arrboolean[0]=false;
        arrboolean[1]=true;

        System.out.println("**** Please find below Array of Characters details **********");

        //Printing boolean Array
        for (int i = 0; i <= arrboolean.length-1; i++) {
            System.out.println("Element at index "+i+" is "+arrboolean[i]);
        }

        //Sorting using built-in function
        //Arrays.sort(arrboolean);

    }

}
