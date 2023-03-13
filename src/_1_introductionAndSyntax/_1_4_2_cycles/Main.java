package _1_introductionAndSyntax._1_4_2_cycles;

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


    }
    public static void task1() {  // В этом методе:

        System.out.println("Задача 1"); // Выводим в консоль название метода (задачи)

        int total = 0;
        int months = 0;
        while (total<2_459_000){
            total+=15_000;
            months++;
        }
        System.out.println("Месяц "+months+", сумма накоплений равна "+total+" рублей");
        System.out.println();
    }
    public static void task2() {  // В этом методе:

        System.out.println("Задача 2"); // Выводим в консоль название метода (задачи)

        int i = 0;
        while (i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
    }
    public static void task3() {  // В этом методе:

        System.out.println("Задача 3"); // Выводим в консоль название метода (задачи)

        int population = 12_000_000;
        int birthrate1000 = 17;
        int mortality1000 = 8;
        int years = 0;
        while (years<10){
            years++;
            population = population + (population/1000 * (birthrate1000-mortality1000));
        }
        System.out.println("Год "+years+", численность населения составляет: "+population);
        System.out.println();
    }
    public static void task4() {  // В этом методе:

        System.out.println("Задача 4"); // Выводим в консоль название метода (задачи)

        int total = 15000;
        int months = 0;
        while (total<12_000_000){
            total = total +  total * 7 / 100;
            months++;
            System.out.println("Месяц: "+months+", Сумма: "+total);
        }
        System.out.println();
    }
    public static void task5() {  // В этом методе:

        System.out.println("Задача 5"); // Выводим в консоль название метода (задачи)

        int total = 15000;
        int months = 0;
        while (total<12_000_000){
            total = total +  total * 7 / 100;
            months++;
            if(months%6==0){
                System.out.println("Месяц: "+months+", Сумма: "+total);
            }
        }
        System.out.println();
    }
    public static void task6() {  // В этом методе:

        System.out.println("Задача 6"); // Выводим в консоль название метода (задачи)

        int total = 15000;
        int months = 0;
        while (months<108){
            total = total +  total * 7 / 100;
            months++;
            if(months%6==0){
                System.out.println("Месяц: "+months+", Сумма: "+total);
            }
        }
        System.out.println();
    }
    public static void task7() {  // В этом методе:

        System.out.println("Задача 7"); // Выводим в консоль название метода (задачи)

        int friday = 3;
        while (friday<=31){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет");
            friday+=7;
        }
        System.out.println();
    }
    public static void task8() {  // В этом методе:

        System.out.println("Задача 8"); // Выводим в консоль название метода (задачи)

        int year = 0;
        while (year<2124){
            year+=79;
            if (year>1823 && year<2123){
                System.out.println(year);
            }
        }
        System.out.println();
    }
}
