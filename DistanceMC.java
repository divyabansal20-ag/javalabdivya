public class DistanceMC {

    int m = 5;
    int cm = 80;

    void add() {

        int m2 = 3;
        int cm2 = 50;

        int total_cm = cm + cm2;

        int carry_m = total_cm / 100;
        cm = total_cm % 100;

        m = m + m2 + carry_m;

        System.out.println("Total Distance = "
                + m + "m "
                + cm + "cm");
    }

    public static void main(String args[]) {

        DistanceMC d = new DistanceMC();

        d.add();

    }
}
