package inhertianceconcept;

public class InheritC extends InheritB{
	public void runmthod(){
		System.out.println("Child method");
		super.runmthod();
		super.callmethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritC obj = new InheritC();
		obj.runmthod();
				
	}

}
