package theory.polymorphism;

public class SmartWatch extends SmartDevice {
    private boolean hasHeartRateMonitor;

    public SmartWatch(boolean hasHeartRateMonitor) {
        super();
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    public void monitorHeartRate() {
        if (hasHeartRateMonitor) {
            System.out.println("Monitoring heart rate...");
        }
    }

    // ... Дополнительные уникальные методы и свойства ...
}
