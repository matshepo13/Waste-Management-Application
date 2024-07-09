# Waste Management App

## Project Overview
This project is a waste management mobile application aimed at promoting sustainable waste management practices. The application serves as an educational tool for individuals and communities, providing guidance on proper waste disposal techniques and encouraging recycling habits.

## Repository
GitHub Repository: [waste-management-app](https:/@github.com:matshepo13/wasteapp.git)

## Project Structure

**Backend:** A Spring Boot application that exposes RESTful APIs to enable communication between the frontend and backend systems. The backend is responsible for handling data storage, retrieval, and manipulation.

**Frontend:** A Flutter application that provides a user-friendly interface for users to interact with the waste management system.

**Database:** H2 (in-memory database for development)

## Technologies Used
- **Frontend:** Flutter
- **Backend:** Spring Boot
- **Database:** H2 (in-memory database for development)

## Setup Instructions

### Prerequisites
- Java 11 or later
- Maven
- Flutter SDK

### Backend Setup
1. Clone the repository:
    ```bash
    git clone git@github.com:matshepo13/waste-management-app.git
    cd waste-management-app/backend
    ```
2. Build the Spring Boot application:
    ```bash
    mvn clean install
    ```
3. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup
1. Navigate to the frontend directory:
    ```bash
    cd ../frontend
    ```
2. Get Flutter dependencies:
    ```bash
    flutter pub get
    ```
3. Run the Flutter application:
    ```bash
    flutter run
    ```

## RESTful API Endpoints

### Waste Categories
- **Get all categories**
    ```http
    GET /api/categories
    ```
- **Get category by ID**
    ```http
    GET /api/categories/{id}
    ```
- **Create a new category**
    ```http
    POST /api/categories
    ```
- **Update a category**
    ```http
    PUT /api/categories/{id}
    ```
- **Delete a category**
    ```http
    DELETE /api/categories/{id}
    ```

### Disposal Guidelines
- **Get all guidelines**
    ```http
    GET /api/guidelines
    ```
- **Get guideline by ID**
    ```http
    GET /api/guidelines/{id}
    ```
- **Create a new guideline**
    ```http
    POST /api/guidelines
    ```
- **Update a guideline**
    ```http
    PUT /api/guidelines/{id}
    ```
- **Delete a guideline**
    ```http
    DELETE /api/guidelines/{id}
    ```

### Recycling Tips
- **Get all tips**
    ```http
    GET /api/tips
    ```
- **Get tip by ID**
    ```http
    GET /api/tips/{id}
    ```
- **Create a new tip**
    ```http
    POST /api/tips
    ```
- **Update a tip**
    ```http
    PUT /api/tips/{id}
    ```
- **Delete a tip**
    ```http
    DELETE /api/tips/{id}
    ```

## Input Validation
Input validation is implemented using Spring Boot validation annotations to ensure the integrity and validity of incoming requests and data payloads.

## Contribution Guidelines
1. Fork the repository
2. Create a new branch
    ```bash
    git checkout -b feature-branch
    ```
3. Commit your changes
    ```bash
    git commit -m 'Add some feature'
    ```
4. Push to the branch
    ```bash
    git push origin feature-branch
    ```
5. Create a new Pull Request

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.