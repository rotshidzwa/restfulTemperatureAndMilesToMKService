package za.co.conversions.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MileKm")
public class MileKM {
    private float result;

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
