package _1_introductionAndSyntax._1_3_conditionalOperator;

class Main {
    public static void main(String[] args) {
        task1(); // Вызов метода task1
        task2(); // Вызов метода task2
        task3(); // Вызов метода task3
        task4(); // Вызов метода task4
        task5(); // Вызов метода task5
        task6(); // Вызов метода task6
        task7(); // Вызов метода task7

    }
    public static void task1() {  // В этом методе:

        System.out.println("Задача 1"); // Выводим в консоль название метода (задачи)

        int age = 17;
        if(age>17){
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
    }
    public static void task2() {  // В этом методе:

        System.out.println("Задача 2"); // Выводим в консоль название метода (задачи)

        int temp = 4;
        if(temp>5){
            System.out.println("На улице "+temp+" градусов, можно идти без шапки");
        } else {
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task3() {  // В этом методе:

        System.out.println("Задача 3"); // Выводим в консоль название метода (задачи)

        int speed = 61;
        if(speed>60){
            System.out.println("Если скорость "+speed+", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task4() {  // В этом методе:

        System.out.println("Задача 4"); // Выводим в консоль название метода (задачи)

        int age = 25;
        if(age>=2 && age<=6){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");
        } else if (age>6 && age<=18) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
        } else if (age>18 && age<=24) {
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
        } else if (age>24){
            System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task5() {  // В этом методе:

        System.out.println("Задача 5"); // Выводим в консоль название метода (задачи)

        int age = 15;
        if(age<5){
            System.out.println("Если возраст ребенка равен "+age+", то ему нельзя кататься на аттракционе");
        } else if (age>=5 && age<=14) {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен "+age+", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task6() {  // В этом методе:

        System.out.println("Задача 6"); // Выводим в консоль название метода (задачи)

        int total = 102;
        int sitting = 60;
        int standing = total - sitting;
        int busySitting = 60;
        int busyStanding = 42;
        boolean freeSpace = total>(busyStanding+busySitting);
        if(freeSpace){
            System.out.println("В вагоне осталось "+(sitting-busySitting)+" сидячих и "+(standing-busyStanding)+" стоячих мест");
        } else {
            System.out.println("Все места заняты");
        }
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task7() {  // В этом методе:

        System.out.println("Задача 7"); // Выводим в консоль название метода (задачи)

        int one = 5;
        int two = 5;
        int three = 3;
        if(one>=two && one>=three){
            System.out.println("Число "+one+" самое большое");
        } else if(one<=two && two>=three){
            System.out.println("Число "+two+" самое большое");
        } else {
            System.out.println("Число "+three+" самое большое");
        }
    }
}
