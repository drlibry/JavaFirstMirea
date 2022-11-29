package ru.mirea.task4;

public class Matrix
{
    private int n;
    private int m;
    private float[][] A = new float [n][m];
    Matrix(int x, int y, float[][] a)
    {
        n = x;
        m = y;
        A = a;
    };
    public void printMat(float[][] C)
    {
        for(int i =0;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                System.out.print(C[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void sum(float B[][])
    {
        float[][] C = new float [n][m];
        for(int i =0;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        printMat(C);
    }
    public void proisv(float ch)
    {
        float[][] C = new float [n][m];
        for(int i =0;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                C[i][j]=A[i][j]*ch;
            }
        }
        printMat(C);
    }
    public void proisvmat(float[][]B)
    {
        float[][] C = new float [n][m];
        for(int i =0;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                C[i][j]=0;
                for(int k =0;k<m;k++)
                {
                    C[i][j] +=A[i][k]*B[k][j];
                }
            }
        }
        printMat(C);
    }


}
