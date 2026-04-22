public class ThreadDemo extends Thread {

    String name;

    ThreadDemo(String n) {
        name = n;
    }

    public void run() {

        for(int i=1;i<=100;i++) {

            System.out.println(name + " : " + i);

        }
    }

    public static void main(String args[]) {

        ThreadDemo t1=new ThreadDemo("Thread1");
        ThreadDemo t2=new ThreadDemo("Thread2");
        ThreadDemo t3=new ThreadDemo("Thread3");

        t1.start();
        t2.start();
        t3.start();

    }
}
