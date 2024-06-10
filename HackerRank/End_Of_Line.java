import java.util.Scanner;

public class End_Of_Line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      int c=1;
        while(sc.hasNext())
        {
            String str = sc.nextLine();
            System.out.println(c+" "+str);
            c++;
        }  
        sc.close();
    }    
}
