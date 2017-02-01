package edu.knoldus

import java.sql._

/**
  * Created by knoldus on 1/2/17.
  */

import java.sql.{Connection, DriverManager}

trait connect {
  Class.forName("com.mysql.jdbc.Driver")
  val con1: Connection = DriverManager.getConnection("jdbc:mysql://localhost/scala_1", "root", "root")
  val stmt: Statement = con1.createStatement

}

class CurdAssignment extends connect{

  def insertion(): Int = {
  //  Class.forName("com.mysql.jdbc.Driver")
   // val con1: Connection = DriverManager.getConnection("jdbc:mysql://localhost/scala_1", "root", "root")
    //val stmt: Statement = con1.createStatement
    stmt.executeUpdate("insert into Employee(id,name,address,phone,dept_id,project_id) values(1,'Himanshu','Noida',9090,101,1001)")
    stmt.executeUpdate("insert into Department(id,name) values(101,'Java')")
    stmt.executeUpdate("insert into Project(id,name,dept_id,client_id) values(1001,'Carbonn Data',101,10001)")
    stmt.executeUpdate("insert into Client(id,name,address,project_id) values(10001,'TCS','Noida Delhi',1001)")
    1
  }

  def retrieval(): Int = {
    //Class.forName("com.mysql.jdbc.Driver")
    //val con1: Connection = DriverManager.getConnection("jdbc:mysql://localhost/scala_1", "root", "root")
    //val stmt: Statement = con1.createStatement
    val rs: ResultSet = stmt.executeQuery("select * from Employee")
    while (rs.next()) {
      println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6))
    }
    val rs1: ResultSet = stmt.executeQuery("select * from Client")
    while (rs1.next()) {
      println(rs1.getInt(1) + "  " + rs1.getString(2) + rs1.getString(3) + " " + rs1.getString(4))
    }
    val rs2: ResultSet = stmt.executeQuery("select * from Department")
    while (rs2.next()) {
      println(rs2.getInt(1) + "  " + rs2.getString(2))
    }
    val rs3: ResultSet = stmt.executeQuery("select * from Project")
    while (rs3.next()) {
      println(rs3.getInt(1) + "  " + rs3.getString(2) + rs3.getString(3) + " " + rs3.getString(4))
    }
    1
  }

  def deletion(): Int = {
    //Class.forName("com.mysql.jdbc.Driver")
    //val con1: Connection = DriverManager.getConnection("jdbc:mysql://localhost/scala_1", "root", "root")
    //val stmt: Statement = con1.createStatement
    stmt.executeUpdate("Delete from Employee")
    1
  }

}









