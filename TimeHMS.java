public class TimeHMS {

    int h = 2;
    int m = 40;
    int s = 50;

    void add() {

        int h2 = 3;
        int m2 = 30;
        int s2 = 20;

        int total_s = s + s2;

        int carry_m = total_s / 60;
        s = total_s % 60;

        int total_m = m + m2 + carry_m;

        int carry_h = total_m / 60;
        m = total_m % 60;

        h = h + h2 + carry_h;

        System.out.println("Total Time = "
                + h + ":"
                + m + ":"
                + s);
    }

    public static void main(String args[]) {

        TimeHMS t = new TimeHMS();

        t.add();

    }
}
