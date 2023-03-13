package _2_javaCore._2_2_oop;

class Main {

    static int getRandom() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        System.out.println(dracoMalfoy);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);

        dracoMalfoy.printCompareHogwartsStudents(hermioneGranger);
        System.out.println();
        ronWeasley.printCompareGryffindorStudents(harryPotter);
        System.out.println();
        zachariasSmith.printCompareHufflepuffStudents(cedricDiggory);
        System.out.println();
        zhouChang.printCompareRavenclawStudents(padmaPatil);
        System.out.println();
        dracoMalfoy.printCompareSlytherinStudents(gregoryGoyle);
    }
}
