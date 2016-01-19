package p1;

public class Main {

    public static void main(String[] args) {
        int numberOfMonths = 12;
        double[] monthlySales = new double [numberOfMonths];

        for (double each : monthlySales) {
            if (each != 0) {
                System.out.println(each);
            }
        }
    }
}
