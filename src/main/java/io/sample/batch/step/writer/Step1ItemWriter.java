package io.sample.batch.step.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import io.sample.batch.bean.model.Users;

public class Step1ItemWriter implements ItemWriter<Users> {

	final Logger logger = LoggerFactory.getLogger(Step1ItemWriter.class);

	@Override
	public void write(List<? extends Users> items) throws Exception {
		
		logger.info("Step1ItemWriter ======== ");
		
	}

}
