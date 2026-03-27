# 🚀 Subscription Tracker API (Spring Boot)

A robust and simple REST API designed to manage digital subscriptions (e.g., Netflix, Spotify, Amazon Prime). This project is built using **Spring Boot 3.x** and uses an **In-memory H2 Database** for quick testing and development.

## 📌 Project Overview
Managing multiple digital subscriptions can be a hassle. This Backend API provides a centralized solution where users can store, view, and manage their subscription details, including prices and expiry dates.

## 🛠 Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot 3.x
- **Data Access:** Spring Data JPA (Hibernate)
- **Database:** H2 (In-memory)
- **Build Tool:** Maven

## 🏗 Project Architecture
The project follows a standard **3-Tier Architecture** for clean code management:
1. **Controller Layer**: Handles REST API requests and responses.
2. **Service Layer**: Contains business logic and data processing.
3. **Repository Layer**: Communicates with the H2 Database using JPA.
4. **Model/Entity**: Defines the structure of the 'Subscription' data.

## 🚀 How to Run?
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/subhamsahoo-4/Subscription-Tracker-SpringBoot.git](https://github.com/subhamsahoo-4/Subscription-Tracker-SpringBoot.git)
