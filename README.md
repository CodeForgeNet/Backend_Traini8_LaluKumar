<<<<<<< HEAD
# Backend_Traini8_LaluKumar
=======
# Traini8 Backend Project

This project is a Spring Boot application for managing a registry of government-funded training centers.

## Prerequisites

- Java 21
- Maven
- MySQL
- Eclipse IDE (or any other IDE that supports Spring Boot)
- Postman (for testing APIs)

## Setup Instructions

### Clone the Repository

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/CodeForgeNet/Backend_Traini8_LaluKumar.git

2. Import the Project: Open Spring Tool Suite 4 (or your preferred IDE) and import the project as an existing Maven project.
3. Configure Database Credentials: Update the src/main/resources/application.properties file with your MySQL credentials:
   spring.datasource.url=jdbc:mysql://localhost:3306/traini8?useSSL=false&serverTimezone=UTC
   spring.datasource.username=your_username
   spring.datasource.password=your_password

4.Run the Application: Right-click on the main application class (Traini8Application.java) and select Run As -> Spring Boot App.


###Testing the APIs
1.Open Postman: Launch Postman to test the APIs.
2.Test the POST API:
    -Create a new request in Postman.
    -Set the request type to POST.
    -Enter the URL: http://localhost:8080/api/training-centers.
    -Go to the Body tab, select raw, and choose JSON.
    -Enter the following JSON data: 

    
    {
    "centerName": "Traini8 ",
    "centerCode": "ABC123456789",
    "address": {
        "detailedAddress": "123 Sector19",
        "city": "Noida",
        "state": "UttarPradesh",
        "pincode": "201301"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Java Programming", "Web Development", "Data Science"],
    "contactEmail": "contact@traini.com",
    "contactPhone": "+1234567890"
    }


    
    -Click Send to create a new training center.

3.Test the GET API:
  -Create a new request in Postman.
  -Set the request type to GET.
  -Enter the URL: http://localhost:8080/api/training-centers.
  -Click Send to retrieve the list of training centers.
      

  
>>>>>>> 837a989 (initial commit)
