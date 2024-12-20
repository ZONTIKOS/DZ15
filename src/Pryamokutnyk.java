public class Pryamokutnyk implements Figure {
    private int storona1;
    private int storona2;

    public Pryamokutnyk(int storona1, int storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }

    @Override
    public void getSquare() {
        System.out.println("Pryamokutnyk  Square = " + storona1 * storona2);
    }

}
