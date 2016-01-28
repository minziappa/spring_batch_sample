package io.sample.batch.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.sample.batch.service.InitialService;

@Service
public class InitialServiceImpl implements InitialService {

	final Logger logger = LoggerFactory.getLogger(InitialServiceImpl.class);

	@Override
	public void init() throws Exception {
		logger.info("Started the batch");
	}

	@Override
	public void destory() throws Exception {
		logger.info("Stopped the batch");
	}

}