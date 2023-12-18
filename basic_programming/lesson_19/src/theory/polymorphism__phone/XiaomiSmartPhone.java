package theory.polymorphism__phone;

public class XiaomiSmartPhone extends BasicSmartPhone{
    public XiaomiSmartPhone(int batteryCapacity, double displayDiagonalInch, int storage, String generation) {
        super(batteryCapacity, displayDiagonalInch, storage, generation);
    }

    @Override
    public void unlock() {
        System.out.println("Hello from Xiaomi");
    }

    @Override
    public void sendMessage() {
        System.out.println("this message has been sent with xiaomi device");
    }

    // дополнительные спецефические методы

}
