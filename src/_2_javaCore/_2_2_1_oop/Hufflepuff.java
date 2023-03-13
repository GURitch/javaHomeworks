package _2_javaCore._2_2_1_oop;

class Hufflepuff extends Hogwarts {
    private final int diligence;
    private final int loyalty;
    private final int honesty;

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

    @Override
    int getAttributesSum() {
        return diligence + loyalty + honesty;
    }

    void printCompareHufflepuffStudents(Hufflepuff student) {
        if (getAttributesSum() > student.getAttributesSum()) {
            System.out.println(getFullName() + " лучший Хаффлпаффец, чем " + student.getFullName());
        } else if (getAttributesSum() < student.getAttributesSum()) {
            System.out.println(student.getFullName() + " лучший Хаффлпаффец, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " такой же Хаффлпаффец, как " + student.getFullName());
        }
    }
}
