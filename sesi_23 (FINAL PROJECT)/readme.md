
# FINAL PROJECT

Final Project ini merupakan sesi ke-23 dari pembelajaran Java SpringBoot. Topik dari final project ini yaitu membuat suatu Rest API dari aplikasi yang bertemakan Bus yang dimana seorang user admin dapat melakukan akses API pada Swagger dan Postman.

####
- SignUp 
- Login with JWT
-
-
-


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

Penggunaan API dapat dilakukan dengan melakukan perintah dibawah dengan menggunakan Swagger atau Postman.
## User API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut :

| Attributes  | Data Type |
| ------------- | ------------- |
| code  | String  |
| details  | String  |
| email  | String  |
| firstName  | String  |
| lastName  | String  |
| mobileNumber  | String  |
| name  | String  |
| password | String  |
| role  | String  |
| username  | String  |


### Register User/SignUp

```http
  POST http://localhost:8080/api/v1/user/signup
```
### UpdateUser
```http
  PUT http://localhost:8080/api/v1/user/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### UpdatePassword
```http
  PUT http://localhost:8080/api/v1/password/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |




## Auth API

Membutuhkan struktur body seperti berikut:

| Attributes  | Data Type |
| ------------- | ------------- |
| password  | String  |
| username | String  |


### Authentication/Login

```http
  POST http://localhost:8080/api/auth
```

## Agency API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| code  | String  |
| details  | String  |
| name  | String  |
| owner  | Long  |

### Get All Agency
```http
  GET http://localhost:8080/api/v1/agency/
```
### Get Agency By Id
```http
  GET http://localhost:8080/api/v1/agency/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Agency
```http
  POST http://localhost:8080/api/v1/agency/
```
### Update Agency
```http
  PUT http://localhost:8080/api/v1/agency/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Delete Agency By Id
```http
  DELETE http://localhost:8080/api/v1/agency/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |


## Bus API
Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| capacity  | Long  |
| code  | String  |
| make  | String  |

### Get All Bus
```http
  GET http://localhost:8080/api/v1/bus/
```
### Get Bus By Agency Id
```http
  GET http://localhost:8080/api/v1/bus/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Bus By Agency Id
```http
  POST http://localhost:8080/api/v1/bus/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Update Bus
```http
  PUT http://localhost:8080/api/v1/bus/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Delete Bus
```http
  DELETE http://localhost:8080/api/v1/bus/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

## Trip Schedule API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| available_seats  | int  |
| available_seats  | String  |
| trip_detail  | long  |

### Get All Trip Schedule
```http
  GET http://localhost:8080/api/v1/trip_schedule/
```
### Get Trip Schedule By Id
```http
  GET http://localhost:8080/api/v1/trip_schedule/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Trip Schedule
```http
  POST http://localhost:8080/api/v1/trip_schedule/
```
### Update Trip Schedule
```http
  PUT http://localhost:8080/api/v1/trip_schedule/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Delete Trip Schedule
```http
  DELETE http://localhost:8080/api/v1/trip_schedule/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

## Trip API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| agencyId  | long  |
| busId  | long  |
| destStopId  | long  |
| fare  | int  |
| journeyTime  | int  |
| sourceStopId  | long  |

### Get All Trip
```http
  GET http://localhost:8080/api/v1/trip/
```
### Get Trip By Agency Id
```http
  GET http://localhost:8080/api/v1/trip/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Trip 
```http
  POST http://localhost:8080/api/v1/trip/
```
### Update Trip
```http
  PUT http://localhost:8080/api/v1/trip/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Delete Trip
```http
  DELETE http://localhost:8080/api/v1/trip/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

## Ticket API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| cancellable  | Booelan  |
| journeyDate  | String |
| passegerId  | long  |
| seatNumber  | int  |
| tripScheduleId  | long  |

### Get All Ticket
```http
  GET http://localhost:8080/api/v1/ticket/
```
### Get Ticket By Id
```http
  GET http://localhost:8080/api/v1/ticket/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Ticket
```http
  POST http://localhost:8080/api/v1/ticket/
```
### Update Ticket
```http
  PUT http://localhost:8080/api/v1/ticket/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Delete Ticket
```http
  DELETE http://localhost:8080/api/v1/ticket/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

## Stop API

Note : Untuk POST dan PUT dibutuhkan struktur body sebagai berikut : 
| Attributes  | Data Type |
| ------------- | ------------- |
| code  | String  |
| detail  | String |
| id  | long  |
| name  | String  |

### Get All Stops
```http
  GET http://localhost:8080/api/v1/stop/
```
### Get Stop By Code
```http
  GET http://localhost:8080/api/v1/stop/code/{code}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| code  | String  |


### Get Stop By Name
```http
  GET http://localhost:8080/api/v1/stop/name/{name}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| name  | String  |


### Get Stop By Id
```http
  GET http://localhost:8080/api/v1/stop/{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |

### Add Stop
```http
  POST http://localhost:8080/api/v1/stop/
```
### Delete Stop
```http
  DELETE http://localhost:8080/api/v1/stop{id}
```
Membutuhkan parameter id sebagai berikut:
| Attributes  | Data Type |
| ------------- | ------------- |
| id  | long  |
