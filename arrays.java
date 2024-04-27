import java.util.Scanner;
 
public class arrays
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);


      /*   //One Dimensional Array
        int [] a = new int[5];
        int [] b = {1,2,3,4,5};
        System.out.println(b[4]);
        int c [] = new int [10];
        int i =0;
        System.out.println("Enter the array values of c  ");
        for (i=0;i<10;i++)
        {
            c[i]=in.nextInt();


        }
        
    System.out.println("The values of the array c are");    

    for(i=0;i<10;i++)
    {
        System.out.print(+ c[i] );    

    }    */

    //Two Dimensional Array
      int [][] p = new int [3][3];
      System.out.println("Enter the values of the array");
      //one method
      int [][] q = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
      };


      /*Method 2 is input using the System.in */
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            System.out.print( " "+q[i][j]);


        }
        System.out.println(" ");
      }

      /*Method ;- output or printing an array can be done by using the
      System.out.println( Array.toString(q[i]))

    }
}