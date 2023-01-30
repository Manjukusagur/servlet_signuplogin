package DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biodata {
	String Firstname;
	String Middlename;
	String Lastname;
	long Mobile;
	@Id
	String Gmail;
	String Gender;
	double SSLC;
	double PUC;
	double Diploma;
	double Degree;
	String Adress;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getMiddlename() {
		return Middlename;
	}
	public void setMiddlename(String middlename) {
		Middlename = middlename;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getSSLC() {
		return SSLC;
	}
	public void setSSLC(double sSLC) {
		SSLC = sSLC;
	}
	public double getPUC() {
		return PUC;
	}
	public void setPUC(double pUC) {
		PUC = pUC;
	}
	public double getDiploma() {
		return Diploma;
	}
	public void setDiploma(double diploma) {
		Diploma = diploma;
	}
	public double getDegree() {
		return Degree;
	}
	public void setDegree(double degree) {
		Degree = degree;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}

}
