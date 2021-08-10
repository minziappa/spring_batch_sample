package io.sample.batch.step.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import io.sample.batch.bean.model.Home;
import io.sample.batch.bean.model.Users;

public class LogicItemProcessor implements ItemProcessor<Users, Home> {

	final Logger logger = LoggerFactory.getLogger(LogicItemProcessor.class);

	int i = 0;
	@Override
	public Home process(Users user) throws Exception {

		i++;
		Home home = new Home();
		home.setId(i);
		home.setHomeName(user.getName());
		home.setHomeAddress(user.getEmail());

		return home;
	}

}
