 📅 Exam Scheduler Backend

A RESTful backend service built with Spring Boot and PostgreSQL to help students manage upcoming exams across multiple classes. Designed as a clean, professional backend project to demonstrate real-world API development skills.

---

 ✨ Features

- Add, view, update, and delete exams
- Input validation to prevent bad data (e.g. invalid dates or blank fields)
- PostgreSQL integration using Spring Data JPA
- Modular service-controller-repository architecture
- Easily extendable with user authentication or frontend UI

---

 🛠 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

---

 📦 Sample API Usage

 ➕ Add Exam (POST `/api/exams`)
```json
{
  "subject": "CS3350",
  "date": "2025-07-10",
  "time": "19:30"
}
