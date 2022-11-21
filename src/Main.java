import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static int largest(int a,int b,int c)
    {
        if(a>=b && a>=c)
            return a;
        else if (b>=a && b>=c)
            return b;
        else
            return c;
    }

    public static int smallest(int a,int b,int c)
    {
        if(a<=b && a<=c)
            return a;
        else if (b<=a && b<=c)
            return b;
        else
            return c;
    }

    public static boolean Prime(int n)
    {
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            return false;
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    return false;
                    break;
                }
            }
            if(flag==0)  { return true; }
        }

    }

    public static void main(String[] args) {

        System.out.println("1:Largest of 3 numbers");
        System.out.println("2:Smallest of 3 numbers");
        System.out.println("3:Check prime no");
        System.out.println("4:Check even or not");
        System.out.println("5:Reverse of number");
        System.out.println("6:Exit");



        int exit=0;
        while(exit!=1)
        {

            System.out.println("Enter a choice:");

            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter 3 int values:");
                    int large = largest(a, b, c);
                    System.out.println("Largest no:" + large);
                    break;

                case 2:
                    System.out.println("Enter 3 int values:");
                    int small = smallest(a, b, c);
                    System.out.println("Largest no:" + large);
                    break;

                case 3:
                    System.out.println("Enter a no to check if its prime:");
                    int num = sc.nextInt();
                    boolean bool = Prime(num);
                    if (bool == true) {
                        System.out.println("Prime no");
                    } else {
                        System.out.println("composite no");
                    }
                    break;

                case 4:
                    System.out.println("Enter a no to check if its even:");
                    int num1 = sc.nextInt();
                    bool1 = Even(num);
                    if (bool == true) {
                        System.out.println("Even no");
                    } else {
                        System.out.println("odd no");
                    }
                    break;

                case 5:
                    System.out.println("enter a no to reverse:");
                    int num2 = sc.nextInt();
                    int revnum = reverse(num2);
                    System.out.println("Reversed no " + revnum);
                    break;

                case 6:
                    exit = 1;
                    break;

                default:
                    System.out.println("Invalid choice");

            }

            System.out.println("enter 1 to exit");
            exit=sc.nextInt();



        }


    }
}