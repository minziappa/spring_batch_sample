package io.sample.batch.job;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import io.sample.batch.bean.Report;
import io.sample.batch.service.SampleService;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Autowired
	private SampleService sampleService;

	@Override
	public Report process(Report item) throws Exception {

		System.out.println("Processing..." + item);

		sampleService.doTest();

		return item;
	}

}