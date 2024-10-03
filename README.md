Inventory Tracking Application

Overview
The inventory tracking application is an inventory managing and tracking system that allows users to efficiently manage parts an dproducts. Users can add, update, and delete parts and products through a simple HTML frontend, with a Java Backend handling the business logic. The application uses an H2 database for in-memory developement purposes. The application ensures data integrity through validation, including protection against SQL injection and enforcing quantity constraints. When a product is created, the required parts are automatically deducted from the parts inventory.

Features: 
Parts Management:
- Add new parts to the inventory
- Update existing part details (name, price, quantity, etc)
- Delete parts from the inventory
Product management:
- Add new products by selecting required parts
- Automatically deduct parts from the inventory when a product is created
- Update product details
- Delete products
Data validation:
- Ensure that part quantities are valid and within allowed ranges
- Prevent SQL injection through secure handling of user inputs

Technologies Used:
- Backend: Java (Spring boot)
- Frontend: HTML, CSS
- Database: H2 Database for development/testing (in-memory)
- API Communication: Rest APIs

Prerequisites: 
- Java Development Kit (JDK) 17 or higher
- Maven
- H2 Database

Installation instructions: 
Backend Setup:
- Clone the repository
- Run the backend application: mvn spring-boot:run

Future enhancements:
- User Authentication
- Advanced reporting
- Search and filtering
- Real-time notifications
