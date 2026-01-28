import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter the number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix 1: ");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        
        System.out.println("Enter elements for Matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }					
        
       
        System.out.println("Enter the number of rows for Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns for Matrix 2: ");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        
        System.out.println("Enter elements for Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }					
        
       
        if (r1 == r2 && c1 == c2) {
            int[][] sum = new int[r1][c1];
            System.out.println("Addition of Matrix: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                    System.out.print(sum[i][j] + " "); 
                }
                System.out.println(); 
            }
        } else {
            System.out.println("Addition is Not Possible.");
        }
        
        sc.close();
    }
}

