package _1_introductionAndSyntax._1_5_1_arrays;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = new String[]{"one", "two", "three" };
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = new String[]{"one", "two", "three" };

        for (int i = 0; i < array1.length; i++) {
            if (i + 1 == array1.length) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = 0; i < array2.length; i++) {
            if (i + 1 == array2.length) {
                System.out.println(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }

        for (int i = 0; i < array3.length; i++) {
            if (i + 1 == array3.length) {
                System.out.println(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = new String[]{"one", "two", "three" };

        for (int i = array1.length - 1; i >= 0; --i) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.println(array1[i]);
            }
        }

        for (int i = array2.length - 1; i >= 0; --i) {
            if (i != 0) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.println(array2[i]);
            }
        }

        for (int i = array3.length - 1; i >= 0; --i) {
            if (i != 0) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.println(array3[i]);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
