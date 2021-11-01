package services;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Student;
import com.revature.services.AService;

public class AServiceTester {
	
	private static AService aService = new AService();
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Runs once before alls test.");
	}
	
	@Before
	public void setUpBeforeEachTest() {
		System.out.println("Runs before each test.");
	}
	
	@After
	public void tearDownAfterEachTest() {
		System.out.println("Runs after each test.");
	}
	
	@AfterClass
	public static void TearDownAfterClass() {
		System.out.println("Runs once after alls test.");
	}
	
	
	@Test
	public void getStudentFromArraySuccess() {
		// create any dummy data needed
		int index = 4;
		Student[] students = new Student[5];
		
		// call the method I am trying to test
		Student student = aService.getStudentFromArray(index, students);
		
		// make an assertion
		assertNull(student);
	}
	
	@Test /* (expected = ArrayIndexOutOfBoundsException.class) */
	public void getStudentFromArrayThrowsExecption() {
		// create any dummy data needed
		int index = 5;
		Student[] students = new Student[5];
		
		// call the method I am trying to test
//		Student student = aService.getStudentFromArray(index, students);
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> aService.getStudentFromArray(index, students));
	}
}
