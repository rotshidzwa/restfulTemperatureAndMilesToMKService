package za.co.conversions.service;

import za.co.conversions.api.ConversionService;
import za.co.conversions.model.MileKM;
import za.co.conversions.model.Temperature;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/conversion")
public class ConversionServiceImpl implements ConversionService {

    private static final float CONVERSION_TEMP = 273.15F;
    private static final float MILE_TO_KM = 1.6F;

    @Path("/test")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest() {
        return "HELLO TEST";
    }

    @Override
    @GET
    @Path("/ctok/{celsius}")
    public Temperature celsiusToKelvin(float celsius) {
        Temperature temperature = new Temperature();
        temperature.setTemp(celsius + CONVERSION_TEMP);
        return temperature;
    }

    @Override
    @GET
    @Path("/ktoc/{kelvin}")
    public Temperature kelvinToCelsius(float kelvin) {
        Temperature temperature = new Temperature();
        temperature.setTemp(kelvin - CONVERSION_TEMP);
        return temperature;
    }

    @Override
    @GET
    @Path("/ktom/{kilometres}")
    public MileKM kilometersToMiles(float kilometres) {
        MileKM mileKM = new MileKM();
        mileKM.setResult(kilometres / MILE_TO_KM);
        return mileKM;
    }

    @Override
    @GET
    @Path("/mtok/{miles}")
    public MileKM milesToKilometers(float miles) {
        MileKM mileKM = new MileKM();
        mileKM.setResult(miles * MILE_TO_KM);
        return mileKM;
    }
}
