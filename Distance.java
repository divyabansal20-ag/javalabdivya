public class Distance {

    int m, cm, mm;

    void input1() {
        m = 2;
        cm = 45;
        mm = 6;
    }

    void input2() {
        int m2 = 3;
        int cm2 = 70;
        int mm2 = 5;

        int total_mm = mm + mm2;
        int carry_cm = total_mm / 10;
        mm = total_mm % 10;

        int total_cm = cm + cm2 + carry_cm;
        int carry_m = total_cm / 100;
        cm = total_cm % 100;

        m = m + m2 + carry_m;

        System.out.println("Total Distance = "
                + m + "m "
                + cm + "cm "
                + mm + "mm");
    }

    public static void main(String args[]) {

        Distance d = new Distance();

        d.input1();
        d.input2();

    }
}
