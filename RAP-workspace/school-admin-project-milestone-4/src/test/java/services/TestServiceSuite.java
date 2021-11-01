package services;

import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.runner.JUnitCore.runClasses;

@RunWith(Suite.class)
@SuiteClasses({AServiceTester.class, AnotherServiceTester.class, StudentServiceTester.class})
public class TestServiceSuite {
	public static void main(String[] args) {
		// run the classes and save result
		Result result = runClasses(AServiceTester.class, AnotherServiceTester.class, StudentServiceTester.class);
		
		// print out failing tests
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
