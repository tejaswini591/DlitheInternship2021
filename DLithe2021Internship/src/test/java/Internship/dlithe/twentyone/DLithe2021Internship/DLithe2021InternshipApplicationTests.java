package Internship.dlithe.twentyone.DLithe2021Internship;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import Internship.dlithe.twentyone.DLithe2021Internship.controllers.RepoAccount;
import Internship.dlithe.twentyone.DLithe2021Internship.controllers.ServiceAccount;
import Internship.dlithe.twentyone.DLithe2021Internship.model.Account;

@SpringBootTest
@RunWith(SpringRunner.class)
class DLithe2021InternshipApplicationTests 
{
	@MockBean
	RepoAccount repo;
	
	@Autowired
	ServiceAccount service;
	
	/*
	 * @Test void contextLoads() { }
	 */

	@Test
	public void testInsertion()
	{
		Account acc=new Account(987656789L, "Mohamed", "ABCD111", "SAlem", "razzaksr@gmail.com", "Savings", "abcabc", 9876568987L, 1200.8);
		Account acc2=new Account(987646732323L, "Sabari", "JSHC34E4", "SAlem,India", "sabariragu@gmail.com", "Current", "skjdcbksd", 82733444L, 120100.8);
		when(repo.save(acc)).thenReturn(acc);
		assertEquals(acc.getAccHolder(),service.insert(acc));
	}
	
	@Test
	public void testLogin()
	{
		Optional<Account> acc=Optional.of(new Account(987656789L, "Mohamed", "ABCD111", "SAlem", "razzaksr@gmail.com", "Savings", "abcabc", 9876568987L, 1200.8));
		when(repo.findById(987656789L)).thenReturn(acc);
		assertTrue(service.fetchOne(987656789L).getBalance().equals(1200.8));
	}
}