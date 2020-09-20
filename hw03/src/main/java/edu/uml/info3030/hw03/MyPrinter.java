package edu.uml.info3030.hw03;

public class MyPrinter {

    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}
