package Topic6_Arrays;

public class MultidimensionalArrays {

    public static void main (String [] args) {

        int[][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

       // System.out.println("Value is " + a[0][2]);

        int[] [] b = {{1,2,3},{2,3,4}};
       // System.out.println("Direct Value is " + a[1][2]);

        for(int i=0; i<b.length+1; i++){
            System.out.println("Direct Value is " + b[0][i] + " Second index values "+ b[1][i]);
        }

    }


}
