package _2_javaCore._2_2_oop;

class Ravenclaw extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creation;

    public Ravenclaw(String fullName, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Ум: " + mind + '\n' +
                "Мудрость: " + wisdom + '\n' +
                "Остроумие: " + wit + '\n' +
                "Творчество: " + creation + '\n'
                ;
    }

    @Override
    int getAttributesSum() {
        return mind + wisdom + wit + creation;
    }

    void printCompareRavenclawStudents(Ravenclaw student) {
        if (getAttributesSum() > student.getAttributesSum()) {
            System.out.println(getFullName() + " лучший Равенкловец, чем " + student.getFullName());
        } else if (getAttributesSum() < student.getAttributesSum()) {
            System.out.println(student.getFullName() + " лучший Равенкловец, чем " + getFullName());
        } else {
            System.out.println(getFullName() + " такой же Равенкловец, как " + student.getFullName());
        }
    }
}
