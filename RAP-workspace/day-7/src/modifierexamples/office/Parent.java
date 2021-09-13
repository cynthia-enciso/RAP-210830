package modifierexamples.office;

public class Parent {
	// fields
	public long workPhoneNumber = 222_222_2222L;
	int workID = 1; // default level if access modifier omitted
	protected int personalPhoneNumber = 111_111_1111;
	private String loginPassword = "password";
	
	// trying to access the different properties of a parent
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		System.out.println(parent.workPhoneNumber); // public
		System.out.println(parent.workID); // package-private
		System.out.println(parent.personalPhoneNumber); // protected
		System.out.println(parent.loginPassword); // private
	}
	
}
