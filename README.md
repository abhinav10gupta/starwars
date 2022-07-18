# starwars

This project is created to fetch the data from an URL based API - "https://swapi.dev/". 
Swapi has various end points - 

  1.  "people":    "https://swapi.dev/api/people/" 
  2.  "planets":   "https://swapi.dev/api/planets/" 
  3.  "films":     "https://swapi.dev/api/films/" 
  4.  "species":   "https://swapi.dev/api/species/" 
  5.  "vehicles":  "https://swapi.dev/api/vehicles/" 
  6.  "starships": "https://swapi.dev/api/starships/"

We need to fetch & process data from these API's as per the business logic and return a json resultset. 


# InformationController
This class is used to map the endpoints to the functions. It would accept the request and intiate the function with business logic.

# InformationService
It is an iterface with the abstract method to support future implementation. The current method getInfo() is implemented in InformationServiceImpl.

# InformationServiceImpl
The business logic & required validation is implmented in the class. 
The getInfo() method is called from the controller which implements the abstract method in the InformationService interface. 

# GetRequestRepository
This class helps to segregate different request. And supports to establish to connection.   

# GetConnection
The http connection required fro teh project is managed in this class. 



