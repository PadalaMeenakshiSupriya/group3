package com.company;
import java.util.*;
public class group3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("enter order");
        m = sc.nextInt();
        n = sc.nextInt();
        int i, j;
        String[][] mat = new String[m][n];
        System.out.println("Matrix elements");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mat[i][j] = sc.next();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for (j = 0; j < mat.length; j++)
        {
            if (j % 2 == 0)
            {
                for (i = 0; i < mat[0].length; i++)
                    System.out.print(mat[i][j] +" ");

            }
            else
            {
                for (i = mat[0].length - 1; i >= 0; i--)
                    System.out.print(mat[i][j] +" ");
            }
        }
    }
}




