# Hospital Management System

Welcome to the Hospital Management System project. This Java-based application is designed to streamline hospital operations and improve patient care management.

## Project Overview

This project is a Hospital Management System developed using Java and Spring Boot. It provides functionalities for managing hospital operations, including patient records, doctor schedules, appointments, and billing.

## File Structure
```
hospital-management-system/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           ├── controller/
│       │           │   ├── AdminController.java
│       │           │   ├── DoctorController.java
│       │           │   └── PatientController.java
│       │           ├── model/
│       │           │   ├── User.java
│       │           │   ├── Doctor.java
│       │           │   └── Patient.java
│       │           ├── repository/
│       │           │   ├── UserRepository.java
│       │           │   ├── DoctorRepository.java
│       │           │   └── PatientRepository.java
│       │           └── service/
│       │               ├── UserService.java
│       │               ├── DoctorService.java
│       │               └── PatientService.java
│       └── resources/
│           ├── application.properties
│           └── templates/
│               ├── admin/
│               │   ├── dashboard.html
│               │   └── manage-users.html
│               ├── doctor/
│               │   ├── dashboard.html
│               │   └── patient-list.html
│               └── patient/
│                   ├── dashboard.html
│                   └── appointments.html
│
├── target/
│   ├── classes/
│   └── generated-sources/
│
├── pom.xml
└── README.md
```
## Functionalities

1. **Login System**: Secure authentication for admins, doctors, and patients.
2. **Admin Dashboard**: Manage doctors and patients, generate reports.
3. **Doctor Dashboard**: View assigned patients, update records, schedule appointments.
4. **Patient Dashboard**: View medical records, schedule appointments, view prescriptions.
5. **Appointment Management**: Create, edit, and cancel appointments.
6. **Medical Records**: Store and retrieve patient medical histories.
7. **Billing and Invoicing**: Generate bills and process payments.

## Getting Started

To run this project locally:

1. Ensure you have Java and Maven installed on your system.
2. Clone this repository.
3. Navigate to the project directory.
4. Run `mvn clean install` to build the project.
5. Run `mvn spring-boot:run` to start the application.
6. Access the application at `http://localhost:8080`.

## Dependencies

Main dependencies include:
- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Parent
- Spring Boot Maven Plugin

For a full list of dependencies, refer to the `pom.xml` file.

## Development Environment

This project is developed using Visual Studio Code. The workspace contains two main folders:

- `src`: for maintaining sources
- `lib`: for maintaining dependencies

Compiled output files are generated in the `bin` folder by default.

To customize the folder structure, modify the `.vscode/settings.json` file.

## Dependency Management

Use the `JAVA PROJECTS` view in VS Code to manage dependencies. For more information, visit [VS Code Java Dependency Management](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Author

Risheendra

## License

This project is licensed under the Apache License, Version 2.0.