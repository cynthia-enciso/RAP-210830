package modifierexamples.school;

import modifierexamples.office.Parent;

public class Child extends Parent {
	// trying to access the different properties of a parent
	public static void main(String[] args) {
		Parent parent = new Parent();
		
		System.out.println(parent.workPhoneNumber); // public
//		System.out.println(parent.workID); // package-private
//		System.out.println(parent.personalPhoneNumber); // protected
//		System.out.println(parent.loginPassword); // private
		
		Child child = new Child();
		System.out.println(child.personalPhoneNumber); // accessible through inherited property
	}
	
	public void childMethod() {
		System.out.println(this.personalPhoneNumber); // accessible through inherited property
	}
}
