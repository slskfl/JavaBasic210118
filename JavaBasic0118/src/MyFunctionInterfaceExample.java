
public class MyFunctionInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionInterface fi;
		
		fi = (/*�Ű�����*/)->{
			/*������*/
			String str = "mathod call-1";
			System.out.println(str);
		};
		fi.method();
		
		fi = (/*�Ű�����*/)->{
			/*������*/
			System.out.println("mathod call-2");
		};
		fi.method();
		
		fi = ()->System.out.println("mathod call-3");
		fi.method();
	}

}
