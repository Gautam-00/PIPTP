public class Main
{
	public static void main(String[] args) {
		System.out.println(fact(3)); //6
	}
	
	public static int fact(int n){
	    if(n <= 1) return 1;
	    
	    return n*fact(n-1);
	}
}
