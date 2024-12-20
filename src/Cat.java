public class Cat implements Animal {

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Cat food";
    }
}
