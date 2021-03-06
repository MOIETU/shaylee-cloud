package com.shaylee.common.log.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Title: Application初始化重写
 * Project: shaylee-cloud
 *
 * @author Adrian
 * @date 2020-05-06
 */
public class ApplicationLoggerInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String appName = environment.getProperty("spring.application.name");
		String logPath = String.format("logs/%s-log/%s.log", appName, appName);
		System.setProperty("logging.file.name", logPath);
	}
}
