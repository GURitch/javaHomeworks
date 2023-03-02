package javaCore.oop;

class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

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
}
