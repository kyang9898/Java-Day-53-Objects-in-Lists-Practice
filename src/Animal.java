public class Animal {

    private String nameOfDog;
    private boolean seeIfDog;

    public Animal (String nameOfDog, boolean seeIfDog) {
        this.nameOfDog = nameOfDog;
        this.seeIfDog = seeIfDog;
    }

    public String getName() {
        return nameOfDog;
    }

    public boolean seeIfDog() {
        return seeIfDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + seeIfDog();
    }
}