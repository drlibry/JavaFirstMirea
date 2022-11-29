package ru.mirea.task4;

import java.util.Scanner;

public class MatrixTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер матрицы ");
        int n = input.nextInt();
        int m = input.nextInt();
        float[][] Arr = new float[n][m];
        System.out.print("Введите матрицу ");
        for(int i =0;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                Arr[i][j] = input.nextFloat();
            }
        }
        Matrix one = new Matrix(n,m,Arr);
        one.printMat(Arr);
        System.out.print("Введите вторую матррицу");
        float[][] B = new float[n][m];
        for(int i =0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = input.nextFloat();
            }
        }
        System.out.println("Сумма двух матриц ");
        one.sum(B);
        System.out.println("Введите число");
        float ch = input.nextFloat();
        System.out.println("Умножение первой матрицы на число");
        one.proisv(ch);
        System.out.println("Умножение первой матрицы на вторую");
        one.proisvmat(B);

    }
}
