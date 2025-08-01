public class Main
{
	public static void main(String[] args) {
		System.out.println(func(5,3)); //10
	}
	
	public static int func(int x, int y){
	    if(y == 0 || x == y) return 1;
	    
	    
	    return func(x-1,y) + func(x-1,y-1);
	}
}
