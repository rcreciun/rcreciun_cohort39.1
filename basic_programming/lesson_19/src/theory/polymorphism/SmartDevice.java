package theory.polymorphism;

public class SmartDevice {
    private boolean isConnectedToWiFi;
    private int batteryLevel;

    public SmartDevice() {
        this.isConnectedToWiFi = false;
        this.batteryLevel = 100;
    }

    public void connectToWiFi() {
        isConnectedToWiFi = true;
        System.out.println("Connected to Wi-Fi.");
    }

    public void disconnectFromWiFi() {
        isConnectedToWiFi = false;
        System.out.println("Disconnected from Wi-Fi.");
    }

    // ... Другие общие методы и свойства ...
}
