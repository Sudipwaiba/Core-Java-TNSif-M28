package comtnsif.interfacedemo;

public   class NestedInterfaceClass implements OuterInterface.InnerInterface{
	
	@Override
	public void print() {
		System.out.println("innerinterface method");
	}
}
