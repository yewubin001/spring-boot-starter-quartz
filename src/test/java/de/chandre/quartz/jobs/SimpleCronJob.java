package de.chandre.quartz.jobs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.Job;
import org.quartz.JobExecutionContext;

/**
 * simple example of Quartz job
 * @author Andre
 *
 */
public class SimpleCronJob implements Job 
{
	private static final Log LOGGER = LogFactory.getLog(SimpleCronJob.class);
	
	@Override
    public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("executing cron job: " + jobExecutionContext.getJobDetail().getKey().getName());
	}
}
