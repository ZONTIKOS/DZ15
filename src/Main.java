//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pryamokutnyk pryamokutnyk = new Pryamokutnyk(2,3);
        pryamokutnyk.getSquare();
        Kolo kolo = new Kolo(12);
        kolo.getSquare();
        Trikutnik trikutnik = new Trikutnik(3,4);
        trikutnik.getSquare();




        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        System.out.println("Dog: " + dog.eat()+", " + dog.makeSound());
        System.out.println("Cat: " + cat.eat()+", " + cat.makeSound());
        System.out.println("Bird: " + bird.eat()+", " + bird.makeSound());


    }
}