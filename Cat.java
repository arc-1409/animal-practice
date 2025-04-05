public class Cat extends Animal{
    private String catBreed;

    public Cat(int id, String catBreed) {
        super(id);
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

