package com.partior.starwars.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.partior.starwars.entities.PartiorInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoServiceImpl implements InfoService{

    //Values from DB would come here So all request would go from here.

    List<PartiorInfo> infoList;

    InformationService infoService = new InformationService();
    GetRequestRepository repository = new GetRequestRepository(infoService);


    public InfoServiceImpl(){
        infoList = new ArrayList<PartiorInfo>();
        JsonObject jsonObject ;
        JsonArray results;

        jsonObject = repository.getAll("starships", "Death");
        results = jsonObject.getAsJsonArray("results");
        JsonObject starship = results.get(0).getAsJsonObject();

        // Save in local variable
        String name = starship.get("name").getAsString();
        String starship_class = starship.get("starship_class").getAsString();
        String model = starship.get("model").getAsString();


        // Get Values of the Starship "Darth" is using.
        jsonObject = repository.getAll("people", "Darth");
        results = jsonObject.getAsJsonArray("results");
        starship = results.get(0).getAsJsonObject();


        // Getting URI of the starship
        JsonArray startshipURL = starship.getAsJsonArray("starships");


        //Getting the crew value from the json response.
        jsonObject = repository.innerRequest(startshipURL.get(0).getAsString());
        String crew = jsonObject.get("crew").getAsString();


        // Fetching details of the planet inwhich Princess "Leia" is residing.
        jsonObject = repository.getAll("people", "Leia");
        results = jsonObject.getAsJsonArray("results");
        JsonObject planetObj = results.get(0).getAsJsonObject();


        jsonObject = repository.innerRequest(planetObj.get("homeworld").getAsString());
        String planet = jsonObject.getAsJsonPrimitive("name").getAsString();

        boolean isLeiaOnPlanet = false;
        // Validating of the planet in which Leia is "Alderaan".
        // If planet is Alderaan true is returned for isLeiaOnPlanet
        // If the panet is not Alderaan false is returned for isLeiaOnPlanet.
        if(planet.equals("Alderaan"))
             isLeiaOnPlanet = true;

        infoList.add(new PartiorInfo(name, starship_class,model, crew, isLeiaOnPlanet));
    }

    @Override
    public List<PartiorInfo> getInfo() {
        return infoList;
    }
}
