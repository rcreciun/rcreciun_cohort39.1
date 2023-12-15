package theory.inheritance;

import java.util.List;

/**
 * класс для создания экземпляров классов Mobile[N]g
 * <p>
 * нужен для демонстрации наследования
 */
public class MobileDevicesUsage {
    public static void main(String[] args) {
        useMobile1g();
        useMobile2g();
        useMobile3g();


        List
    }

    // использование базового класса Mobile1g
    static void useMobile1g() {
        Mobile1g mobile1g = new Mobile1g(100);

        mobile1g.call();

        System.out.println("mobile1g instanceof Mobile1g = " + (mobile1g instanceof Mobile1g));
        System.out.println("\n----------------------------------------------------------------\n");

    }

    // использование класса Mobile2g доказывает, что нет необходимости повторного создания метода call(),
    // можно использовать родительский метод
    static void useMobile2g() {
        Mobile2g mobile = new Mobile2g(200);

        mobile.call();

        mobile.sendSMS("hello there!");
        mobile.sendSMS("hello there! tooooooooo loooong messssage");

        System.out.println("mobile2g instanceof Mobile1g = " + (mobile instanceof Mobile1g));
        System.out.println("mobile2g instanceof Mobile2g = " + (mobile instanceof Mobile2g));
        System.out.println("\n----------------------------------------------------------------\n");
    }

    // ключевое отличе в том, что мы исправили метод sendSMS, переопредлив этот метод в классе Mobile3g
    static void useMobile3g() {
        Mobile3g mobile = new Mobile3g(333);

        mobile.call();

        mobile.sendSMS("hello there!");
        mobile.sendSMS("hello there! tooooooooo loooong messssage");

        mobile.internetAccess();

        System.out.println("mobile3g instanceof Mobile1g = " + (mobile instanceof Mobile1g));
        System.out.println("mobile3g instanceof Mobile2g = " + (mobile instanceof Mobile2g));
        System.out.println("mobile3g instanceof Mobile4g = " + (mobile instanceof Mobile3g));
        System.out.println("\n----------------------------------------------------------------\n");
    }
}
