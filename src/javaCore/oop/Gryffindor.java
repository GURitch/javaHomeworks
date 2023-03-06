package javaCore.oop;

class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Благородство: " + nobility + '\n' +
                "Честь: " + honor + '\n' +
                "Храбрость: " + courage + '\n'
                ;
    }

    @Override
    int getAttributesSum() {
        return nobility + honor + courage;
    }

    void printCompareGryffindorStudents(Gryffindor student) {
        if (getAttributesSum() > student.getAttributesSum()) {
            System.out.println(getFullName() + " лучший Гриффиндорец, чем " + student.getFullName());
        } else if (getAttributesSum() < student.getAttributesSum()) {
            System.out.println(student.getFullName() + " лучший Гриффиндорец, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " такой же Гриффиндорец, как " + student.getFullName());
        }
    }

}
