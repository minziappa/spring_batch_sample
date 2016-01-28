package io.sample.batch.service.impl;

import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.sample.batch.service.AbstractService;
import io.sample.batch.service.SampleService;

@Service
public class SampleServiceImpl extends AbstractService implements SampleService {

	final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

	@Autowired
    private Configuration configuration;

	@Override
	public void doTest() {

		logger.info("abcd >>> ");
	}

}