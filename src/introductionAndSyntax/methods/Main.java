package introductionAndSyntax.methods;

import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int x) {
        if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            System.out.println(x + " год является високосным");
        } else {
            System.out.println(x + " год не является високосным");
        }
    }

    public static void checkOsAndYear(byte clientOS, short clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static byte checkDelivery(int deliveryDistance) {
        byte countDay = 0;
        if(deliveryDistance<=100){
            countDay++;
            if (deliveryDistance > 20) {
                countDay++;
            }
            if (deliveryDistance > 60) {
                countDay++;
            }
        }
        return countDay;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int year = 1956;
        checkLeapYear(year);
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        short clientDeviceYear = 2023;
        checkOsAndYear(clientOS, clientDeviceYear);
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 58;
        byte countDay = checkDelivery(deliveryDistance);

        if (countDay != 0) {
            System.out.println("Потребуется днй: " + countDay);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
