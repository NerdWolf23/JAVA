# Student web Service #
<b>Project Description</b> <br>
This is a simple project that describes the main features and functionality of SpringBoot & Jpa frameworks with PostgreSql DB.
The Project consist to manage datas in Postgres DB. Datas (in this case Student Objects) are reached from Rest Controller which provide methods to perform CRUD operations.

-Student Class (mapped with annotation SpringBoot-Jpa Annotations);
-StudentCofig Class (It is used to execute a initial "query" to save some students on db after the Spring Boot application started);
-StudentController Class (Rest Controller);
-StudentRepository Class (it extends JpaRepository DAO interface to use its methods);
-StudentService Class (it's a service layer  that implemets StudentRepository Class logic inside its methods)
