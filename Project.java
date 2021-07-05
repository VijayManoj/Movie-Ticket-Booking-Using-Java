import java.util.Scanner;
public class Project {
    static Scanner sc = new Scanner(System.in);
    static  Dates d=new Dates();
    static Movies m=new Movies();

    static int d1=0,i=0,s=0,v,g;
    static String num;

    public static void main(String [] args)
    {
        System.out.println("Enter Your Mobile Number ");


        String st=sc.nextLine();
        char ch[]=st.toCharArray();
        int d=0;

        for(char c : ch)
        {
            if(c=='1' || c=='2' || c=='3' || c=='4' || c=='5'|| c=='6'|| c=='7'|| c=='8'|| c=='9'|| c=='0' )
            {
                d++;
            }
            else
            {
                d--;
            }


        }
        if(d==10)
        {

            check();
        }
        else
        {
            System.out.println("Invalid Number  ");

        }


    }
    public static void check()
    {
        System.out.println("1-User\n2-Admin\nEnter Your Opition :");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:

                user();
                break;
            case 2:

                Admin a=new Admin();
                a.code();

                break;
            default:
                System.out.println("Invalid Opition ");
                break;
        }


    }


    public static void user()
    {

        city();
    }



    public static void city()
    {
        System.out.println("1-Vijayawada\n2-Guntur\n3-Exit\nEnter Your Opition :");
        int b;
        int n = sc.nextInt();
        switch (n) {
            case 1:
                b = bug();
                scv(b);
                break;
            case 2:
                b = bug();
                scg(b);
                break;
            case 3:
                break;


            default:
                System.out.println("Invalid Opition ");
                city();

                break;

        }


    }

    public static int bug()
    {

        System.out.println("Enter Your Budgect per one person(Max 150 Min 60) and new movies are (300) :");

        int n1=sc.nextInt();



        return n1;


    }


    public static void  scv(int b)
    {

        if(b>=60)
        {
            if(b<=300 && b>=250)
            {
                Project2 p = new Project2();
                p.movies();
            }
            else if(b<250 && b>=150)
            {
                System.out.println("High Class ");
                cvt1();

            }
            else if(b<150 && b>=100)
            {

                System.out.println("Middle Class ");
                cvt2();

            }
            else
            {

                System.out.println("Low Class");
                cvt3();
            }

        }
        else
        {
            System.out.println("Invalid Amount ");

            city();




        }

    }

    public static void  scg(int b)

    {
        if(b>=60)
        {
            if(b<=300 && b>=250)
            {
                Project2 p = new Project2();
                p.movies();
            }
            else if(b<250 && b>=150)
            {
                System.out.println("High Class ");
                cgt1();

            }
            else if(b<150 && b>=100)
            {

                System.out.println("Middle Class ");
                cgt2();

            }
            else
            {

                System.out.println("Low Class");
                cgt3();
            }

        }
        else
        {
            System.out.println("Invalid Amount ");

            city();




        }

    }
    public static void  cvt1() {
        System.out.println("1-PVP\n2-Trend Set\n3-Exit \nEnter Your Opition :");

        int n2=sc.nextInt();


        switch(n2)
        {
            case 1:



                pm();

                break;
            case 2:

                tm();

                break;
            case 3:
                break;


            default :
                System.out.println("Invalid Therater");
                cvt1();

                break;



        }

    }
    public static void  cvt2() {
        System.out.println("1-Inox\n2-LEPL\n3-Exit  \nEnter Your Opition :");

        int n2=sc.nextInt();
        switch(n2)
        {
            case 1:

                vsm();

                break;
            case 2:


                sm();

                break;
            case 3:
                break;


            default :
                System.out.println("Invalid Therater ");
                cvt2();
                break;



        }

    }
    public static void  cvt3() {
        System.out.println("1-Swathi\n2-Miraj \n3-Exit \nEnter Your Opition :");

        int n2=sc.nextInt();
        switch(n2)
        {
            case 1:

                s1m();

                break;
            case 2:

                s2m();

                break;
            case 3:
                break;

            default :
                System.out.println("Invalid Opition ");
                break;



        }

    }
    public static void  cgt1() {
        System.out.println("1-G3\n2-Cine Polis\n3-Exit  \nEnter Your Opition :");

        int n2=sc.nextInt();
        switch(n2)
        {
            case 1:

                cm();

                break;
            case 2:

                cpm();

                break;
            case 3:
                break;

            default :
                System.out.println("Invalid Opition ");
                break;



        }

    }
    public static void cgt2() {
        System.out.println("1-Hari Cineams \n2-Siva Cineams  \n3-Exit  \nEnter Your Opition :");
        int n2=sc.nextInt();
        switch(n2)
        {
            case 1:

                hcm();

                break;
            case 2:

                scm();

                break;
            case 3:
                System.exit(0);




            default :
                System.out.println("Invalid Opition ");
                break;



        }

    }
    public static void cgt3() {
        System.out.println("1-KBN\n2-Mahal \n3-Exit  \nEnter Your Opition :");

        int n2=sc.nextInt();
        switch(n2)
        {
            case 1:
                swm();


                break;
            case 2:
                sim();


                break;
            case 3:
                break;

            default :
                System.out.println("Invalid Opition ");
                break;



        }

    }



    public static void pm()
    {

        v=1;
        m.movie(s,v);

        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");
        int n3=sc.nextInt();


        switch(n3)
        {



            case 1:


                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();

                switch(n4)
                {
                    case 1:


                        pssr1();


                        break;
                    case 2:
                        pssr2();
                        break;
                    case 3:
                        pssr3();
                        break;
                    case 4:
                        break;
                    case 5:
                        pm();
                        break;

                    default :
                        System.out.println("Invalid Opition");
                        pm();

                        break;


                }
                break;

            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M.\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        psst1();
                        break;
                    case 2:
                        psst2();
                        break;
                    case 3:
                        psst3();
                        break;
                    case 4:
                        break;
                    case 5:
                        pm();
                        break;

                    default :
                        System.out.println("Invalid Opition");
                        pm();
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cvt1();
                break;


            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }




    public static void  tm()
    {
        v=2;

        m.movie(s,v);

        System.out.println("\n3-Exit\n4-Change Theatre \nEnter Your Movie ");
        int n3=sc.nextInt();

        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\n4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        tssi1();
                        break;
                    case 2:
                        tssi2();
                        break;
                    case 3:
                        tssi3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        tm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M.\n2-2:45 P.M.\n3-7:50 P.M\n4-Exit\n4-Change Movie \nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        tssk1();
                        break;
                    case 2:
                        tssk2();
                        break;
                    case 3:
                        tssk3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        tm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cvt1();
                break;

            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }

    public static void vsm()
    {
        v=3;
        m.movie(s,v);
        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");
        int n3=sc.nextInt();
        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        vsss1();
                        break;
                    case 2:
                        vsss2();
                        break;
                    case 3:
                        vsss3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        vsm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M. \n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();

                switch(n5)
                {
                    case 1:
                        vssk1();
                        break;
                    case 2:
                        vssk2();
                        break;
                    case 3:
                        vssk3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        vsm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cvt2();

            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }

    public static void sm()
    {
        v=4;
        m.movie(v,s);
        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");
        int n3=sc.nextInt();
        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        sssk1();
                        break;
                    case 2:
                        sssk2();
                        break;
                    case 3:
                        sssk3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        sm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M.\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");


                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        ssst1();
                        break;
                    case 2:
                        ssst2();
                        break;
                    case 3:
                        ssst3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        sm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cvt2();

            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }




    public static void s1m()
    {
        v=5;
        m.movie(s,v);


        d.dates(s);

        System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M \nSelect Your Show Timings ");
        int n4=sc.nextInt();
        switch(n4)
        {
            case 1:
                s1sst1();
                break;
            case 2:
                s1sst2();
                break;
            case 3:
                s1sst3();
                break;
            default :
                System.out.println("Invalid Opition");
                break;


        }

    }
    public static void s2m()
    {

        v=6;
        m.movie(s,v);

        d.dates(s);

        System.out.println("1-9:00 A.M.\n2-1:45 P.M \n3-6:50 P.M.\nSelect Your Show Timings ");
        int n4=sc.nextInt();
        switch(n4)
        {
            case 1:
                s2ssr1();
                break;
            case 2:
                s2ssr2();
                break;
            case 3:
                s2ssr3();
                break;
            default :
                System.out.println("Invalid Opition");
                break;


        }

    }
    public static void cm()
    {
        g=1;
        m.movie1(s,g);

        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");
        int n3=sc.nextInt();
        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M. \n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        cssr1();
                        break;
                    case 2:
                        cssr2();
                        break;
                    case 3:
                        cssr3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        cm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        csst1();
                        break;
                    case 2:
                        csst2();
                        break;
                    case 3:
                        csst3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        cm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cgt1();

            default :
                System.out.println("Invalid Opition ");
                break;

        }

    }
    public static void cpm()
    {
        g=2;
        m.movie1(s,g);

        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");

        int n3=sc.nextInt();
        switch(n3)
        {

            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        cpssr1();
                        break;
                    case 2:
                        cpssr2();
                        break;
                    case 3:
                        cpssr3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        cpm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:

                d.dates(s);
                System.out.println("1-9:40 A.M.\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        cpsst1();
                        break;
                    case 2:
                        cpsst2();
                        break;
                    case 3:
                        cpsst3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        cpm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cgt2();

            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }
    public static void hcm()
    {
        g=3;
        m.movie1(s,g);

        System.out.println("3-Exit\n4-Change Theatre  \nEnter Your Movie ");


        int n3=sc.nextInt();
        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        hcssr1();
                        break;
                    case 2:
                        hcssr2();
                        break;
                    case 3:
                        hcssr3();
                    case 4:
                        System.exit(0);
                    case 5:
                        hcm();

                        break;
                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        hcsst1();
                        break;
                    case 2:
                        hcsst2();
                        break;
                    case 3:
                        hcsst3();
                        break;
                    case 4:
                        System.exit(0);
                    case  5:
                        hcm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cgt2();
            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }
    public static void scm()
    {
        g=4;
        m.movie1(s,g);

        System.out.println("3-Exit\n4-Change Theatre\nEnter Your Movie ");


        int n3=sc.nextInt();
        switch(n3)
        {
            case 1:
                d.dates(s);

                System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n4=sc.nextInt();
                switch(n4)
                {
                    case 1:
                        scssr1();
                        break;
                    case 2:
                        scssr2();
                        break;
                    case 3:
                        scssr3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        scm();

                    default :
                        System.out.println("Invalid Opition");
                        break;


                }
                break;
            case 2:
                d.dates(s);

                System.out.println("1-9:40 A.M.\n2-2:45 P.M.\n3-7:50 P.M.\4-Exit\n5-Change Movie\nSelect Your Show Timings ");
                int n5=sc.nextInt();
                switch(n5)
                {
                    case 1:
                        scsst1();
                        break;
                    case 2:
                        scsst2();
                        break;
                    case 3:
                        scsst3();
                        break;
                    case 4:
                        System.exit(0);
                    case 5:
                        scm();

                    default :
                        System.out.println("Invalid Opition");
                        break;
                }
                break;
            case 3:
                System.exit(0);
            case 4:
                cgt2();
            default :
                System.out.println("Invalid Opition ");
                break;

        }
    }
    public static void sim()
    {

        g=5;
        m.movie1(s,g);

        d.dates(s);

        System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50 P.M.\nSelect Your Show Timings ");
        int n4=sc.nextInt();
        switch(n4)
        {
            case 1:
                s1sst1();
                break;
            case 2:
                s1sst2();
                break;
            case 3:
                s1sst3();
                break;
            default :
                System.out.println("Invalid Opition");
                break;


        }
    }

    public static void swm()
    {
        g=6;
        m.movie(s,g);

        d.dates(s);

        System.out.println("1-9:00 A.M.\n2-1:45 P.M.\n3-6:50  P.M.\nSelect Your Show Timings ");
        int n4=sc.nextInt();
        switch(n4)
        {
            case 1:
                s1sst1();
                break;
            case 2:
                s1sst2();
                break;
            case 3:
                s1sst3();
                break;
            default :
                System.out.println("Invalid Opition");
                break;


        }
    }


    public static void  pssr1()
    {
        float cost=150;
        seatselection(cost);
    }
    public static void seatselection(float cost)
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

            pay(m,cost);

        }
        else
        {
            System.out.println("Invalid Seat ");
            seatselection(cost);


        }


    }

    public static void pay(int m,float cost)

    {

        System.out.println("Online Booking Charges :Rs20");
        System.out.println("Bank Charges :Rs10");
        System.out.println("Goods And Service Tax(GST):Rs10.");

        float cost1 = m * (20 + 10 + 10 + cost);
        System.out.println("The Total Cost is :" + cost1);
        payment(cost1);

    }






    public static void payment(float cost)
    {
        System.out.println("Enter Your MailId:");
        String mail=sc.nextLine();
        mail=sc.nextLine();


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
        int bal[]={99654,54122,1000,5474,63321};
        String card[]={"698566","452141","685232","457485","987451"},c,cvv[]={"963","875","475","585","512"},cv,pin[]={"5861","4125","8968","6321","9632"},p;
        System.out.println("enter Your Six digits of your Card Number :");
        String v=sc.nextLine();

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
    public static void cashback(float amt)

    { System.out.println(+amt);

        if(amt>=1000 )
        {
            System.out.println("You are Elgible for BigBazar Vocher");

        }
        else if(amt<1000 && amt>=500)
        {
            System.out.println("You are Elgible for Brand Factory Voucher ");
        }
        else
        {
            System.out.println("Your are not Elgible for any CashBack ");

        }
    }
    public static void  pssr2()
    {

        float cost=150;
        seatselection(cost);

    }
    public static void  pssr3()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void  psst1()
    {

        float cost=150;
        seatselection(cost);
    }
    public static void  psst2()
    {

        float cost=150;
        seatselection(cost);
    }
    public static void  psst3()
    {

        float cost=150;
        seatselection(cost);
    }
    public static void  tssi1()
    {

        float cost=175;
        seatselection(cost);
    }
    public static void  tssi2()
    {
        float cost=175;
        seatselection(cost);

    }
    public static void  tssi3()
    {

        float cost=175;
        seatselection(cost);

    }
    public static void  tssk1()
    {

        float cost=170;
        seatselection(cost);
    }
    public static void  tssk2()
    {

        float cost=170;
        seatselection(cost);



    }
    public static void  tssk3()
    {

        float cost=170;
        seatselection(cost);
    }
    public static void vsss1()
    {

        float cost=125;
        seatselection(cost);

    }
    public static void vsss2()
    {

        float cost=125;
        seatselection(cost);



    }
    public static void vsss3()
    {

        float cost=125;
        seatselection(cost);

    }
    public static void vssk1()
    {

        float cost=125;
        seatselection(cost);

    }
    public static void  vssk2()
    {

        float cost=125;
        seatselection(cost);

    }
    public static void vssk3()
    {

        float cost=125;
        seatselection(cost);


    }
    public static void sssk1()
    {
        float cost=120;
        seatselection(cost);


    }
    public static void sssk2()
    {

        float cost=120;
        seatselection(cost);


    }
    public static void  sssk3()
    {

        float cost=120;
        seatselection(cost);



    }
    public static void ssst1()
    {

        float cost=120;
        seatselection(cost);



    }
    public static void  ssst2()
    {

        float cost=120;
        seatselection(cost);

    }
    public static void  ssst3()
    {

        float cost=120;
        seatselection(cost);


    }
    public static void s1sst1()
    {

        float cost=60;
        seatselection(cost);


    }
    public static void s1sst2()
    {

        float cost=60;
        seatselection(cost);





    }
    public static void s1sst3()
    {

        float cost=60;
        seatselection(cost);



    }
    public static void s2ssr1()
    {
        float cost=60;
        seatselection(cost);


    }
    public static void s2ssr2()
    {

        float cost=60;
        seatselection(cost);




    }
    public static void s2ssr3()
    {

        float cost=60;
        seatselection(cost);


    }
    public static void cpssr1()
    {
        float cost=140;
        seatselection(cost);



    }
    public static void cpssr2()
    {

        float cost=140;
        seatselection(cost);




    }
    public static void cpssr3()
    {

        float cost=140;
        seatselection(cost);


    }
    public static void cpsst1()
    {

        float cost=150;
        seatselection(cost);



    }
    public static void cpsst2()
    {
        float cost=150;
        seatselection(cost);



    }
    public static void cpsst3()
    {
        float cost=150;
        seatselection(cost);



    }
    public static void  cssr1()
    {

        float cost=150;
        seatselection(cost);



    }
    public static void cssr2()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void cssr3()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void  csst1()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void csst2()
    {
        float cost=150;
        seatselection(cost);






    }
    public static void csst3()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void hcsst1()
    {

        float cost=150;
        seatselection(cost);




    }
    public static void hcsst2()
    {
        float cost=150;
        seatselection(cost);





    }
    public static void hcsst3()
    {

        float cost=150;
        seatselection(cost);



    }
    public static void hcssr1()
    {

        float cost=150;
        seatselection(cost);



    }
    public static void  hcssr2()
    {

        float cost=150;
        seatselection(cost);




    }
    public static void hcssr3()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void scssr1()
    {
        float cost=150;
        seatselection(cost);




    }
    public static void scssr2()
    {

        float cost=150;
        seatselection(cost);



    }
    public static void scssr3()
    {

        float cost=150;
        seatselection(cost);


    }
    public static void scsst1()
    {

        float cost=150;
        seatselection(cost);
 }
    public static void scsst2()
    {

        float cost=150;
        seatselection(cost);

 }
    public static void scsst3()
    {
        float cost=150;
        seatselection(cost);





    }


}


