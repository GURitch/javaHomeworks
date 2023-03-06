package javaCore.oop;

class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;


    public Slytherin(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Хитрость: " + cunning + '\n' +
                "Решительность: " + determination + '\n' +
                "Амбициозность: " + ambition + '\n' +
                "Находчивость: " + resourcefulness + '\n' +
                "Жажда власти: " + thirstForPower + '\n'
                ;
    }

    @Override
    int getAttributesSum() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    void printCompareSlytherinStudents(Slytherin student) {
        if (getAttributesSum() > student.getAttributesSum()) {
            System.out.println(getFullName() + " лучший Слизеринец, чем " + student.getFullName());
        } else if (getAttributesSum() < student.getAttributesSum()) {
            System.out.println(student.getFullName() + " лучший Слизеринец, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " такой же Слизеринец, как " + student.getFullName());
        }
    }
}
