package theory.polymorphism;

public class DeviceManager {
    public void connectDeviceToWiFi(SmartDevice device) {
        // общая логика подключения у любого смарт девайса
        device.connectToWiFi();

        if (device instanceof SmartPhone) {
            SmartPhone phone = (SmartPhone) device;
            phone.takePhoto();
        } else if (device instanceof SmartWatch) {
            SmartWatch watch = (SmartWatch) device;
            watch.monitorHeartRate();
        }
    }

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone(12); // 12 мегапикселей камеры
        SmartWatch watch = new SmartWatch(true); // С монитором сердечного ритма

        DeviceManager manager = new DeviceManager();
        manager.connectDeviceToWiFi(phone); // Полиморфизм и восходящее преобразование
        manager.connectDeviceToWiFi(watch); // Полиморфизм и восходящее преобразование
    }
}
