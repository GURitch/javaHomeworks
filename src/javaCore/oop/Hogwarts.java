package javaCore.oop;

 abstract class Hogwarts {
    private final String fullName;
    private final int powerOfMagic;
    private final int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Имя: " + fullName + '\n' +
                "Сила магии: " + powerOfMagic + '\n' +
                "Дистанция трансгрессии: " + transgressionDistance + '\n'
                ;
    }

    abstract int getAttributesSum();

    void printCompareHogwartsStudents(Hogwarts student) {
        System.out.print(getFullName());
        if (getPowerOfMagic() > student.getPowerOfMagic()) {
            System.out.print(" обладает бОльшей силой магии");
        } else if (getPowerOfMagic() < student.getPowerOfMagic()) {
            System.out.print(" обладает меньшей силой магии");
        } else {
            System.out.print(" обладает такой же силой магии");
        }
        if (getTransgressionDistance() > student.getTransgressionDistance()) {
            System.out.print(" и бОльшим расстоянием трансгрессии, чем ");
        } else if (getTransgressionDistance() < student.getTransgressionDistance()) {
            System.out.print(" и меньшим расстоянием трансгрессии, чем ");
        } else {
            System.out.print(" и таким же расстоянием трансгрессии, как ");
        }
        System.out.println(student.getFullName());
    }
}
