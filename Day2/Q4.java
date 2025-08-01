public class Main
{
	public static void main(String[] args) {
		System.out.println(func(2,7)); //139
	}
	
	public static int func(int x, int y){
	    if( x == y) return x*y;
	    
	    
	    return func(x,(x+y)/2) + func((x+y)/2 + 1,y);
	}
}
