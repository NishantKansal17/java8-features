package java8.func.intf;

public class MyFuncInterfaceImpl implements MyFunctionalInterface {
	
	public void processDisplay() {
		MyFunctionalInterface myFuncIntf = (msg) -> System.out.println("Message for MyFunctionalInterface: "+msg);
		myFuncIntf.display("Hello!! World!");
	}

	@Override
	public void display(String message) {
		// TODO Auto-generated method stub
		
	}
}
