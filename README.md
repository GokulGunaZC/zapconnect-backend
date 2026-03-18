# 🚀 ZapConnect Backend

A scalable backend system for a social collaboration platform where users can create posts, respond, tag interests, and form groups with real-time chat.

---

## 📌 Features

- User Authentication (JWT आधारित security)
- Post creation and discovery
- Tag-based filtering
- Responses to posts
- 1-to-1 Chat system
- Group creation from posts
- Group chat with members
- Location-based users (Latitude & Longitude)

---

## 🏗️ Tech Stack

- Java (Spring Boot)
- PostgreSQL
- JWT Authentication
- Maven/Gradle
- Swagger & Postman (API Testing)

---

## 🧩 Database Design

### 👤 USERS
```sql
id BIGSERIAL PRIMARY KEY
name VARCHAR(100)
email VARCHAR(150) UNIQUE NOT NULL
password VARCHAR(255)
latitude FLOAT
longitude FLOAT
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
