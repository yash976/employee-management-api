# Employment Management API (Spring Boot + MySQL)

A complete RESTful backend service built using **Spring Boot**, **Spring Data JPA**, and **MySQL**, designed to manage employee records with clean architecture and production-ready code structure.

---

## 🚀 Features
- Create new employees  
- Fetch all employees  
- Fetch employee by ID  
- Update employee details  
- Delete employee  
- Layered architecture (Controller → Service → Repository → DB)  
- MySQL database integration  
- Exception handling  
- Lombok for cleaner code  

---

## 🛠 Tech Stack
**Backend:** Spring Boot, Spring Data JPA  
**Language:** Java  
**Database:** MySQL  
**Tools:** Maven, Postman, Git  
**Build Tool:** Maven  

---

## 📁 Project Structure
```
src/main/java/com/employment/management/
 ├── controller/
 ├── model/
 ├── repository/
 ├── service/
 ├── service/impl/
 └── EmploymentManagementApiApplication.java
```

---

## ⚙️ API Endpoints

### ➤ Create Employee  
**POST** `/api/employees`

### ➤ Get All Employees  
**GET** `/api/employees`

### ➤ Get Employee by ID  
**GET** `/api/employees/{id}`

### ➤ Update Employee  
**PUT** `/api/employees/{id}`

### ➤ Delete Employee  
**DELETE** `/api/employees/{id}`

---

## 🗄 Database Configuration

Located in:

`src/main/resources/application.properties`

Default values:

```
spring.datasource.url=jdbc:mysql://localhost:3306/employmentdb
spring.datasource.username=root
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## 📦 How to Run

1️⃣ Create database:

```
CREATE DATABASE employmentdb;
```

2️⃣ Update DB credentials if required  
3️⃣ Run the project:

```
mvn spring-boot:run
```

---

## 🙌 Author
**Yash Advani**  
Java Backend Developer  
GitHub: https://github.com/YashAdvani973  
LinkedIn: https://www.linkedin.com/in/yash-advani/

---

⭐ If you like this project, consider giving it a **star** on GitHub! 
