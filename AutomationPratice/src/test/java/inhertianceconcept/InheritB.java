package inhertianceconcept;

public class InheritB extends InheritanceA{

	public void runmthod(){
		System.out.println("Parent method");
	}
	public void callmethod(){
		super.runmthod();
		//System.out.println("Child call method");
	}
	
}
