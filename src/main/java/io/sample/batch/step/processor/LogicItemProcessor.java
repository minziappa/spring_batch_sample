package io.sample.batch.step.processor;

import org.springframework.batch.item.ItemProcessor;

import io.sample.batch.bean.model.Home;
import io.sample.batch.bean.model.Users;

public class LogicItemProcessor implements ItemProcessor<Users, Home> {

	@Override
	public Home process(Users item) throws Exception {
		
		Home home = new Home();
		home.setId(1);
		home.setHomeName("Joon");
		home.setHomeAddress("Inchen");

		return home;
	}

}
