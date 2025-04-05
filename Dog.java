public class Dog extends Animal{
    private String dogBreed;

    public Dog(int id, String dogBreed) {
        super(id);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }
}
