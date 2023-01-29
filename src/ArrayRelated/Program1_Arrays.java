package ArrayRelated;
public class Program1_Arrays {
        public static void main(String[] args)
        {
            //******************************************************************************
            //Array of Integers
            int[] arr = new int[5];

            //to fetch the class of an array that has component of type integers
            //here arr is of class [I
            //[I is the run time type signature for class object "array with component type int"
            System.out.println(arr.getClass());

            //to fetch the superclass of an array that has component of type integers
            //super class for any type of array is "Object"-->java.lang.Object(Where java.lang is the package name &
            //Object is the class name
            System.out.println(arr.getClass().getSuperclass());
            //******************************************************************************
            //Array of Characters
            char[] chr = new char[5];

            //to fetch the class of an array that has component of type character
            //here chr is of Class [C
            //[C is the run time type signature for class object "array with component type char"
            System.out.println(chr.getClass());

            //to fetch the superclass of an array that has component of type character
            //super class for any type of array is "Object"-->java.lang.Object(Where java.lang is the package name &
            //Object is the class name
            System.out.println(chr.getClass().getSuperclass());
            //Array of strings

            byte[] arrybyte = new byte[5];
            System.out.println(arrybyte.getClass());
            System.out.println(arrybyte.getClass().getSuperclass());

            long[] arrlong = new long[5];
            System.out.println(arrlong.getClass());
            System.out.println(arrlong.getClass().getSuperclass());

            short[] arryshort = new short[5];
            System.out.println(arryshort.getClass());
            System.out.println(arryshort.getClass().getSuperclass());

            boolean[] arrybool = new boolean[5];
            System.out.println(arrybool.getClass());
            System.out.println(arrybool.getClass().getSuperclass());//[Z is for Boolean

            float[] arryfloat = new float[5];
            System.out.println(arryfloat.getClass());
            System.out.println(arryfloat.getClass().getSuperclass());

            //******************************************************************************
            //Array of Strings
            String[] arrstr = new String[5];

            //to fetch the class of an array that has component of type strings
            //arrstr is of class [C
            //where [C is the run time type signature for Class object("array with component type of class")
            //Followed by name of the Class
            System.out.println(arrstr.getClass());

            //to fetch the superclass of an array that has component of type string
            //super class for any type of array is "Object"-->java.lang.Object(Where java.lang is the package name &
            //Object is the class name
            System.out.println(arrstr.getClass().getSuperclass());
            //Array of strings
            //******************************************************************************

        }
    }
