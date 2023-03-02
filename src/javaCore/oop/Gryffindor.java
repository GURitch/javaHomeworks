package javaCore.oop;

class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

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

}
