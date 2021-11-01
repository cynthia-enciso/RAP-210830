package services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.models.Student;
import com.revature.services.AService;
import com.revature.services.AnotherService;

@RunWith(MockitoJUnitRunner.class)
public class AnotherServiceTester {
	
	@Mock
	private static AService aService = mock(AService.class);
	private static AnotherService anotherService = new AnotherService();
	
	@Test
	public void testGetGPAFromStudentReturnedSuccess() {
		// create dummy data needed
		Student dummyStudent = new Student();
		dummyStudent.setGpa(4.0);
		Student[] students = new Student[5];
		
		// make sure it is looking at the correct aService object
		anotherService.setaService(aService);
		
		// mock and stub aService object
		when(aService.getStudentFromArray(0, students)).thenReturn(dummyStudent);
		
		// call stubbed method
		double result = anotherService.getGPAOfStudentReturned(0, students);
				
		// make assertion
		assertEquals(result, 4.0, 0.5);
	}
}
