/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentDAO;

import StudentModel.StudentModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHYAKA
 */
public class Studentdao {
    String url ="jdbc:postgresql://localhost:5432/studentreg";
    String UserNames="postgres";
    String Password="Auca@123";
    Connection connect =null;
    PreparedStatement ps = null;
    ResultSet rs= null;
    Statement st =null;

    public Studentdao() {
    }
    public boolean savestudent(StudentModel students){
        boolean result= false;
      String sql="INSERT INTO studentregist VALUES(?,?,?,?,?,?)";
      try{
      DriverManager.registerDriver(new org.postgresql.Driver());
      connect=DriverManager.getConnection(url,UserNames,Password);
      ps = connect.prepareStatement(sql);
      ps.setString(1, students.getRegNo());
      ps.setString(2, students.getFirstname());
      ps.setString(3, students.getLastname());
      ps.setDate(4, new java.sql.Date(students.getDob().getTime()));
      ps.setString(5, students.getSem());
      ps.setString(6, students.getCourse());
      ps.executeUpdate();
      result = true;
      }catch(Exception Ex){
      
      Ex.printStackTrace();
      }finally{
        try {
            connect.close();
        } catch (Exception ex) {
            Logger.getLogger(Studentdao.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    return result;
}
    public boolean update(StudentModel students){
        boolean result =false;
        String sql = "UPDATE studentregist SET firstname=?,lastname=?,dob=?,sem=?,course WHERE regNo=?";
   
        try{
            // Register Driver
            DriverManager.registerDriver(new org.postgresql.Driver());
            //connecting Database and java
            connect =DriverManager.getConnection(url,UserNames,Password);
            //Create statement
            ps= connect.prepareStatement(sql);
            ps.setString(1, students.getRegNo());
            ps.setString(2, students.getFirstname());
            ps.setString(3, students.getLastname());
            ps.setDate(4, new java.sql.Date(students.getDob().getTime()));
            ps.executeUpdate();
            result = true;
        }catch(Exception exs){
            exs.printStackTrace();
           
        }finally{
         try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        return false;
       
   } 
//public ArrayList<StudentModel> retrieve(){
//        ArrayList<StudentModel> list=new ArrayList<>();
//        try {
//            //        Register Driver
//        DriverManager.registerDriver(new org.postgresql.Driver());
////        create connection
//        connect=DriverManager.getConnection(url,UserNames,Password);
//        String sql="select * from studentregist";
//        ps=connect.prepareStatement(sql);
//        rs=ps.executeQuery();
//            while (rs.next()) {
//                StudentModel student=new StudentModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6));
//                list.add(student);
//                
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//}   
public ArrayList<StudentModel> retrieve(){
        ArrayList<StudentModel> list=new ArrayList<>();
        try {
            //        Register Driver
        DriverManager.registerDriver(new org.postgresql.Driver());
//        create connection
        connect=DriverManager.getConnection(url,UserNames,Password);
        String sql="select * from studentregist";
        ps=connect.prepareStatement(sql);
        rs=ps.executeQuery();
            while (rs.next()) {
                StudentModel student=new StudentModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6));
                list.add(student);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
 public boolean deleteStudent(StudentModel student){
    
    boolean result=false;
    String sql="DELETE FROM student_registration WHERE reg_number=?";
    try {
//        Register Driver
        DriverManager.registerDriver(new org.postgresql.Driver());
//        create connection
        connect=DriverManager.getConnection(url,UserNames,Password);
//        create statement
        ps=connect.prepareStatement(sql);
        ps.setString(6, student.getRegNo());
        ps.executeUpdate();
        result=true;
        
    } catch (Exception ex) {
        ex.printStackTrace();
        result=false;
    }finally{
        try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return result;
}
}        

