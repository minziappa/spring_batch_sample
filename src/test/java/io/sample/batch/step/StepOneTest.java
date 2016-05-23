package io.sample.batch.step;

import org.junit.Test;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class StepOneTest extends AbstractStepTest {

	@Autowired
	JobLauncherTestUtils jobLauncherTestUtils;
	
	@Test
	public void test1() {
		// Set parameters
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		jobParametersBuilder.addString("test1", "1");
		JobParameters jobParameters = jobParametersBuilder.toJobParameters();

		jobLauncherTestUtils.launchStep("step1", jobParameters);
		System.out.println("test");
	}

}
