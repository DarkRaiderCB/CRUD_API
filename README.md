# Firebase Integration with Spring Boot

This project demonstrates how to integrate Firebase with a Spring Boot application for performing CRUD operations. The project uses Firebase Firestore as the database to store user data.

## Prerequisites

- Java 17
- Maven
- Firebase Account
- A Spring Boot application

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/firebase-integration.git
cd firebase-integration
```

### 2. Create a Firebase Project

1. Go to the Firebase Console.
2. Click "Add project" and follow the setup steps.
3. Once your project is created, navigate to the project dashboard.
4. Create a Firestore Database within the project.

## 4. Download Firebase Admin SDK

1. In the Firebase Console, go to Project Settings.
2. Navigate to the "Service accounts" tab.
3. Click "Generate new private key" and download the JSON file.
4. Place this file in the src/main/resources directory and rename it to serviceAccountKey.json.

## 5. Build and Run the Application

1. Navigate to `firebase-integration/`. Run:

```bash
mvn clean install
mvn spring-boot:run
```

## 6. API Endpoints

1. Create a User

```bash
curl -X POST http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": \"1\", \"name\": \"John Doe\", \"subjectMarks\": {\"Math\": 90, \"Science\": 85}}"
```

2. Get a User

```bash
curl -X GET http://localhost:8080/users/1
```

3. Update a User

```bash
curl -X PUT http://localhost:8080/users -H "Content-Type: application/json" -d "{\"id\": \"1\", \"name\": \"Updated Name\", \"subjectMarks\": {\"Math\": 95, \"Science\": 90}}"
```

4. Delete a User

```bash
curl -X DELETE http://localhost:8080/users/1
```

### 7. Demonstration
You can watch a demonstration of this project in action in the following video: https://drive.google.com/file/d/1R8zT61qSSGm6-lmzSx1v7yN229lFSCVq/view?usp=drive_link

Thanks for visiting!!
