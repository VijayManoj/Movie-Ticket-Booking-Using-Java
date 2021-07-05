import java.util.*;
public class Project2
{  static int s=0;
    static Scanner sc=new Scanner(System.in);
    public static void main()
    {
        int r=0;

        movies();

    }
    public static void movies()
    {
        int r;

        String m1="Arjun Suravram",m2="Dear Comrade ";
        Scanner sc=new Scanner (System.in);

        System.out.println("1."+m1+"\n2."+m2+"\nEnter Your Opition :");

        r=sc.nextInt();
        switch(r)
        {
            case 1:
                System.out.println("Avaliable");
                s++;
                datesa();
                break;
            case 2:
                System.out.println("Avaliable ");
                s++;
                dates2();
                break;
            default:
                System.out.println("Invalid Opition ");
                break;

        }
    }

    public static void datesa()
    {

        System.out.println("Dates Avaliable\n1.19-4-2019\n2.20-4-2018\n3-21-4-2019");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                timings();
                seats1();

                break;
            case 2:
                timings();
                seats2();

                break;
            case 3:
                timings();
                seats3();


                break;

            default:
                System.out.println("Invalid ");
                break;

        }
    }
    public static void dates2()
    {
        System.out.println("Dates Avaliable\n1.18-4-2019\n2.19-4-2018\n3-21-4-2019");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                timings();
                seats1();

                break;
            case 2:
                timings();
                seats2();


                break;
            case 3:
                timings();
                seats3();


                break;

            default:
                System.out.println("Invalid ");
                break;

        }
    }
     public static void timings()
     {
         System.out.println("The Avaliable Timings Are :");
         System.out.println("1-10:40 A.M.\n2-2:45 P.M.\n3-6:40 P.M.\n4-Exit\nSelect Your Time :");
         int n=sc.nextInt();
         switch(n)
         {
             case 1:
                          System.out.println("Avaliable ");
                          break;
             case 2:
                           System.out.println("Avaliable ");
                           break;
             case 3:
                              System.out.println("Avaliable ");
                              break;
             case 4:
                           System.exit(0);
             default:
                               System.out.println("Invalid Opition ");
                               timings();



         }
     }
    public static void seats1()
    {

        int a[][];
        a=new int[10][10];

        int count=1;



        System.out.println("Zero Represents Seats are Blocked ");

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                a[i][j]=count++;
                System.out.print("  " +a[i][j]+"   ");



            }
            System.out.println();
        }
        System.out.println("Enter Number of Seats :");
        int n=sc.nextInt();
        if(n>0) {
            int m = n;
            do {
                System.out.println("Select Your Seat :");

                int s = sc.nextInt();
                int c = 0;
                if (s > 0)
                {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (a[i][j] == s) {
                                System.out.println("Seat are selected ");
                                c = 1;
                                n = n - 1;
                                a[i][j] = 0;


                            }

                        }
                    }
                    if (c == 0) {
                        System.out.println("Invalid Opition ");


                    }
                }
                else
                {
                    System.out.println("Invalid Seat ");

                }
            }
            while (n > 0) ;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("  " + a[i][j] + "   ");


                }
                System.out.println();
            }


            System.out.println("Online Booking Charges :Rs20");
            System.out.println("Bank Charges :Rs10");
            System.out.println("Goods And Service Tax(GST):Rs10.");

            float cost=m*(20+10+10+300);
            System.out.println("The Total Cost is :"+cost);
            payment(cost);



        }
        else
        {
            System.out.println("Invalid Seat ");
            seats1();

        }



    }


    public static void seats2()
    {

        int a[][];
        a=new int[10][10];

        int count=1;



        System.out.println("Zero Represents Seats are Blocked ");

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                a[i][j]=count++;
                System.out.print("  " +a[i][j]+"   ");



            }
            System.out.println();
        }
        System.out.println("Enter Number of Seats :");
        int n=sc.nextInt();
        if(n>0) {
            int m = n;
            do {
                System.out.println("Select Your Seat :");

                int s = sc.nextInt();
                int c = 0;
                if (s > 0)
                {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (a[i][j] == s) {
                                System.out.println("Seat are selected ");
                                c = 1;
                                n = n - 1;
                                a[i][j] = 0;


                            }

                        }
                    }
                    if (c == 0) {
                        System.out.println("Invalid Opition ");


                    }
                }
                else
                {
                    System.out.println("Invalid Seat ");

                }
            }
            while (n > 0) ;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("  " + a[i][j] + "   ");


                }
                System.out.println();
            }


            System.out.println("Online Booking Charges :Rs20");
            System.out.println("Bank Charges :Rs10");
            System.out.println("Goods And Service Tax(GST):Rs10.");

            float cost=m*(20+10+10+300);
            System.out.println("The Total Cost is :"+cost);
            payment(cost);



        }
        else
        {
            System.out.println("Invalid Seat ");
            seats2();

        }

    }


    public static void seats3()
    {


        int a[][];
        a=new int[10][10];

        int count=1;



        System.out.println("Zero Represents Seats are Blocked ");

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                a[i][j]=count++;
                System.out.print("  " +a[i][j]+"   ");



            }
            System.out.println();
        }
        System.out.println("Enter Number of Seats :");
        int n=sc.nextInt();
        if(n>0) {
            int m = n;
            do {
                System.out.println("Select Your Seat :");

                int s = sc.nextInt();
                int c = 0;
                if (s > 0)
                {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            if (a[i][j] == s) {
                                System.out.println("Seat are selected ");
                                c = 1;
                                n = n - 1;
                                a[i][j] = 0;


                            }

                        }
                    }
                    if (c == 0) {
                        System.out.println("Invalid Opition ");


                    }
                }
                else
                {
                    System.out.println("Invalid Seat ");

                }
            }
            while (n > 0) ;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("  " + a[i][j] + "   ");


                }
                System.out.println();
            }


            System.out.println("Online Booking Charges :Rs20");
            System.out.println("Bank Charges :Rs10");
            System.out.println("Goods And Service Tax(GST):Rs10.");

            float cost=m*(20+10+10+300);
            System.out.println("The Total Cost is :"+cost);
            payment(cost);



        }
        else
        {
            System.out.println("Invalid Seat ");
            seats3();

        }

    }
    public static void payment( float cost)
    {

        int a[];
        a=new int[4];
        System.out.println("Enter Your First Four Digits of Card :");
        for(int i=0;i<4;i++)
        {
            a[i]=sc.nextInt();


        }
        if(a[0]==4 && a[1]==2 && a[2]==9 && a[3]==6)
        {
            System.out.println("VISA");
            payment1( cost);
        }
        else if(a[0]==3 && a[1]==5 && a[2]==4 && a[3]==4)
        {
            System.out.println("MASTERO");
            payment1(cost);

        }
        else
        {
            System.out.println("Rupay ");
            payment1(cost);


        }
    }
    public static void payment1(float cost)
    {
         int i;

        int bal[]={99654,54122,1000,5474,63321};
        String card[]={"698566","452141","685232","457485","987451"},c,cvv[]={"963","875","475","585","512"},cv,pin[]={"5861","4125","8968","6321","9632"},p;
        System.out.println("enter Your Six digits of your Card Number :");
        String v=sc.nextLine();
           int d1=0;
        c=sc.nextLine();
        char ch[]=c.toCharArray();
        for(char a: ch)
        {
            if (a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0') {
                d1++;
            } else {
                d1--;
            }
        }
        if(d1==6)
        {
            for( i=0;i<5;i++)
            {
                if (c.equals(card[i]))
                {
                    System.out.println("Match Found ");
                    d1 = 0;
                    System.out.println("Enter Your CVV Number ");
                    cv = sc.nextLine();
                    char ch1[] = cv.toCharArray();
                    for (char b : ch1)
                    {
                        if (b == '1' || b == '2' || b == '3' || b == '4' || b == '5' || b == '6' || b == '7' || b == '8' || b == '9' || b == '0') {
                            d1++;
                        } else {
                            d1--;
                        }
                    }
                    if (d1 == 3) {
                        if (cv.equals(cvv[i])) {
                            System.out.println("Match Found ");

                            System.out.println("Enter Your Pin Number ");
                            p = sc.nextLine();
                            d1 = 0;
                            char ch2[] = p.toCharArray();
                            for (char r : ch2) {
                                if (r == '1' || r == '2' || r == '3' || r == '4' || r == '5' || r == '6' || r == '7' || r == '8' || r == '9' || r == '0') {
                                    d1++;
                                } else {
                                    d1--;
                                }
                            }
                            if (d1 == 4) {
                                if (p.equals(pin[i])) {
                                    System.out.println("Match Found ");
                                    if (bal[i] >= cost) {
                                        System.out.println("Transction Completed1 Sucessfully");
                                        System.out.println("Thank You ");
                                        System.exit(0);
                                        break;

                                    } else {
                                        System.out.println("Insufficient Number ");
                                        payment1(cost);
                                    }
                                } else {
                                    System.out.println("Invalid Pin Number ");
                                    payment1(cost);
                                }
                            } else {

                                System.out.println("Invalid Character Or Invalid1 Number ");
                                payment1(cost);
                            }

                        } else {
                            System.out.println("Match Not Found1 ");
                            payment1(cost);
                        }

                    } else {
                        System.out.println("Invalid Character Or Invalid1 Number ");
                        payment1(cost);
                    }
                }

            }
            if(i==5 )
            {
                System.out.println("Invalid Card1 Number ");
                payment1(cost);
            }
        }
        else
        {
            System.out.println("Invalid Character Or Invalid1 Number ");
            payment1(cost);
        }

    }
    public static void cashback(float cost)

    {
        if(cost>=1000)
        {
            System.out.println("You Are Elgible for  Cash back 600 BigBazar Vochuer ");
        }
        else if(cost<1000 && cost>=500)
        {
            System.out.println("You are elgible for cashback for 300 BigBazar Vochuer");

        }
        else
        {
            System.out.println("You are not elgible for any CashBack ");

        }

    }


}
