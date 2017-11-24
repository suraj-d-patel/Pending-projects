import java.util.*;
public class game1
{
    public static void main(String[] args)
    {
        int x,y;
        System.out.println("****Welcome to BattleShip Game****");
        System.out.println("\tRight now the Sea is Empty");
        mapsea();
        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < 5; k++)
        {
                System.out.print("Enter X coordinate for your ship" + (k + 1) + ": ");
                x = sc.nextInt();
                System.out.print("Enter Y coordinate for your ship" + (k + 1) + ": ");
                y = sc.nextInt();
            if(locateShips(x,y)!=1)
            {}
        }

    }


    static int locateShips(int x,int y)
    {
        int a=1;
        return 1;
    }


       static void mapsea()
       {
        int a;
        int[][] array = new int[10][10];
        System.out.print("  ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(i);
        }
        System.out.println();
        for (int j = 0; j < array.length; j++)
            System.out.println(j + "|          |" + j);
        System.out.print("  ");
        for (int k = 0; k < array.length; k++)
        {
            System.out.print(k);
        }
       }

}
