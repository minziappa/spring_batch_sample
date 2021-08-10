package io.sample.batch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class SampleOneStep implements Tasklet {

	final Logger logger = LoggerFactory.getLogger(SampleOneStep.class);

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		logger.info("test SampleOneStep ");

		return null;
	}

}
