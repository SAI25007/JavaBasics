package Topic6_Arrays;

public class Arrays {

    public static void main (String [] args) {

        //Memory allocation for the array individually
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 4;
        a[3] = 6;
        a[4] = 8;

        for(int i=0; i<a.length; i++){
            System.out.println("Value is " + a[i]);
        }

        //Direct allocation
        int[] b = {1,4,5,7,8,9};

        for(int i=0; i<b.length; i++){
            System.out.println("Direct Value is " + b[i]);
        }

    }
}
