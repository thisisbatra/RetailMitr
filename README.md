# RetailMitr

## 🚀 Project Overview
RetailMitr is an **ERP (Enterprise Resource Planning) solution** designed to help retailers efficiently manage their **sales, purchases, inventory, and financial reports**. The system automates business processes, reduces human errors, and provides actionable insights for better decision-making.

### **Features**
- ✅ Role-Based Authentication using JWT
- ✅ Sales & Purchase Management
- ✅ Inventory Tracking & Alerts
- ✅ Financial Reporting & Analytics
- ✅ Secure REST API with Swagger Documentation
- ✅ Scalable Backend with Spring Boot
- ✅ Future Frontend Integration with Angular

---

## 🛠 Installation & Setup

### **Prerequisites**
- Java 17+
- Spring Boot 3+
- PostgreSQL (or your preferred database)
- Maven
- Docker (optional for containerization)

### **Fork & Clone the Repository**
```bash
git clone https://github.com/your-repo/RetailMitr.git
cd RetailMitr
```

### **Backend Setup**
1. **Configure `.env` File** (For sensitive configurations like database and email settings)  
   Create a `.env` file in the backend root directory and add:
   ```ini
   DATABASE_URL=jdbc:postgresql://localhost:5432/retailmitr
   DATABASE_USERNAME=your_username
   DATABASE_PASSWORD=your_password
   ```

2. **Build & Run the Application**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📜 API Documentation
RetailMitr provides **Swagger (SpringDoc OpenAPI)** documentation for easy API testing and integration.

- **Swagger UI:**  
  Access API docs at:  
  👉 `http://localhost:8080/swagger-ui/`

---

## 🛠 Technologies Used

### **Backend:**
- **Spring Boot 3** - REST API Development
- **Spring Security & JWT** - Authentication & Role-Based Access Control
- **PostgreSQL** - Database Management
- **Docker** - Containerization
- **Swagger (SpringDoc OpenAPI)** - API Documentation

### **Frontend (Upcoming)**
- **Angular** - UI Framework
- **Material UI / TailwindCSS** - Styling
- **State Management** - (TBD)

---

## 👥 Contributors & Contact Info
| Name        | Role             | Contact                                         |
|-------------|----------------|-------------------------------------------------|
| Ajay Gour   | Backend Developer | [LinkedIn](https://linkedin.com/in/ajgour)      |
| Nitin Batra | Full Stack (Future) | [LinkedIn](https://linkedin.com/in/thisisbatra) |

For queries, raise an issue in the repo or contact at:  
📧 **Email**: batranitin118@gmail.com

---

## 🔥 Future Enhancements
- **Frontend Development using Angular**
- **Advanced Financial Analytics & Reporting**
- **Payment Gateway Integration**
- **Multi-Tenant Support for Large Retail Chains**
