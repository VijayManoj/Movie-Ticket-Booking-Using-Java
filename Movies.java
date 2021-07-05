import java.util.*;
public  class Movies {
    static Scanner sc = new Scanner(System.in);
    static int s, v,g;
    static String movie[] = {"Yatra", "URI", "URI", "Captial Marvel", "NoteBook", "SANJU", "Abhimanyudu", "Yatra", "URI", "NoteBook","URI"};
    static String movie1[] = {"Captial Marval","NoteBook","Yatra","SANJU","URI","Captial Marvel","Abhimanyudu","URI","Yatra","NoteBook" };
    static String theatre []={"PVP","PVP","TrendSet ","TrendSet ","LEPL","LEPL","Inox","Inox","Swathi","Miraj"};
    static String theatre2 []={"G3","G3","Cine Polis","Cine Polis","Hari Cineams","Hari Cineams","Siva Cineams","Siva Cineams","KBN","Mahal"};

    public static void main() {


        int r = 0;
        movie(s, v);
        movie1(s,g);


    }

    public static void movie(int s, int v) {
        int r;
        if (s == 0) {
            if (v == 1) {
                System.out.println("1." + movie[0] + "\n2." + movie[1]);

            }

            if (v == 2) {
                System.out.println("1." + movie[2] + "\n2." + movie[3]);

            }
            if (v == 3) {
                System.out.println("1." + movie[4] + "\n2." + movie[5]);
            }
            if (v == 4) {
                System.out.println("1." + movie[6] + "\n2." + movie[7]);
            }
            if (v == 5) {
                System.out.println("1." + movie[8]+"\n2- Exit ");
                int n=sc.nextInt();
                if(n==2)
                {
                    System.exit(0);
                }

            }
            if (v == 6) {
                System.out.println("1." + movie[9]+"\n2-Exit");
                int n=sc.nextInt();
                if(n==2)
                {
                    System.exit(0);

                }


            }
        }
        if(s==1 && v==0)
        {
            System.out.println("Avaliable Movies Are :");
            for(int i=0;i<9;i++)
            {
                System.out.println(+(i+1)+"."+movie[i]+"-"+theatre[i]);


            }
            System.out.println("Enter Movie Number :");
            int n=sc.nextInt();
            if(n>=1 && n<=9)
            {
                System.out.println("Enter New Movie Name :");
                String st=sc.nextLine();
                st=sc.nextLine();

                movie[n-1]=null;
                movie[n-1]=st;

            }
            System.out.println("After Changing Movie Name :");
            for(int i=0;i<9;i++)
            {
                System.out.println(+(i+1)+"."+movie[i]+"-"+theatre[i]);

            }
        }

    }

    public static void movie1(int s,int g)
    {
        int r;
        if(s==0)
        {
            if(g==1)
            {
                System.out.println("1." + movie1[0] + "\n2." + movie1[1]);

            }
            if(g==2)
            {
                System.out.println("1." + movie1[2] + "\n2." + movie1[3]);
            }
            if(g==3)
            {
                System.out.println("1." + movie1[4] + "\n2." + movie1[5]);
            }
            if(g==4)
            {
                System.out.println("1." + movie1[6] + "\n2." + movie1[7]);
            }
            if(g==5)
            {
                System.out.println("1."+movie1[8]+"\n2-Exit");
                int n=sc.nextInt();
                if(n==2)
                {
                    System.exit(0);

                }

            }
            if(g==6)
            {
                System.out.println("1."+movie1[9]+"\n2-Exit");
                int n=sc.nextInt();
                if(n==2)
                {
                    System.exit(0);

                }

            }

        }
        if(s==1&& g==0)
        {
            System.out.println("The Avaliable Movies  are :");
            for(int i=0;i<10;i++)
            {
                System.out.println(+(i+1)+"."+movie1[i]+"-"+theatre2[i]);

            }
            System.out.println("Enter Number to Change Movie :");
            int n=sc.nextInt();
            if(n>=1 && n<=9)
            {
                System.out.println("Enter New Movie Name :");
                String st=sc.nextLine();
                st=sc.nextLine();

                movie1[n-1]=null;
                movie1[n-1]=st;

            }
            System.out.println("After Changing The Movie Name :");
            for(int i=0;i<9;i++)
            {
                System.out.println(+(i+1)+"."+movie1[i]+"-"+theatre2[i]);

            }
        }
    }



}

