# Employee Management System

A Spring Boot REST API for managing employees — perform CRUD operations with MySQL database.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- REST API

## 📁 Features
✅ Add new employee  
✅ Update existing employee  
✅ Delete employee  
✅ Get all employees  
✅ Get employee by ID  

## 🧠 Endpoints
| Method | Endpoint | Description |
|--------|-----------|-------------|
| GET | `/api/employees` | Get all employees |
| GET | `/api/employees/{id}` | Get employee by ID |
| POST | `/api/employees` | Add new employee |
| PUT | `/api/employees/{id}` | Update employee |
| DELETE | `/api/employees/{id}` | Delete employee |

## 🛠️ Setup
1. Ensure you have Java 17 and Maven installed.
2. Create a MySQL database named `employees` and update credentials in `src/main/resources/application.properties`.
3. Run using:
   ```bash
   mvn spring-boot:run
   ```
4. Test APIs using Postman or curl:
   ```bash
   # add employee
   curl -X POST -H "Content-Type: application/json" -d '{"name":"Ali","dept":"IT","gender":"M","salary":25000,"age":28}' http://localhost:8080/api/employees
   ```

## ✨ Author
**Zulkaif Ahmad**  
📧 azulkaif@gmail.com  
🌐 [GitHub - Zulkaif120](https://github.com/Zulkaif120)
