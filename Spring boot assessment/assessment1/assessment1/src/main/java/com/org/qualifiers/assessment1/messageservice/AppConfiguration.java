package com.org.qualifiers.assessment1.messageservice;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.javadevsguide.springframework.di")
public class AppConfiguration {

	@Bean(name="emailService")
	public MessageService emailService(){
		return new EmailService();
	}
	
	
	@Bean
	public MessageProcessor messageProcessor(){
		return new MessageProcessorImpl(emailService());
	}
}
