package za.co.conversions.api;

import za.co.conversions.model.MileKM;
import za.co.conversions.model.Temperature;

public interface ConversionService {
    Temperature celsiusToKelvin(float celsius);
    Temperature kelvinToCelsius(float kelvin);

    MileKM kilometersToMiles(float kilometres);
    MileKM milesToKilometers(float miles);
}
