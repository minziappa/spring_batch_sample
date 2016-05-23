package io.sample.batch.step;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springConfig-test.xml"})
//@TestExecutionListeners(listeners = {LiquibaseTestExecutionListener.class,
//DependencyInjectionTestExecutionListener.class})
public abstract class AbstractStepTest {

	@BeforeClass
	public static void beforeClass() throws Exception {
		String rootPath = new File(".").getCanonicalPath();
		System.out.println("Current dir:"+rootPath);

		System.out.println("Before");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("After");
	}

}
