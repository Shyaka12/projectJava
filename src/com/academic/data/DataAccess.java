/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academic.data;

import com.academic.view.AcademicSignUpForm;
import com.academic.view.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrator
 */
public class DataAccess {
    public void saveStudent(AcademicSignUpForm asf){
        try{
           Session session= HibernateUtil.getSessionFactory().openSession();
           Transaction tx=session.beginTransaction();
           session.save(asf);
           tx.commit();
           session.close();
        }catch(HibernateException ex){
        }
    }
    public void saveStaff(AcademicSignUpForm asf){
        try{
           Session session= HibernateUtil.getSessionFactory().openSession();
           Transaction tx=session.beginTransaction();
           session.save(asf);
           tx.commit();
           session.close();
        }catch(HibernateException ex){
        }
    }
    public void saveStakeholder(AcademicSignUpForm asf){
        try{
           Session session= HibernateUtil.getSessionFactory().openSession();
           Transaction tx=session.beginTransaction();
           session.save(asf);
           tx.commit();
           session.close();
        }catch(HibernateException ex){
        }
    }
}
