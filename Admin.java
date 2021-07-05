
import java.util.Scanner;
public class Admin {
    static Scanner sc = new Scanner(System.in);
    static int u = 1;
    static int s=1,g=0;
    static Movies m=new Movies();

    public static void main() {
        
    code();
    }

    public static void code() {
        String  id = "9984", i, password = "6789", a;
        System.out.println("Enter Your ID :");
        i = sc.nextLine();
        char ch[]=i.toCharArray();
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
        if(d==4) {
            d=0;
            if (id .equals(i) )
            {
                System.out.println("Match Found ");
                System.out.println("Enter your Password ");
                a = sc.nextLine();
                char ch1[]=a.toCharArray();
                for(char c : ch1)
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
                if(d==4)
                {
                    if (password .equals(a)) {
                        System.out.println("Match Found ");
                        change();

                    } else {
                        System.out.println("Match Not Found ");
                        code();

                    }
                }
                else
                {
                    System.out.println("Invalid ");
                    code();

                }

            }
            else {
                System.out.println("Match Not Found ");

            }
        }
        else
        {
            System.out.println("Invalid");
            code();

        }
    }

    public static void change() {
        System.out.println("1-Vijayawada \n2-Guntur\nEnter Your Opition :");
        int n1=sc.nextInt();
        switch(n1) {
            case 2:

                System.out.println("1- Change  Present Movies \n2-Change  Dates of Present Movies \n3-Exit \nEnter Your Opition :");
                int n = sc.nextInt();
                switch (n) {

                    case 1:
                        System.out.println(n);
                        m.movie1(s,g);

                        break;

                    case 2:
                        Dates d = new Dates();

                        d.dates(s);
                        break;
                    case 3:
                        System.exit(0);


                    default:
                        System.out.println("Invalid Opition ");
                        break;


                }
                break;
            case 1:

                System.out.println("1- Change  Present Movies \n2-Change  Dates of Present Movies \n3-Exit \nEnter Your Opition :");
                n = sc.nextInt();
                switch (n) {

                    case 1:
                        m.movie(s,g);

                        break;

                    case 2:
                        Dates d = new Dates();
                        System.out.println("Dates ");
                        d.dates(s);
                        break;

                    case 3:
                        System.exit(0);


                    default:
                        System.out.println("Invalid Opition ");
                        break;


                }


        }


    }

}
