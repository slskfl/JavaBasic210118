package returnTest;

public class MyFunctionInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunctionInterface fi;
		
		fi=(x, y)->{
		int result = x+y;
		return result;
		};
		System.out.println(fi.method(10, 5));
		
		fi=(x,y)->{
			return x+y;
		};
		System.out.println(fi.method(10, 10));
		
		fi=(x,y)->x+y;
		System.out.println(fi.method(10, 20));
		
		fi=(x, y)->sum(x, y);
		System.out.println(fi.method(100, 10));
	}

	public static int sum(int x, int y) {
		return(x+y);
	}
}
