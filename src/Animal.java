public class Animal {

    private String name;
    private boolean seeIfDog;

    public Animal (String name, boolean seeIfDog) {
        this.name = name;
        this.seeIfDog = seeIfDog;
    }

    public String getName() {
        return name;
    }

    public boolean seeIfDog() {
        return seeIfDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + seeIfDog();
    }
}