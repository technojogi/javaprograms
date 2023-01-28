package ArrayRelated;
public class Program1_Arrays {
        public static void main(String[] args)
        {
            //******************************************************************************
            //Array of Integers
            int[] arr = new int[5];

            //to fetch the class of an array that has component of type integers
            System.out.println(arr.getClass());

            //to fetch the superclass of an array that has component of type integers
            System.out.println(arr.getClass().getSuperclass());
            //******************************************************************************
            //Array of Characters
            char[] chr = new char[5];

            //to fetch the class of an array that has component of type integers
            System.out.println(chr.getClass());

            //to fetch the superclass of an array that has component of type integers
            System.out.println(chr.getClass().getSuperclass());
            //Array of strings

            //******************************************************************************
            //Array of Characters
            String[] arrstr = new String[5];

            //to fetch the class of an array that has component of type integers
            System.out.println(arrstr.getClass());

            //to fetch the superclass of an array that has component of type integers
            System.out.println(arrstr.getClass().getSuperclass());
            //Array of strings
            //******************************************************************************

        }
    }