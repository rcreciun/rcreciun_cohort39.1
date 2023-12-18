package theory.polymorphism__phone;

public class SmartPhoneUsage {

    public static void main(String[] args) {
        IPhoneSmartPhone iPhone = new IPhoneSmartPhone(4000, 5.1, 128, "5g");
        XiaomiSmartPhone xiaomi = new XiaomiSmartPhone(4800, 4.5, 256, "5g");
        HuaweiSmartPhone huawei = new HuaweiSmartPhone(5200, 4.9, 1000, "6g");
        BasicSmartPhone basic = new BasicSmartPhone(3000, 3.5, 32, "3g");

        useSmartPhone(iPhone);
        useSmartPhone(xiaomi);
        useSmartPhone(huawei);
        useSmartPhone(basic);
    }


    public static void useSmartPhone(BasicSmartPhone phone) {
        phone.unlock();
        phone.takePhoto();
        phone.sendMessage();
        phone.internetConnection();
    }
}
