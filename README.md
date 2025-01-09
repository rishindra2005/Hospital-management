
# Hospital Management System

## Project Overview

This Java-based Hospital Management System is designed to streamline hospital operations and improve patient care management. It provides functionalities for managing hospital operations, including patient records, doctor schedules, appointments, and billing.

## Getting Started

1. Ensure you have Java and Maven installed on your system.
2. Clone this repository.
3. Navigate to the project directory.
4. Run `mvn clean install` to build the project.
5. Run `mvn spring-boot:run` to start the application.
6. The application will automatically open in your default web browser at `http://localhost:8080`.

## Project Structure

```
hospital-management-system/
│
├── src/
│   ├── main/
│       ├── java/
│       |   └── com/
│       │       └── example/
|       |           ├── Appointment.java
|       |           ├── Bed.java
|       |           ├── Doctor.java 
|       |           ├── Patient.java
│       │           └── App.java
│       └── resources/
│           └── templates/
│               ├── appointments.html
│               ├── availableBeds.html
│               ├── billing.html
│               ├── dashboard.html
│               ├── doctorDashboard.html
│               ├── login.html
|               ├── index.html
│               └── patientDashboard.html
│   
|
├── target/
│   ├── classes/
│   │   └── com/
│   │       └── example/
│   │           ├── App.class
│   │           ├── Appointment.class
│   │           ├── Doctor.class
│   │           ├── Bed.class
│   │           └── Patient.class
|   |    
│   ├── templates/ 
|   |   ├── appointments.html
|   |   ├── availableBeds.html
|   |   ├── billing.html
|   |   ├── dashboard.html
|   |   ├── doctorDashboard.html
|   |   ├── login.html
|   |   ├── index.html
|   |   └── patientDashboard.html
|   |  
|   |  
│   └── hospital-management-system-1.0-SNAPSHOT.jar
│
├── pom.xml
└── README.md
```

## Key Functionalities

1. **Login System** (`login.html`)
   - Secure authentication for administrators, doctors, and patients.

2. **Admin Dashboard** (`dashboard.html`)
   - Overview of hospital statistics and management options.
   - Access to all system functionalities.

3. **Doctor Dashboard** (`doctorDashboard.html`)
   - View and manage appointments.
   - Access and update patient medical records.

4. **Patient Dashboard** (`patientDashboard.html`)
   - View personal medical history.
   - Schedule new appointments.
   - Access billing information.

5. **Appointment Management** (`appointments.html`)
   - Schedule, view, and manage appointments.
   - Integration with doctor schedules and patient records.

6. **Billing and Invoicing** (`billing.html`)
   - Generate and manage patient bills.
   - Track payments and outstanding balances.

7. **Bed Management** (`availableBeds.html`)
   - Real-time tracking of available hospital beds.
   - Bed allocation and release management.

8. **Application Shutdown** (accessible from `index.html`)
   - Convenient shutdown feature accessible from the main dashboard.
   - Shutdown button represented by a power symbol (⏻) in the bottom right corner.
   - Confirmation prompt before shutting down the application.
   - Allows for graceful termination of the application for all users.
## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Parent
- Spring Boot Maven Plugin
- java.io.IOException (Java Standard Library)
- org.slf4j.Logger (SLF4J API)
- org.slf4j.LoggerFactory (SLF4J API)

## Development Environment

This project is developed using Visual Studio Code. The workspace contains two folders by default:
- `src`: the folder to maintain sources
- `pom.xml`: the folder to maintain dependencies
- `src/main/resources/application.properties`: the file to configure application settings change `server.port=9090` to change port number

   

Meanwhile, the compiled output files are generated in the `target` folder by default.

The project uses SLF4J (Simple Logging Facade for Java) for logging purposes. The `Logger` and `LoggerFactory` classes from the `org.slf4j` package are used to create and manage loggers throughout the application.

The `java.io.IOException` class is used for handling I/O related exceptions, which may occur during file operations or network communications within the application.

Meanwhile, the compiled output files are generated in the `target` folder by default.
## Author

Risheendra

## License

Copyright 2023 Risheendra

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
