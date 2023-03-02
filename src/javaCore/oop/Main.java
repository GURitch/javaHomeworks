package javaCore.oop;

class Main {
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

        printComparisonOfTwoHogwartsStudents(hermioneGranger, dracoMalfoy);
        System.out.println();
        printComparisonOfTwoGryffindorStudents(hermioneGranger, ronWeasley);
        System.out.println();
        printComparisonOfTwoHufflepuffStudents(zachariasSmith, cedricDiggory);
        System.out.println();
        printComparisonOfTwoRavenclawStudents(zhouChang, padmaPatil);
        System.out.println();
        printComparisonOfTwoSlytherinStudents(dracoMalfoy, gregoryGoyle);
    }

    static int getRandom() {
        java.util.Random random = new java.util.Random();
        return random.nextInt(100);
    }

    static void printComparisonOfTwoHogwartsStudents(Hogwarts first, Hogwarts second) {
        System.out.print(first.getFullName());
        if (first.getPowerOfMagic() > second.getPowerOfMagic()) {
            System.out.print(" обладает бОльшей силой магии");
        } else if (first.getPowerOfMagic() < second.getPowerOfMagic()) {
            System.out.print(" обладает меньшей силой магии");
        } else {
            System.out.print(" обладает такой же силой магии");
        }
        if (first.getTransgressionDistance() > second.getTransgressionDistance()) {
            System.out.print(" и бОльшим расстоянием трансгрессии, чем ");
        } else if (first.getTransgressionDistance() < second.getTransgressionDistance()) {
            System.out.print(" и меньшим расстоянием трансгрессии, чем ");
        } else {
            System.out.print(" и таким же расстоянием трансгрессии, как ");
        }
        System.out.println(second.getFullName());
    }

    static void printComparisonOfTwoGryffindorStudents(Gryffindor first, Gryffindor second) {
        if ((first.getCourage() + first.getHonor() + first.getNobility()) > (second.getCourage() + second.getHonor() + second.getNobility())) {
            System.out.println(first.getFullName() + " лучший Гриффиндорец, чем " + second.getFullName());
        } else if ((first.getCourage() + first.getHonor() + first.getNobility()) < (second.getCourage() + second.getHonor() + second.getNobility())) {
            System.out.println(second.getFullName() + " лучший Гриффиндорец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " такой же Гриффиндорец, как " + second.getFullName());
        }
    }

    static void printComparisonOfTwoHufflepuffStudents(Hufflepuff first, Hufflepuff second) {
        if ((first.getDiligence() + first.getHonesty() + first.getLoyalty()) > (second.getDiligence() + second.getHonesty() + second.getLoyalty())) {
            System.out.println(first.getFullName() + " лучший Хаффлпаффец, чем " + second.getFullName());
        } else if ((first.getDiligence() + first.getHonesty() + first.getLoyalty()) < (second.getDiligence() + second.getHonesty() + second.getLoyalty())) {
            System.out.println(second.getFullName() + " лучший Хаффлпаффец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " такой же Хаффлпаффец, как " + second.getFullName());
        }
    }

    static void printComparisonOfTwoRavenclawStudents(Ravenclaw first, Ravenclaw second) {
        if ((first.getMind() + first.getWit() + first.getWisdom() + first.getCreation()) > (second.getMind() + second.getWit() + second.getWisdom() + second.getCreation())) {
            System.out.println(first.getFullName() + " лучший Равенкловец, чем " + second.getFullName());
        } else if ((first.getMind() + first.getWit() + first.getWisdom() + first.getCreation()) < (second.getMind() + second.getWit() + second.getWisdom() + second.getCreation())) {
            System.out.println(second.getFullName() + " лучший Равенкловец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " такой же Равенкловец, как " + second.getFullName());
        }
    }

    static void printComparisonOfTwoSlytherinStudents(Slytherin first, Slytherin second) {
        if ((first.getCunning() + first.getAmbition() + first.getDetermination() + first.getResourcefulness() + first.getThirstForPower()) > (second.getCunning() + second.getAmbition() + second.getDetermination() + second.getResourcefulness() + second.getThirstForPower())) {
            System.out.println(first.getFullName() + " лучший Слизеринец, чем " + second.getFullName());
        } else if ((first.getCunning() + first.getAmbition() + first.getDetermination() + first.getResourcefulness() + first.getThirstForPower()) < (second.getCunning() + second.getAmbition() + second.getDetermination() + second.getResourcefulness() + second.getThirstForPower())) {
            System.out.println(second.getFullName() + " лучший Слизеринец, чем " + first.getFullName());
        } else {
            System.out.println(first.getFullName() + " такой же Слизеринец, как " + second.getFullName());
        }
    }
}
