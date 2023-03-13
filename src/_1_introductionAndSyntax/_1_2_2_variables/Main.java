package _1_introductionAndSyntax._1_2_2_variables;

class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        byte myByte = 120;
        short myShort = 30000;
        int myInt = 2000000000;
        long myLong = 9000000000000000000L;

        float myFloat = 1.111111f;
        double myDouble = 9.99999999999999;

        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 1");

        byte myByte = 67;
        short myShort = -159;
        short myShort2 = 569;
        int myInt = 27897;
        long myLong = 987678965549L;

        float myFloat = 27.12f;
        double myDouble = 2.786;

        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myShort2 с типом short равно " + myShort2);
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        byte lyudmilaStudents = 23;
        byte annaStudents = 27;
        byte catherineStudents = 30;
        short totalSheets = 480;
        int tolalStudents = lyudmilaStudents + annaStudents + catherineStudents;
        byte sheetsOneStudent = (byte) (totalSheets / tolalStudents);

        System.out.println("На каждого ученика рассчитано " + sheetsOneStudent + " листов бумаги");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        byte bottlesInTwoMinutes = 16;
        byte bottlesInOneMinutes = (byte) (bottlesInTwoMinutes / 2);

        short bottlesInTwentyMinutes = (short) (bottlesInOneMinutes * 20);
        System.out.println("За 20 минут машина произвела " + bottlesInTwentyMinutes + " штук бутылок");

        short bottlesInOneDay = (short) (60 * 24 * bottlesInOneMinutes);
        System.out.println("За 1 сутки машина произвела " + bottlesInOneDay + " штук бутылок");

        int bottlesInThreeDay = bottlesInOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesInThreeDay + " штук бутылок");

        int bottlesInOneMonth = bottlesInThreeDay * 10; // = bottlesInOneDay * 30
        System.out.println("За 1 месяц машина произвела " + bottlesInOneMonth + " штук бутылок");

        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");

        byte totalCans = 120;
        byte whiteCansForOneClass = 2;
        byte brownCansForOneClass = 4;
        byte totalCansForOneClass = (byte) (whiteCansForOneClass + brownCansForOneClass);
        byte totalClass = (byte) (totalCans / totalCansForOneClass);
        byte totalWhiteCans = (byte) (totalClass * whiteCansForOneClass);
        byte totalBrownCans = (byte) (totalClass * brownCansForOneClass);

        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalWhiteCans+ " банок белой краски и "+totalBrownCans+" банок коричневой краски");
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte bananaWeightInGrams = 80;
        byte milkWeightInGrams = 105;
        byte plombirWeightInGrams = 100;
        byte eggWeightInGrams = 70;

        byte numberOfBanana = 5;
        byte numberOfMilk = 2;
        byte numberOfPlombir = 2;
        byte numberOfEggs = 4;

        int totalBananasInGrams = bananaWeightInGrams * numberOfBanana;
        int totalMilkInGrams = milkWeightInGrams * numberOfMilk;
        int totalPlombirInGrams = plombirWeightInGrams * numberOfPlombir;
        int totalEggsInGrams = eggWeightInGrams * numberOfEggs;

        int breakfastWeightInGrams = totalBananasInGrams + totalMilkInGrams + totalPlombirInGrams + totalEggsInGrams;
        float breakfastWeightInKilograms = breakfastWeightInGrams / 1000f;

        System.out.println("Вес завтрака - "+breakfastWeightInGrams+" грамм ("+breakfastWeightInKilograms+" килограмм)");
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");

        short minGramsPerDay = 250;
        short maxGramsPerDay = 500;
        byte goalInKilograms = 7;
        int goalInGrams = goalInKilograms * 1000;

        int numberOfDaysIfMinGrams = goalInGrams / minGramsPerDay;
        System.out.println("Если сбрасывать по "+minGramsPerDay+" гр в день, то "+goalInKilograms+" кг сбросим за "+numberOfDaysIfMinGrams+" дней");

        int numberOfDaysIfMaxGrams = goalInGrams / maxGramsPerDay;
        System.out.println("Если сбрасывать по "+maxGramsPerDay+" гр в день, то "+goalInKilograms+" кг сбросим за "+numberOfDaysIfMaxGrams+" дней");

        int averageGramsPerDay = (minGramsPerDay + maxGramsPerDay) / 2;
        double numberOfDaysIfAverageGrams = goalInGrams * 1.0 / averageGramsPerDay;
        System.out.println("В среднем, чтобы сбросить "+goalInKilograms+" кг по этой программе, понадобиться "+numberOfDaysIfAverageGrams+" дней");

        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        byte upSalaryPercent = 10;
        float upSalary = upSalaryPercent / 100f + 1;

        int upMashaSalary = (int) (mashaSalary * upSalary);
        int mashaSalaryDifferenceForYear = (upMashaSalary - mashaSalary) * 12;
        System.out.println("Маша теперь получает "+upMashaSalary+" рублей. Годовой доход вырос на "+mashaSalaryDifferenceForYear+" рублей");

        int upDenisSalary = (int) (denisSalary * upSalary);
        int denisSalaryDifferenceForYear = (upDenisSalary - denisSalary) * 12;
        System.out.println("Денис теперь получает "+upDenisSalary+" рублей. Годовой доход вырос на "+denisSalaryDifferenceForYear+" рублей");

        int upChristinaSalary = (int) (christinaSalary * upSalary);
        int christinaSalaryDifferenceForYear = (upChristinaSalary - christinaSalary) * 12;
        System.out.println("Кристина теперь получает "+upChristinaSalary+" рублей. Годовой доход вырос на "+christinaSalaryDifferenceForYear+" рублей");

        System.out.println();
    }
}
