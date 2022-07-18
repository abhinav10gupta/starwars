# Starwars API

This project is created to fetch the data from an URL based API - "https://swapi.dev/". 
Swapi has various end points - 

  1.  "people":    "https://swapi.dev/api/people/" 
  2.  "planets":   "https://swapi.dev/api/planets/" 
  3.  "films":     "https://swapi.dev/api/films/" 
  4.  "species":   "https://swapi.dev/api/species/" 
  5.  "vehicles":  "https://swapi.dev/api/vehicles/" 
  6.  "starships": "https://swapi.dev/api/starships/"

We need to fetch & process data from these API's as per the business logic and return a json resultset. 


**Pre Requisites:** 

Java **11.0.15** <br>
Maven **3.6.1**  <br>
IntelliJ IDEA **2019.2.3** / any preffered  IDE  <br>
<br>

GIT command to clone repository:
```
git clone https://github.com/abhinav10gupta/starwars.git
```

**Developer Configurations:**

1. Intellij -> Preferences -> Compiler -> Java Compiler -> Per-module byte code version -> Target byte code version -> 11 [Target bytecode version should be same as java version]
2. Select starwars Project -> Right click -> Project Structure -> Project Settings -> Modules -> Sources -> Language Level -> 11<br>
                                                                               ... -> Modules -> Paths -> Output path -> ./starwars/target/classes<br>
                                                                               ... -> Modules -> Paths -> Target path -> ./starwars/target/test-classes<br>
                                                                              
3. Select starwars Project -> Right click -> Project Structure -> Project Settings -> Modules ->Dependencies -> Module SDK -> Java 11.0.15<br>




**API Endpoints:**

```
1. /information - Business Implmentation to fetch the required output. 
2. /help - To help the user with correct API details. 
```



# Implementation Logic 
  1. Get Name, Class & model of the Starship "Death Star" from https://swapi.dev/api/starships/Death/9, Parameters required starships & Death.
  2. Add the 3 values in a json object - starshipJsonData
  3. Add starshipJsonData into the jsonobject named jsonResultSet. 
  4. Get json data from people API "Darth Vader" is using from https://swapi.dev/api/people/4. Parameter required - "Darth" 
  5. Get the ship URI - "https://swapi.dev/api/starships/13/"
  6. Hit the startshipURL, from responseObject get the crew value json response. If the crew value is null set it to 0. Add teh crew data to jsonResultSet.
  7. Get json data from people API "Leia Organa" is using from https://swapi.dev/api/people/5
  9. Take planet URI from json response. 
  10. From Planet URL get the name of the planet captured in response object. 
  11. Check if planet is equals to "Aleraan". 
  12. if "true: add isLeiaOnPlanet as true else value should be false. 





