package parameter;

public class MyFunctionInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunctionInterface fi;
		
		fi=(x)->{
			int result=x+5;
			System.out.println(result);
		};
		fi.method(10);
		
		fi=(x)->{System.out.println(x+5);};
		fi.method(20);
		
		
	}

}
