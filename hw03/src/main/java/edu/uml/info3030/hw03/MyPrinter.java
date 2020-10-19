package edu.uml.info3030.hw03;

/**
 * This class is my implementation of a generic print array method
 */
public class MyPrinter {

    /**
     * Generic method to
     * @param elementArray array of type T
     */
    public static <T> void printArray(T[] elementArray) {

        // Loop over the array and print out each element as a string
        for (T element : elementArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}
