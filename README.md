# DIO REST API - Decola Avanade

## Projeto criado para resolver o desafio de criar uma REST API durante o Bootcamp Decola AVANADE 2025
### Trata-se de um projeto de uma API para gerenciar clientes de um negócio de automação domiciliar
```mermaid
    classDiagram
        class User {
            +int id
            +String name
            +String document
            +String email
            +String phone
            +Address address
            +Account account
            +List<Sensor> sensors
        }
    
        class Address {
            +int id
            +String street
            +int number
            +String district
            +String city
            +String state
            +String country
            +String postalCode
        }
    
        class Account {
            +int id
            +String number
            +String type
            +boolean payment
            +boolean automation
        }
    
        class Sensor {
            +int id
            +String name
            +String type
            +String model
            +String resolution
            +String unit
            +String location
            +Reading lastReading
            +List<Reading> readingHistory
        }
    
        class Reading {
            +String timestamp
            +String binaryValue
            +double convertedValue
        }
    
        User --> Address
        User --> Account
        User --> "0..*" Sensor
        Sensor --> Reading
        Sensor --> "0..*" Reading : readingHistory

```