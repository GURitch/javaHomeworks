package _1_introductionAndSyntax._1_3_2_conditionalOperator;

class Main {
    public static void main(String[] args) {
        task1(); // Вызов метода task1
        task2(); // Вызов метода task2
        task3(); // Вызов метода task3
        task4(); // Вызов метода task4
        task5(); // Вызов метода task5
    }

    public static void task1() {  // В этом методе:

        System.out.println("Задача 1"); // Выводим в консоль название метода (задачи)

        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task2() {  // В этом методе:

        System.out.println("Задача 2"); // Выводим в консоль название метода (задачи)
        byte clientOS = 0;
        short clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear == 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }

    public static void task3() {  // В этом методе:

        System.out.println("Задача 3"); // Выводим в консоль название метода (задачи)

        short year = 2100;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }

    public static void task4() {  // В этом методе:

        System.out.println("Задача 4"); // Выводим в консоль название метода (задачи)

        byte deliveryDistance = 100;
        byte countDay = 1;
        if(deliveryDistance<=100){
            if (deliveryDistance > 20) {
                countDay++;
            }
            if (deliveryDistance > 60) {
                countDay++;
            }
            System.out.println("Потребуется днй: " + countDay);
        }else {
            System.out.println("Доставки нет");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }

    public static void task5() {  // В этом методе:

        System.out.println("Задача 5"); // Выводим в консоль название метода (задачи)

        byte monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
}
