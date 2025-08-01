import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(recu(n));
        
    }
    
    public static String recu(int n){
        if(n == 1) {
            // System.out.println(1);
            return "1";
        }
       String prev =  recu(n-1);
       return prev + n + prev;
        
    }
}

// n=1; 1;
// n=2; 1 2 1;
// n=3; 1 2 1 3 1 2 1 ; // n=4; 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1;
