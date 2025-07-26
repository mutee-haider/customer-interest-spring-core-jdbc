# customer-interest-spring-core-jdbc
Calculating Customer interest  using Spring-core Jdbc

# Customer Interest Management System (Spring Core + JDBC)

A simple Java application using **Spring Core (IOC + Dependency Injection)** and **JDBC** to collect customer details, calculate simple interest, and store the data into a database.

## 🧾 Project Overview

This project demonstrates a 3-layered architecture:
 **Controller Layer**: Accepts user input.
 **Service Layer**: Contains business logic (simple interest calculation).
 **DAO Layer**: Handles database interaction using JDBC.

It uses Spring's IOC container for object creation and dependency injection via an XML-based configuration.

---

## 📌 Features

- Accepts customer name, address, principal amount, rate, and time
- Calculates Simple Interest using formula:  
  SI = (Principal × Rate × Time) / 100`
- Stores data in a relational database using plain JDBC
- Demonstrates use of:
  - Spring IOC and Dependency Injection (DI)
  - VO → DTO → BO design pattern
  - XML-based Spring configuration

---

## 🛠️ Technologies Used

- Java 17+ (Compatible with JDK 22)
- Spring Core (IOC, DI)
- JDBC
- Maven
- MySQL (or any RDBMS)
- IntelliJ IDEA (Recommended)

---

## 📂 Project Structure

<img width="976" height="369" alt="image" src="https://github.com/user-attachments/assets/6af1e655-1201-4da0-bf40-3e925d771aa9" />
src/
├── com.nt.controller # MainController (handles input logic)
├── com.nt.dto # CustomerDto (typed intermediate data)
├── com.nt.vo # CustomerVo (user input as strings)
├── com.nt.bo # CustomerBo (business object for DB)
├── com.nt.dao # CustomerDaoImpl (DB interaction)
├── com.nt.service # CustomerManagementImpl (business logic)
├── com.nt.test # RealTimeDITest (main class)
└── applicationContext.xml # Spring configuration


## Run the main class:

com.nt.test.RealTimeDITest


🔍 Concepts Demonstrated
Spring IOC container (BeanFactory, XML configuration)

Constructor-based dependency injection

Layered architecture with separation of concerns

Java wrapper classes and null safety

JDBC integration using DriverManagerDataSource

VO/DTO/BO design pattern



## 🗄️ Database Setup

## create database system
## create table realtimedi_customer

CREATE TABLE `realtimedi_customer` (
  `CUSTID` int NOT NULL AUTO_INCREMENT,
  `CUSTNAME` varchar(45) DEFAULT NULL,
  `CUSTADDRS` varchar(45) DEFAULT NULL,
  `PRINCIPLEAMT` double DEFAULT NULL,
  `TIME` float DEFAULT NULL,
  `RATE` float DEFAULT NULL,
  `INTRESTAMOUNT` float DEFAULT NULL,
  PRIMARY KEY (`CUSTID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
<img width="1085" height="215" alt="image" src="https://github.com/user-attachments/assets/3dca3b9b-dc5e-47cb-b160-5e4537cd2430" />


## 👤 Author

**Muhammad Mutee Haider**  
📧 Email: mutee.dev@gmail.com.com  
🔗 [LinkedIn](www.linkedin.com/in/muhammad-mutee-haider-21a910369)  
💻 [GitHub](https://github.com/mutee-haider)
