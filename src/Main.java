import java.util.Scanner;

/**
 * Created by samraja on 10/27/2016.
 */
public class Main {
    public static void main(String args[]) {

        //how to find the largest and smallest number in unsorted array
        int[] unsorted = {5,1,2,4,6,3};
        int smallest=unsorted[0];
        int largest=unsorted[0];
        for (int i = 1; i < unsorted.length; i++) {
            if(unsorted[i]>largest){
                largest=unsorted[i];
            } else if(unsorted[i]<smallest){
                smallest=unsorted[i];
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }
}

    /*
        System.out.println("Hello World");
        /*Scanner scan = new Scanner(System.in);
        double mealCost=scan.nextDouble();
        int tipPercent=scan.nextInt();
        int taxPercent=scan.nextInt();
        System.out.println("The total meal cost is " + (int)(Math.round(mealCost + mealCost*tipPercent/100 +  mealCost*taxPercent/100)) + " dollars");
        */
/*        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n < 1) || (n > 6)) {
            System.out.println("Only a 6 X 6 array is allowed");
        }
        int A[][] = new int[n][n];
        int B[][] = new int[10][10];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            for (int arr_j = 0; arr_j < n; arr_j++) {
                A[arr_i][arr_j] = in.nextInt();
            }
        }
        for (int arr_i = 0; arr_i < n; arr_i++) {
            for (int arr_j = 0; arr_j < n; arr_j++) {
                System.out.println(A[arr_i][arr_j]);
            }
        }
        int row = 0;
        int col = 0;
        System.out.println("n = " + n);
        for(int i=0;i<n-2;i++) {
            for (int m = 0; m < n - 2; m++) {
                for (int j = i; j < i + 3; j++) {
                    if (row == 3) {
                        row = 0;
                        System.out.println("");
                    }
                    row++;
                    for (int k = m; k < m + 3; k++) {
                        if (col == 3) {
                            col = 0;
                            System.out.println("");
                        }
                        col++;
                        if (!(((row == 2) & (col == 1)) || ((row == 2) & (col == 3)))) {
                            System.out.print(A[j][k] + " ");
                        }else
                        {
                            System.out.println(" ");
                        }

                    }
                }
            }
        }
        }
    }


*/
