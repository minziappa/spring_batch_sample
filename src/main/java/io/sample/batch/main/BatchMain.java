package io.sample.batch.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchMain {

	final static Logger logger = LoggerFactory.getLogger(BatchMain.class);

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("helloWorldJob");
		
		// Set parameters
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		jobParametersBuilder.addString("test5", "5");
		jobParametersBuilder.addString("test6", "6");
		JobParameters jobParameters = jobParametersBuilder.toJobParameters();

		try {
			JobExecution execution = jobLauncher.run(job, jobParameters);
			logger.info("Exit Status : " + execution.getStatus());
		} catch (Exception e) {
			logger.error("Exception >> ", e);
		}

		System.out.println("Done");

	}

}