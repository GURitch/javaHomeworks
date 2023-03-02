package javaCore.oop;

class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String fullName, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Трудолюбие: " + diligence + '\n' +
                "Верность: " + loyalty + '\n' +
                "Честность: " + honesty + '\n'
                ;
    }
}
