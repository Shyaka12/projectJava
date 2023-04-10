/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academic.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joe
 */
@Entity
@Table(name = "studentdbs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentdbs.findAll", query = "SELECT s FROM Studentdbs s")
    , @NamedQuery(name = "Studentdbs.findByFirstname", query = "SELECT s FROM Studentdbs s WHERE s.firstname = :firstname")
    , @NamedQuery(name = "Studentdbs.findByLastname", query = "SELECT s FROM Studentdbs s WHERE s.lastname = :lastname")
    , @NamedQuery(name = "Studentdbs.findByUsername", query = "SELECT s FROM Studentdbs s WHERE s.username = :username")
    , @NamedQuery(name = "Studentdbs.findByEmail", query = "SELECT s FROM Studentdbs s WHERE s.email = :email")
    , @NamedQuery(name = "Studentdbs.findByTelephone", query = "SELECT s FROM Studentdbs s WHERE s.telephone = :telephone")
    , @NamedQuery(name = "Studentdbs.findByPassword", query = "SELECT s FROM Studentdbs s WHERE s.password = :password")
    , @NamedQuery(name = "Studentdbs.findByComfirmpassword", query = "SELECT s FROM Studentdbs s WHERE s.comfirmpassword = :comfirmpassword")
    , @NamedQuery(name = "Studentdbs.findByComfirmPassword", query = "SELECT s FROM Studentdbs s WHERE s.comfirmPassword = :comfirmPassword")})
public class Studentdbs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastname;
    @Id
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "telephone")
    private int telephone;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "comfirmpassword")
    private String comfirmpassword;
    @Basic(optional = false)
    @Column(name = "comfirm password")
    private String comfirmPassword;

    public Studentdbs() {
    }

    public Studentdbs(String username) {
        this.username = username;
    }

    public Studentdbs(String username, String firstname, String lastname, String email, int telephone, String password, String comfirmpassword, String comfirmPassword) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.comfirmpassword = comfirmpassword;
        this.comfirmPassword = comfirmPassword;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComfirmpassword() {
        return comfirmpassword;
    }

    public void setComfirmpassword(String comfirmpassword) {
        this.comfirmpassword = comfirmpassword;
    }

    public String getComfirmPassword() {
        return comfirmPassword;
    }

    public void setComfirmPassword(String comfirmPassword) {
        this.comfirmPassword = comfirmPassword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (username != null ? username.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentdbs)) {
            return false;
        }
        Studentdbs other = (Studentdbs) object;
        if ((this.username == null && other.username != null) || (this.username != null && !this.username.equals(other.username))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.academic.model.Studentdbs[ username=" + username + " ]";
    }
    
}
