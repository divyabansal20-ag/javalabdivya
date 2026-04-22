public class TimeHM {

    int h = 4;
    int m = 45;

    void add() {

        int h2 = 2;
        int m2 = 30;

        int total_m = m + m2;

        int carry_h = total_m / 60;
        m = total_m % 60;

        h = h + h2 + carry_h;

        System.out.println("Total Time = "
                + h + ":"
                + m);
    }

    public static void main(String args[]) {

        TimeHM t = new TimeHM();

        t.add();

    }
}
