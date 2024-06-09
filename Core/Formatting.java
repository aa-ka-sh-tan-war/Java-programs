import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int c=0;
                //Complete this line
                for(int k=0; k < s1.length(); k++)
                {
                    System.out.print(s1.charAt(k));
                    c++;
                }
                for(int j = c; j < 15; j++)
                {
                   System.out.print(" ");
                }
                if(x>=0 && x<10)
                {
                    System.out.println("00"+x);
                }
                else if(x>=10 && x<100)
                {
                    System.out.println("0"+x);
                }
                else
                {
                    System.out.println(x);    
                }
            }
            System.out.println("================================");
            sc.close();
    }    
}
