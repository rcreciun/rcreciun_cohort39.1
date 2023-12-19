package theory.interfaces;

/**
 * Интерфейс Phone предоставляет абстракцию для функционала телефона.
 * <p>
 * Этот интерфейс определяет основные действия, которые должен выполнять телефон.
 */
public interface Phone {
    void makeCall(String number);
    void receiveCall(String caller);
}
