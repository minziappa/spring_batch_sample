package io.sample.batch.step.reader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import io.sample.batch.bean.model.Users;
import io.sample.batch.step.processor.LogicItemProcessor;

public class Step1ItemReader implements ItemReader<Users> {

	final Logger logger = LoggerFactory.getLogger(Step1ItemReader.class);

	@Override
	public Users read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		logger.info("Step1ItemReader ==========");

		return null;
	}

}
