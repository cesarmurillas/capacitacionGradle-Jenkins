package co.ceiba.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;

	@Before
	public void setUp() throws Exception {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		Person person = new PersonTestDataBuilder().build();		
		String message = notifyPersonService.notify(person);
		assertNotNull(message);
	}

}
