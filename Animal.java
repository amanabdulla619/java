class Animal {
    String species;   // default access

    Animal(String species) {
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Lion");

        // Accessing species directly
        System.out.println("Species: " + a.species);

        // Accessing through method
        a.displaySpecies();
    }
}
