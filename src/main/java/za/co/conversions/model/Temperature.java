package za.co.conversions.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Temperature")
public class Temperature {
    private float temp;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

}
