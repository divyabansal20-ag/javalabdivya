public class JoinDemo extends Thread {

    String name;

    JoinDemo(String n){
        name=n;
    }

    public void run(){

        for(int i=1;i<=5;i++){

            System.out.println(name+" : "+i);

        }
    }

    public static void main(String args[]) {

        try{

            JoinDemo t1=new JoinDemo("Thread1");
            JoinDemo t2=new JoinDemo("Thread2");
            JoinDemo t3=new JoinDemo("Thread3");

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();

        }

        catch(Exception e){

            System.out.println(e);

        }
    }
}
