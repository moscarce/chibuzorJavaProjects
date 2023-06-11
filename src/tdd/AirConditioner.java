package tdd;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;
    public AirConditioner(String productName){
        this.productName = productName;
    }

    public void setOn(boolean status) {
        this.temperature = 16;
        this.isOn = status;
    }

    public boolean getIsOn() {
        return isOn;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(String productName) {
        return productName;
    }

    public void setTemperature(int temperature) {
        if (isOn && temperature >= 16 && temperature <= 30)this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperature(){
        if (isOn && temperature < 30 && temperature > 16)temperature++;
    }
    public void decreaseTemperature(){
        if (isOn && temperature > 16 && temperature < 30)temperature--;
    }
}
