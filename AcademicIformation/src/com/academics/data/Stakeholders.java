package com.academics.data;
// Generated 16-Dec-2021 16:53:30 by Hibernate Tools 4.3.1



/**
 * Stakeholders generated by hbm2java
 */
public class Stakeholders  implements java.io.Serializable {


     private String username;
     private String firstname;
     private String lastname;
     private String email;
     private String telephone;
     private String password;
     private String comfirmpassword;

    public Stakeholders() {
    }

	
    public Stakeholders(String username) {
        this.username = username;
    }
    public Stakeholders(String username, String firstname, String lastname, String email, String telephone, String password, String comfirmpassword) {
       this.username = username;
       this.firstname = firstname;
       this.lastname = lastname;
       this.email = email;
       this.telephone = telephone;
       this.password = password;
       this.comfirmpassword = comfirmpassword;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getComfirmpassword() {
        return this.comfirmpassword;
    }
    
    public void setComfirmpassword(String comfirmpassword) {
        this.comfirmpassword = comfirmpassword;
    }




}


