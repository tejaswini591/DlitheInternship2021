package Internship.dlithe.twentyone.DLithe2021Internship.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Internship.dlithe.twentyone.DLithe2021Internship.model.Account;

@Controller
public class AccountController 
{
	@Autowired
	ServiceAccount service;
	
	@RequestMapping("/")
	public String open()
	{
		return "index";
	}
	
	@RequestMapping(value="/log",method=RequestMethod.POST)
	public String logging(Model model,@RequestParam("user") Long user,@RequestParam("pass") String pass)
	{
		Account tmp=service.fetchOne(user);
		if(tmp.getPassword()!=null&&tmp.getPassword().equals(pass))
		{
			model.addAttribute("username", tmp.getAccHolder());
			return "home";
		}
		else
		{
			model.addAttribute("msg", "Invalid account/password");
			return "index";
		}
	}
	
	@RequestMapping("/sign")
	public String kyc(Model model)
	{
		Account acc=new Account();
		model.addAttribute("obj", acc);
		return "signup";
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String adding(Model model,@ModelAttribute("holder") Account holder)
	{
		System.out.println(holder);
		String name=service.insert(holder);
		model.addAttribute("msg", name);
		return "signup";
	}
}