public class kolo implements Figure {
    private int diameter;

    public kolo(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void getSquare(){
        System.out.println("kolo Square = : " + diameter * diameter / 4 * 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091);
    }
}