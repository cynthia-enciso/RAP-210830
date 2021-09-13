package modifierexamples.office;

public class Coworker {
	// trying to access the different properties of a parent
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		System.out.println(parent.workPhoneNumber); // public
		System.out.println(parent.workID); // package-private
		System.out.println(parent.personalPhoneNumber); // protected
//		System.out.println(parent.loginPassword); // private
	}
}
