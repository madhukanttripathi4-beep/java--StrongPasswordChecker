import java.util.*;
class PasswordStrengthChecker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Password\nIt should contain atleast 12 character\nIt should contain atleast 4 Upper Case Character\nIt should contain atleast 4 Lower Case Character\nIt should contain atleast 1 Unique Character\nIt should contain atleast 3 Digits\n");
        String a[]=new String[1];
        int c=0,f=0,u=0,d=0;
        for(int i=0;i<1;)
        {
            c=0;f=0;u=0;d=0;
            a[i]=sc.nextLine();
            int score=0;
            if(a[i].length()<12)
            {
                System.out.println("Enter again it should contain atleast 12 characters\n");
                continue;
            }
            for(int j=0;j<a[i].length();j++)
            {
                char ch=a[i].charAt(j);
                if((int)ch>=65&&(int)ch<=90)
                    c++;
                else if((int)ch>=97&&(int)ch<=122)
                    f++;
                else if((int)ch>=48&&(int)ch<=57)
                    d++;
                else if((int)ch==32)
                {
                }
                else
                    u++;
            }
            boolean weak=false;
            System.out.println();
            if(a[i].length()>=12)
                score+=2;

            if(c>3)
                score+=2;
            else
            {
                System.out.println("It should contain atleast 4 Upper Case Characters");
                weak=true;
            }
            if(f>3)
                score+=2;
            else
            {
                System.out.println("It should contain atleast 4 Lower Case Characters");
                weak=true;
            }
            if(d>2)
                score+=2;
            else
            {
                System.out.println("It should contain atleast 3 Digits");
                weak=true;
            }
            if(u>0)
                score+=2;
            else
            {
                System.out.println("It should contain atleast 1 Unique Character (like @,#,$,%)");
                weak=true;
            }
            System.out.println();
            System.out.println("Rating : "+score+" / 10");
            if(weak==true)
            {
                if(score<=4)
                    System.out.println("Password Level : VERY WEAK");
                else if(score<=6)
                    System.out.println("Password Level : MODERATE");
                else
                    System.out.println("Password Level : GOOD");

                System.out.println("Enter Again\n");
            }
            else
            {
                System.out.println();
                System.out.println("Password Level : EXCELLENT");
                System.out.println("Password Accepted : "+a[i]);
                i++;
            }
        }
    }
}
