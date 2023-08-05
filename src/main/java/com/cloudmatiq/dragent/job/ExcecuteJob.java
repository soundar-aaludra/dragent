package com.cloudmatiq.dragent.job;

import java.time.LocalDate;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExcecuteJob {

	@Scheduled(cron = "0 */1 * ? * *")
	public void runEveyNMinutes() {
		System.out.println("Current time is :: " + LocalDate.now());
	}
}
