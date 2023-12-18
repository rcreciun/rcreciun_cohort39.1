package theory.polymorphism__phone;

public class HuaweiSmartPhone extends BasicSmartPhone{
    public HuaweiSmartPhone(int batteryCapacity, double displayDiagonalInch, int storage, String generation) {
        super(batteryCapacity, displayDiagonalInch,  storage, generation);
    }

    @Override
    public void unlock() {
        System.out.println("Huawei greeting!");
    }

    @Override
    public void takePhoto() {
        super.takePhoto();
        System.out.println("Huawei watermark");
    }

     // дополнительные спецефические методы
}
