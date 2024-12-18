package com.example.demo.entity;
import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	

@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "fullname")
 private String fullname;

 @Column(name = "email")
 private String email;

 @Column(name = "phone")
 private String phone;

 @Column(name = "dob")
 private String dob;

 @Column(name = "gender")
 private String gender;

 @Column(name = "address1", nullable = false)
 private String address1;

 @Column(name = "address2")
 private String address2;

 @Column(name = "postalcode")
 private String postalcode;

 @Column(name = "state")
 private String state;

 @Column(name = "country")
 private String country;

// @Column(name = "profilepic")
// private String profilepic;

 @Column(name = "password")
 private String password;

 @Column(name = "confirmpassword")
 private String confirmpassword;

 @Column(name = "securityquestion")
 private String securityquestion;

 @Column(name = "securityanswer")
 private String securityanswer;

 @Column(name = "terms")
 private String terms;
 
 

 public User() {
	super();
	
}
 

public User(Long id, String fullname, String email, String phone, String dob, String gender, String address1,
		String address2, String postalcode, String state, String country, String password, String confirmpassword,
		String securityquestion, String securityanswer, String terms) {
	super();
	this.id = id;
	this.fullname = fullname;
	this.email = email;
	this.phone = phone;
	this.dob = dob;
	this.gender = gender;
	this.address1 = address1;
	this.address2 = address2;
	this.postalcode = postalcode;
	this.state = state;
	this.country = country;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.securityquestion = securityquestion;
	this.securityanswer = securityanswer;
	this.terms = terms;
}


// Getters and Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getFullname() {
     return fullname;
 }

 public void setFullname(String fullname) {
     this.fullname = fullname;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getPhone() {
     return phone;
 }

 public void setPhone(String phone) {
     this.phone = phone;
 }

 public String getDob() {
     return dob;
 }

 public void setDob(String dob) {
     this.dob = dob;
 }

 public String getGender() {
     return gender;
 }

 public void setGender(String gender) {
     this.gender = gender;
 }

 public String getAddress1() {
     return address1;
 }

 public void setAddress1(String address1) {
     this.address1 = address1;
 }

 public String getAddress2() {
     return address2;
 }

 public void setAddress2(String address2) {
     this.address2 = address2;
 }

 public String getPostalcode() {
     return postalcode;
 }

 public void setPostalcode(String postalcode) {
     this.postalcode = postalcode;
 }

 public String getState() {
     return state;
 }

 public void setState(String state) {
     this.state = state;
 }

 public String getCountry() {
     return country;
 }

 public void setCountry(String country) {
     this.country = country;
 }
//
// public String getProfilepic() {
//     return profilepic;
// }
//
// public void setProfilepic(String profilepic) {
//     this.profilepic = profilepic;
// }

 public String getPassword() {
     return password;
 }

 public void setPassword(String password) {
     this.password = password;
 }

 public String getConfirmpassword() {
     return confirmpassword;
 }

 public void setConfirmpassword(String confirmpassword) {
     this.confirmpassword = confirmpassword;
 }

 public String getSecurityquestion() {
     return securityquestion;
 }

 public void setSecurityquestion(String securityquestion) {
     this.securityquestion = securityquestion;
 }

 public String getSecurityanswer() {
     return securityanswer;
 }

 public void setSecurityanswer(String securityanswer) {
     this.securityanswer = securityanswer;
 }

 public String getTerms() {
     return terms;
 }

 public void setTerms(String terms) {
     this.terms = terms;
 }

@Override
public String toString() {
	return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", phone=" + phone + ", dob=" + dob
			+ ", gender=" + gender + ", address1=" + address1 + ", address2=" + address2 + ", postalcode=" + postalcode
			+ ", state=" + state + ", country=" + country + ", password=" + password + ", confirmpassword="
			+ confirmpassword + ", securityquestion=" + securityquestion + ", securityanswer=" + securityanswer
			+ ", terms=" + terms + "]";
}
 
}
