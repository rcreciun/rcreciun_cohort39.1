package consultation2023_12_21;

public interface BoatRuling {

    /**
     * showOilLevel() - показывает уровень масла в системе
     * @return количество масла в процентах в двигателе системы
     */
    int showOilLevel();

    /**
     * Метод moveForward() - должен обеспечивать движение вперед с минимальной скоростью для конкретного судна
     */
    void moveForward();

    /**
     * Метод moveForward() - должен обеспечивать движение вперед с заданной скоростью для конкретного судна
     */
    void moveForward(int speed);

    /**
     * Метод moveBack() - должен обеспечивать движение назад с минимальной скоростью для конкретного судна
     */
    void moveBack();

    /**
     * Метод moveBack() - должен обеспечивать движение назад с заданной скоростью для конкретного судна
     */
    void moveBack(int speed);

    /**
     * turnLeft() - обеспечивает поворот налево
     */
    void turnLeft();

    /**
     * turnRight() - обеспечивает поворот направо
     */
    void turnRight();

    /**
     * autoPilot() - включает автопилот и судно автоматически движется к указанным координатам
     * @param latitude - широта
     * @param longitude - долгота
     */
    void autoPilot(double latitude, double longitude);
}
