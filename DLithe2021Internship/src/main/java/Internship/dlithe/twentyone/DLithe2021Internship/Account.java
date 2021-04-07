package Internship.dlithe.twentyone.DLithe2021Internship;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "holder")
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "number")
	private Long accnumb;
	private String accholer, pan, adress, email, accounttype, password;
	private Long contact;
	private Double balance;
	
	@Override
	public String toString() {
		return "Account [accnumb=" + accnumb + ", accholer=" + accholer + ", pan=" + pan + ", adress=" + adress
				+ ", email=" + email + ", accounttype=" + accounttype + ", password=" + password + ", contact="
				+ contact + ", balance=" + balance + "]";
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Long accnumb, String accholer, String pan, String adress, String email, String accounttype,
			String password, Long contact, Double balance) {
		super();
		this.accnumb = accnumb;
		this.accholer = accholer;
		this.pan = pan;
		this.adress = adress;
		this.email = email;
		this.accounttype = accounttype;
		this.password = password;
		this.contact = contact;
		this.balance = balance;
	}
	
	public Long getAccnumb() {
		return accnumb;
	}
	public void setAccnumb(Long accnumb) {
		this.accnumb = accnumb;
	}
	public String getAccholer() {
		return accholer;
	}
	public void setAccholer(String accholer) {
		this.accholer = accholer;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
