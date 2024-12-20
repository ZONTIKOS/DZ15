public class Dog implements Animal {

    @Override
    public String makeSound() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "Dog food";
    }
}
