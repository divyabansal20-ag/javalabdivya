class AgeException extends Exception {

    AgeException(String msg){

        super(msg);

    }
}

public class AgeExceptionDemo {

    static void checkAge(int age)
    throws AgeException{

        if(age<18)

            throw new AgeException("Invalid Age");

        else

            System.out.println("Valid Age");

    }

    public static void main(String args[]){

        try{

            checkAge(15);

        }

        catch(Exception e){

            System.out.println(e);

        }

    }
}
