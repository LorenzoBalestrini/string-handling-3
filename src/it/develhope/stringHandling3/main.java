package it.develhope.stringHandling3;

public class main {
    public static void main(String[] args) {

        String[] array1 = new String[]{" I want ", " to learn ", " how to code! "};
        String[] array2 = new String[]{array1[0].trim(), array1[1].trim(), array1[2].trim()};

        System.out.println(!(array2[0].compareTo("I want") > array2[1].compareToIgnoreCase("To learn")));

    }
}
