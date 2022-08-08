package dynamic_programming;

class Fibonacci_Series{
//	private int max = 100;
//	private int[] lookup = new int[max];
//	//private int size;
//	
//	
//	/*
//	 * public Fibonacci_Series(int n) { super(); this.lookup = new int[n+1];
//	 * //this.size = n; for(int i = 0;i<n;i++) { lookup[i] = -1; } }
//	 */
//	
//	void initialize() {
//		for(int i = 0;i<max;i++) {
//			lookup[i] = -1;
//		}
//	}
//	
//	public int fib(int n) {
//		
//		if(lookup[n] == -1) {
//			if(n<=1)
//				lookup[n] = n;
//			else
//				lookup[n] = fib(n-1) + fib(n-2);
//		}
//		
//		return lookup[n];
//	}
	
	final int MAX = 100;
    final int NIL = -1;
 
    int lookup[] = new int[MAX];
 
    /* Function to initialize NIL values in lookup table */
    void _initialize()
    {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;
    }
 
    /* function for nth Fibonacci number */
    int fib(int n)
    {
        if (lookup[n] == NIL) {
            if (n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n - 1) + fib(n - 2);
        }
        return lookup[n];
    }
 
}

public class Fibonacci_series_memoization_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci_Series f = new Fibonacci_Series();
		//System.out.println(f.fib(50));
		int n = 40;
        f._initialize();
        System.out.println("Fibonacci number is"
                           + " " + f.fib(n));

	}

}
