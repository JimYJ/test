package com.sintwo.backendapi.routes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sintwo.backendapi.entitys.City;


@Path("/api")
public class Api {

    //path注解指定路径,get注解指定访问方式,produces注解指定了返回值类型，这里返回JSON
    @Path("/city")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public City get(){
        City city = new City();
        city.setId(1);
        city.setCityname("beijing");
        city.setCitycode("001");
        System.out.println(city.toString());
        return city;
    }
}