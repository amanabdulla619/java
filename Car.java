class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota");

        // c.model = "BMW";  // Error: model has private access

        c.showModel();       // Correct way to access model
    }
}
