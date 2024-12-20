public class Bird implements Animal {

    @Override
    public String makeSound() {
        return "chik-chirick";
    }

    @Override
    public String eat() {
        return "Bird eat";
    }
}
