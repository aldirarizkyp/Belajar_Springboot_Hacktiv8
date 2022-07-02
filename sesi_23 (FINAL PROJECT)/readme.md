
# FINAL PROJECT

Final Project ini merupakan sesi ke-23 dari pembelajaran Java SpringBoot. Topik dari final project ini yaitu membuat suatu Rest API dari aplikasi yang bertemakan Bus yang dimana seorang user admin dapat melakukan akses API pada Swagger dan Postman.

####
- SignUp 
- Login with JWT Token
- List all available stops
- Book a ticket 


### Authors 

- Name          : Aldiransyah Rizky Putra
- Kode Peserta  : JVSB001ONL019
- Link GitHub   : https://github.com/aldirarizkyp/Belajar_Springboot_Hacktiv8/tree/main/sesi_23%20(FINAL%20PROJECT)


## Project Dependencies
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Spring Boot Security Test
- MYSQL Connector Java
- JJWT ver. 0.9.1
- Springfox Swagger2 ver. 2.7.0
- Springfox SwaggerUI ver. 2.7.0
- Flyway Core
## How To Use (API Reference)


### User API
#### Register User/SignUp

```http
  POST http://localhost:8080/api/v1/user/signup
```
#### UpdateUser
```http
  PUT http://localhost:8080/api/v1/user/{id}
```
#### UpdatePassword
```http
  PUT http://localhost:8080/api/v1/password/{id}
```



### Auth API
#### Authentication/Login

```http
  POST http://localhost:8080/api/auth
```

### Agency API
#### Get All Agency

```http
  GET http://localhost:8080/api/v1/agency/
```
#### Get Agency By Id
```http
  GET http://localhost:8080/api/v1/agency/{id}
```
#### Add Agency
```http
  POST http://localhost:8080/api/v1/agency/
```
#### Update Agency
```http
  PUT http://localhost:8080/api/v1/agency/{id}
```
#### Get Agency By Id
```http
  DELETE http://localhost:8080/api/v1/agency/{id}
```