package _1_introductionAndSyntax._1_4_cycles;

class Main {
    public static void main(String[] args) {
        task1(); // Вызов метода task1
        task2(); // Вызов метода task2
        task3(); // Вызов метода task3
        task4(); // Вызов метода task4
        task5(); // Вызов метода task5
        task6(); // Вызов метода task6
        task7(); // Вызов метода task7
        task8(); // Вызов метода task8
        task9(); // Вызов метода task9
        task10(); // Вызов метода task10

    }
    public static void task1() {  // В этом методе:

        System.out.println("Задача 1"); // Выводим в консоль название метода (задачи)

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task2() {  // В этом методе:

        System.out.println("Задача 2"); // Выводим в консоль название метода (задачи)

        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task3() {  // В этом методе:

        System.out.println("Задача 3"); // Выводим в консоль название метода (задачи)

        for(int i=0; i<=17; i+=2){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task4() {  // В этом методе:

        System.out.println("Задача 4"); // Выводим в консоль название метода (задачи)

        for(int i=10; i>=-10; i--){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void task5() {  // В этом методе:

        System.out.println("Задача 5"); // Выводим в консоль название метода (задачи)

        for(int i=1904; i<=2096; i+=4){
            System.out.println(i+" год является високосным");
        }
        System.out.println();
    }
    public static void task6() {  // В этом методе:

        System.out.println("Задача 6"); // Выводим в консоль название метода (задачи)

        for(int i=7; i<=98; i+=7){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }
    public static void task7() {  // В этом методе:

        System.out.println("Задача 7"); // Выводим в консоль название метода (задачи)

        for(int i=1; i<=512; i*=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }
    public static void task8() {  // В этом методе:

        System.out.println("Задача 8"); // Выводим в консоль название метода (задачи)

        int number = 29000;
        int total = 0;
        for(int i=1; i<=12; i++){
            total = total + number;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println();
    }
    public static void task9() {  // В этом методе:

        System.out.println("Задача 9"); // Выводим в консоль название метода (задачи)

        int number = 29000;
        int total = 0;
        for(int i=1; i<=12; i++){
            total = total + total/100;
            total = total + number;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println();
    }
    public static void task10() {  // В этом методе:

        System.out.println("Задача 10"); // Выводим в консоль название метода (задачи)

        int number = 2;
        for(int i=1; i<=10; i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
        System.out.println();
    }
}
