public class Matrix {

    int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    int b[][]={
            {9,8,7},
            {6,5,4},
            {3,2,1}
    };

    int c[][]=new int[3][3];

    void addition() {

        System.out.println("Matrix Addition:");

        for(int i=0;i<3;i++) {

            for(int j=0;j<3;j++) {

                c[i][j]=a[i][j]+b[i][j];

                System.out.print(c[i][j]+" ");

            }

            System.out.println();
        }
    }

    void transpose() {

        System.out.println("Transpose:");

        for(int i=0;i<3;i++) {

            for(int j=0;j<3;j++) {

                System.out.print(a[j][i]+" ");

            }

            System.out.println();
        }
    }

    void diagonalSum() {

        int sum=0;

        for(int i=0;i<3;i++) {

            sum=sum+a[i][i];

        }

        System.out.println("Diagonal Sum = "+sum);
    }

    public static void main(String args[]) {

        Matrix m=new Matrix();

        m.addition();
        m.transpose();
        m.diagonalSum();

    }
}
