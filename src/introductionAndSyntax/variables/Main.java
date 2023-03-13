package introductionAndSyntax.variables;

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

        var dog = 8.0;
        var cat = 3.6;            // Объявляем и инициализируем переменные
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);  // Выводим значения в консоль
        System.out.println(paper);
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task2() {  // В этом методе:

        System.out.println("Задача 2"); // Выводим в консоль название метода (задачи)

        var dog = 8.0 + 4;
        var cat = 3.6 + 4;        // Объявляем и инициализируем переменные, прибавляем к каждой 4
        var paper = 763789 + 4;

        System.out.println(dog);
        System.out.println(cat);  // Выводим значения в консоль
        System.out.println(paper);
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task3() {  // В этом методе:

        System.out.println("Задача 3"); // Выводим в консоль название метода (задачи)

        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;        // Объявляем и инициализируем переменные, вычитаем значения
        var paper = 763789 - 7639;

        System.out.println(dog);
        System.out.println(cat);  // Выводим значения в консоль
        System.out.println(paper);
        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task4() {  // В этом методе:

        System.out.println("Задача 4"); // Выводим в консоль название метода (задачи)

        var friend = 19;  // Объявляем и инициализируем переменную числом 19
        System.out.println(friend); // Выводим значение в консоль

        friend += 2; // Прибавляем к переменной 2 и записываем в нее же полученный результат
        System.out.println(friend); // Выводим значение в консоль

        friend /= 7; // Делим переменную на 7 и записываем в нее же полученный результат
        System.out.println(friend); // Выводим значение в консоль

        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task5() {  // В этом методе:

        System.out.println("Задача 5"); // Выводим в консоль название метода (задачи)

        var frog = 3.5;  // Объявляем и инициализируем переменную числом 3.5
        System.out.println(frog); // Выводим значение в консоль

        frog *= 10; // Увеличиваем переменную в 10 раз и записываем в нее же полученный результат
        System.out.println(frog); // Выводим значение в консоль

        frog /= 3.5; // делим переменную на 3.5 и записываем в нее же полученный результат
        System.out.println(frog); // Выводим значение в консоль

        frog += 4; // Прибавляем к переменной 4 и записываем в нее же полученный результат
        System.out.println(frog); // Выводим значение в консоль

        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task6() {  // В этом методе:

        System.out.println("Задача 6"); // Выводим в консоль название метода (задачи)

        var weightFirstBoxer = 78.2; // Вес первого боксера
        var weightSecondBoxer = 82.7; // Вес второго боксера

        var totalWeightBoxer = weightFirstBoxer + weightSecondBoxer; // Общий вес
        System.out.println("Общий вес боксеров - " + totalWeightBoxer + " кг"); // Выводим значение в консоль

        var weightDifferenceBoxer = weightSecondBoxer - weightFirstBoxer; // Разница в весе
        System.out.println("Разница в весе боксеров - " + weightDifferenceBoxer + " кг"); // Выводим значение в консоль

        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task7() {  // В этом методе:

        System.out.println("Задача 7"); // Выводим в консоль название метода (задачи)

        var weightFirstBoxer = 78.2; // Вес первого боксера
        var weightSecondBoxer = 82.7; // Вес второго боксера

        var weightDifference1 = weightSecondBoxer - weightFirstBoxer; // Разница в весе через вычитание
        System.out.println("Разница в весе боксеров - " + weightDifference1 + " кг"); // Выводим значение в консоль

        var weightDifference2 = weightSecondBoxer % weightFirstBoxer; // Разница в весе через остаток от деления
        System.out.println("Разница в весе боксеров - " + weightDifference2 + " кг"); // Выводим значение в консоль

        System.out.println();     // Пустая строка, разделяет вывод в консоли
    }
    public static void task8() {  // В этом методе:

        System.out.println("Задача 8"); // Выводим в консоль название метода (задачи)

        var totalHours = 640;
        var workingHours = 8;

        var totalEmployees = totalHours / workingHours; // Находим колличество работников
        System.out.println("Всего работников в компании - " + totalEmployees + " человек"); // Выводим в консоль

        var changeNumberEmployees = 94; // Отдельная переменная позволит, при ее изменении, автоматически пересчитывать все в выводе
        var totalHoursIfChangeNumberEmployees = (totalEmployees + changeNumberEmployees) * workingHours; // Можно было не создавать отдельную переменную, а использовать выражение в выводе
        System.out.println("Если в компании работает " + (totalEmployees + changeNumberEmployees) + " человек, то всего " + totalHoursIfChangeNumberEmployees + " часов работы может быть поделено между сотрудниками");
    }
}
