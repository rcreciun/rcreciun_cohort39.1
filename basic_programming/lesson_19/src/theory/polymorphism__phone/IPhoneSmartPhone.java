package theory.polymorphism__phone;

public class IPhoneSmartPhone extends BasicSmartPhone{
    public IPhoneSmartPhone(int batteryCapacity, double displayDiagonalInch,  int storage, String generation) {
        super(batteryCapacity, displayDiagonalInch, storage, generation);
    }

    @Override
    public void internetConnection() {
        System.out.println("Safari internet connection");
    }

    @Override
    public void sendMessage() {
        System.out.println("iMessage has been sent");
    }

    // дополнительные спецефические методы

}
