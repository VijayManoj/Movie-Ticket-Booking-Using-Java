import java.util.*;
import java.lang.String;
public class Dates {
    static Scanner sc = new Scanner(System.in);
    static int s;
    static int month[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, m;
    static int year[] = {2019}, y;
    static int date[] = {24, 25, 26, 27, 28, 29, 30, 31}, d;
    static String st[]=new String [40];


    public static void main() {

        dates(s);

    }

    public static void dates(int s)
    {
        if (s == 0)
        {
            System.out.println("Avaliable Dates :");
            for (int k = 0; k < 8; k++)
            {
                st[k] = date[k]+ "-" + month[2] + "-" + year[0];

                System.out.println(+(k + 1) +"."+ st[k]);


            }
            System.out.println("Select Your Date :");
            int r = sc.nextInt();
            if (r >= 1 && r <= 7) {

            } else {
                System.out.println("Invalid Date ");
                dates( s);


            }
        }


        if (s == 1)
        {
            int r;
            int k;
            for ( k = 0; k <8; k++)
            {
                st[k] = date[k]+ "-" + month[2] + "-" + year[0];

                System.out.println(+(k + 1) +"."+ st[k]);


            }

            System.out.println("Avaliable Date :");

            System.out.println("Select Your Number  :");
            r = sc.nextInt();
            if (r >= 1 && r <= 7) {
                System.out.println("Match Found ");
                System.out.println("Enter Date to Change :");
                d = sc.nextInt();
                System.out.println("Enter Month :");
                m = sc.nextInt();
                System.out.println("Enter Year :");
                y = sc.nextInt();
                if (y == year[0]) {
                    if (m >= 3) {
                        if (m % 2 != 0) {
                            if (d >= 1 && d <= 31)
                            {
                                System.out.println("Valid ");

                                changing(d,m,y,r);

                            } else {
                                System.out.println("Invalid Date ");
                            }
                        } else if (m % 2 == 0) {
                            if (d >= 1 && d <= 30) {
                                System.out.println("Valid ");

                            } else {
                                System.out.println("Invalid Date ");
                            }
                        } else if (m == 2) {
                            if (y % 4 == 0 && (d >= 1 && d <= 29)) {
                                System.out.println("Valid ");


                            }
                            if (y % 4 != 0 && (d >= 1 && d <= 28)) {
                                System.out.println("Valid ");

                            } else {
                                System.out.println("Invalid ");

                            }
                        }
                    }
                }


            } else {
                System.out.println("Invalid Date ");

            }


        }
    }
    public static void changing(int d,int m,int y,int k)
    {
        System.out.println(+k);

        System.out.println("Present Date "+st[k-1]);

        st[k-1]=d+"-"+m+"-"+y;
        System.out.println("Changed Date :"+st[k]);
        System.out.println("After Changing Dates :");
        for(k=0;k<8 ;k++)
        {
            System.out.println(+(k+1)+"."+st[k]);

        }

    }
}