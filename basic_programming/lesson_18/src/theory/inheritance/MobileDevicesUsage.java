package theory.inheritance;

/**
 * класс для создания экземпляров классов Mobile[N]g
 * <p>
 * нужен для демонстрации наследования
 */
public class MobileDevicesUsage {
    public static void main(String[] args) {
        Mobile1g mobile1g = new Mobile1g(100);

        mobile1g.call();
        mobile1g.call();
        mobile1g.call();
    }
}
