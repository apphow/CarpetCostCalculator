public class Main {

    public static void main(String[] args) {


        Floor floor = new Floor(2.75, 4.0);
        Carpet carpet = new Carpet(3.5);

        Calculator calculator = new Calculator(floor, carpet);
        Carpet carpet1 = new Carpet(1.5);
        Floor floor1 = new Floor(5.4, 4.5);
        Calculator calculator1 = new Calculator(floor, carpet);

        System.out.println("total= " + calculator.getTotalCost());
    }
}
