package javaCore.oop;

class Hogwarts {
    private final String fullName;
    private int powerOfMagic;
    private int transgressionDistance;

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
}
