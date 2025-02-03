# Math Number Classifier API - Spring Boot
# This API provides interesting mathematical properties about a given number. It identifies whether a number is prime, perfect, Armstrong, odd/even, and calculates the sum of its digits. It also fetches a fun fact about the number from the Numbers API.

Features
Classify whether a number is prime, perfect, or Armstrong.
Identify if the number is odd or even.
Calculate the sum of its digits.
Fetch a fun fact about the number.
Handles CORS requests.
Provides JSON responses.

# API Specification
# Endpoint
GET /api/classify-number?number=<number>

Parameters
number (required): The number you want to classify. This must be a valid integer.
Response Format (200 OK)
json
Copy
{
    "number": 371,
    "is_prime": false,
    "is_perfect": false,
    "properties": ["armstrong", "odd"],
    "digit_sum": 11,
    "fun_fact": "371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371"
}
Response Format (400 Bad Request)
json
Copy
{
    "number": "alphabet",
    "error": true
}

# Properties Breakdown
is_prime: Boolean indicating if the number is prime.
is_perfect: Boolean indicating if the number is a perfect number.
properties: A list of strings containing the properties of the number ("armstrong", "odd", "even").
digit_sum: The sum of the digits of the number.
fun_fact: A fun fact about the number fetched from the Numbers API.
Technology Stack
Backend Language/Framework: Java (Spring Boot)
Hosting Platform: Heroku / AWS / Google Cloud / Azure (for deployment)
CORS Handling: Spring Boot CORS support
Requirements
Java 11 or higher
Spring Boot 2.x
Maven or Gradle for dependency management
Setup
Prerequisites
Install Java 11 or higher.
Install Maven (or Gradle if you prefer) for building the project.


Here's a README.md for your project, assuming you're using Spring Boot to implement the API that returns interesting mathematical properties about a given number:

Math Number Classifier API - Spring Boot
This API provides interesting mathematical properties about a given number. It identifies whether a number is prime, perfect, Armstrong, odd/even, and calculates the sum of its digits. It also fetches a fun fact about the number from the Numbers API.

Features
Classify whether a number is prime, perfect, or Armstrong.
Identify if the number is odd or even.
Calculate the sum of its digits.
Fetch a fun fact about the number.
Handles CORS requests.
Provides JSON responses.
API Specification
Endpoint
GET /api/classify-number?number=<number>

Parameters
number (required): The number you want to classify. This must be a valid integer.
Response Format (200 OK)
json
Copy
{
    "number": 371,
    "is_prime": false,
    "is_perfect": false,
    "properties": ["armstrong", "odd"],
    "digit_sum": 11,
    "fun_fact": "371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371"
}
Response Format (400 Bad Request)
json
Copy
{
    "number": "alphabet",
    "error": true
}
Properties Breakdown
is_prime: Boolean indicating if the number is prime.
is_perfect: Boolean indicating if the number is a perfect number.
properties: A list of strings containing the properties of the number ("armstrong", "odd", "even").
digit_sum: The sum of the digits of the number.
fun_fact: A fun fact about the number fetched from the Numbers API.
Technology Stack
Backend Language/Framework: Java (Spring Boot)
API Documentation: OpenAPI/Swagger (optional for documentation)
Hosting Platform: Heroku / AWS / Google Cloud / Azure (for deployment)
CORS Handling: Spring Boot CORS support
Requirements
Java 11 or higher
Spring Boot 2.x
Maven or Gradle for dependency management
Setup
Prerequisites
Install Java 11 or higher.
Install Maven (or Gradle if you prefer) for building the project.
Clone the repository:
bash
Copy
git clone https://github.com/yourusername/math-number-classifier-api.git
cd math-number-classifier-api
Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
Running Locally
Build the project using Maven (or Gradle):

bash
Copy
mvn clean install
Run the application:

bash
Copy
mvn spring-boot:run
The API will be available locally at http://localhost:8080/api/classify-number?number=371.

Deployment
To deploy the application to a cloud platform, follow the platform-specific steps (e.g., Heroku, AWS, Google Cloud, Azure).

Example for Heroku Deployment:
Install Heroku CLI and log in.

Create a new Heroku app:

bash
Copy
heroku create your-app-name
Add the files to Git:

bash
Copy
git init
git add .
git commit -m "Initial commit"
Push to Heroku:

bash
Copy
git push heroku master
Access your deployed API at the provided Heroku URL.

API Details
GET https://4345-105-112-125-190.ngrok-free.app/api/classify-number?number=371
Example Response (200 OK)
json
Copy
{
    "number": 371,
    "is_prime": false,
    "is_perfect": false,
    "properties": ["armstrong", "odd"],
    "digit_sum": 11,
    "fun_fact": "371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371"
}
Example Response (400 Bad Request)
json
Copy
{
    "number": "alphabet",
    "error": true
}
How It Works

# How It Works
Prime Check: The API checks if the number is a prime number.
Perfect Number Check: The API checks if the number is a perfect number (a number equal to the sum of its proper divisors).
Armstrong Check: The API checks if the number is an Armstrong number, which is a number that is equal to the sum of its own digits raised to the power of the number of digits.
Odd/Even Check: The API checks whether the number is odd or even.
Digit Sum: The sum of the digits is computed.
Fun Fact: A fun fact is fetched from the Numbers API using the number's value.
CORS Handling
This API is configured to handle Cross-Origin Resource Sharing (CORS) requests, which allows it to be called from different domains.

# License
This project is licensed under the MIT License - see the LICENSE file for details.
