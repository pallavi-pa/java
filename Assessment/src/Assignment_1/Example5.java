package Assignment_1;
interface SmartDevice {
    void connectToWifi();
}
interface EnergyEfficient {
    void activatePowerSavingMode();
}

class Appliance {
    String brand = "LG";
    String model = "InstaView";
    int powerConsumption = 300;

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power Consumption: " + powerConsumption + "W");
    }
}


class SmartRefrigerator extends Appliance implements SmartDevice, EnergyEfficient {
    boolean wifiConnected = false;

    public void connectToWifi() {
        System.out.println("Connecting to Wi-Fi...");
        wifiConnected = true;
        System.out.println("Smart Refrigerator is now connected to Wi-Fi.");
    }

    public void activatePowerSavingMode() {
        System.out.println("Power Saving Mode activated.");
    }

    public void displaySmartRefrigeratorInfo() {
        displayInfo();
        System.out.println("Wi-Fi Connected: " + wifiConnected);
    }
}

class LuxurySmartRefrigerator extends SmartRefrigerator {
    boolean voiceControlEnabled = true;

    public void activateVoiceControl() {
        System.out.println("Voice control activated.");
    }

    public void displayLuxurySmartRefrigeratorInfo() {
        displaySmartRefrigeratorInfo();
        System.out.println("Voice Control Enabled: " + voiceControlEnabled);
    }
}

public class Example5 {
    public static void main(String[] args) {
        LuxurySmartRefrigerator myFridge = new LuxurySmartRefrigerator();
        myFridge.displayLuxurySmartRefrigeratorInfo();
        myFridge.connectToWifi();
        myFridge.activatePowerSavingMode();
        myFridge.activateVoiceControl();
    }
}
