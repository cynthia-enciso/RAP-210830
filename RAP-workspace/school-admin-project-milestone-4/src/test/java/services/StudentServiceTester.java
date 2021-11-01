package services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;

import com.revature.daos.StudentRepository;
import com.revature.models.Student;
import com.revature.services.StudentServiceImpl;

public class StudentServiceTester {

	@Mock
	private static StudentRepository studentRepository = mock(StudentRepository.class);
	private static StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
	
	@Test
	public void testGetDoingWellCountSuccess() {
		// dummy data
		ArrayList<Student> dummyStudents = new ArrayList<Student>();
		Student student = new Student();
		student.setDoingWell(true);
		Student student2 = new Student();
		student2.setDoingWell(true);
		dummyStudents.add(student);
		dummyStudents.add(student2);
		
		// mock and stub
		studentServiceImpl.setStudentRepository(studentRepository);
		when(studentRepository.getAllStudents()).thenReturn(dummyStudents);
		
		// call method we are trying to test
		int result = studentServiceImpl.getDoingWellCount();
		int successValue = 2;
		
		verify(studentRepository).getAllStudents();
		
		// make our assertions
		assertEquals(successValue, result);
	}
	
	@Test
	@Ignore
	public void testSomethingElse() {
		
	}
}
