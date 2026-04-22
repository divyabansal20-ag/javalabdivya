public class Array1D {

    int arr[] = {10,20,30,40,50};

    void output1() {

        System.out.println("Array Elements:");

        for(int i=0;i<5;i++) {

            System.out.print(arr[i]+" ");

        }
    }

    void output2() {

        int sum=0;

        for(int i=0;i<5;i++) {

            sum=sum+arr[i];

        }

        System.out.println("\nSum = "+sum);
    }

    void reverse() {

        System.out.println("Reverse Array:");

        for(int i=4;i>=0;i--) {

            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String args[]) {

        Array1D a=new Array1D();

        a.output1();
        a.output2();
        a.reverse();

    }
}
