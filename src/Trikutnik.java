public class Trikutnik implements Figure {
    int osnova;
    int visota;

    public Trikutnik(int osnova, int visota) {
        this.osnova = osnova;
        this.visota = visota;
    }

    @Override
    public void getSquare() {
        System.out.println("Trikutnik Square:" + (0.5 * osnova + visota * 0.5));
    }
}
