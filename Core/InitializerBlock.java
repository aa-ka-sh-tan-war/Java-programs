import java.util.Scanner;

public class InitializerBlock {
    static int breadth;
    static int height;
    static int area;
    
    static {
        Scanner scanner = new Scanner(System.in);
        
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        
        scanner.close();
        
        Exception nonPositive = new Exception("Breadth and height must be positive");
        
        try {
            if (breadth > 0 && height > 0) {
                area = breadth * height;
            } else {
                throw nonPositive;
            }   
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if (area != 0) {
            System.out.println(area); 
        }  
    }    
}
