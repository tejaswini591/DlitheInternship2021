package Internship.dlithe.twentyone.DLithe2021Internship.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Internship.dlithe.twentyone.DLithe2021Internship.model.Account;

@Repository
public interface RepoAccount extends JpaRepository<Account, Long>
{
	
}