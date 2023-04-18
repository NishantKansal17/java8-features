package java8.func.app;

import java8.func.intf.MyFuncInterfaceImpl;

public class App {
	
	public static void main(String[] args) {
		new MyFuncInterfaceImpl().processDisplay();
		new MyFuncInterfaceImpl().findEven(11);
	}
}
