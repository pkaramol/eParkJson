/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epark.json;

/**
 *
 * @author pkaramol
 */
import net.sf.json.JSONObject;
/**
 * Hello world!
 *
 */
public class TestMain 
{
    public static void main( String[] args ){
       
        JsonConverter jconvert = new JsonConverter("INOFFLINE", 1, "PK001", "TAG001", "Some random data", "23/10/2013", 12);
        
        JSONObject jconverterObj = jconvert.getJsonObj();
        
       
        String jsonString = jconverterObj.toString(2);
        
        System.out.println("VehicleArrival: " + jsonString);
    }
}
