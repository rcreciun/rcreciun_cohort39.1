package consultation2023_12_21.homeDevice;

/**
 * TemperatureControlInterface - интерфейс для контроля температуры помещения
 */
public interface TemperatureControlInterface {

    /**
     * метод служит для определения температуры в помещении
     * @return возвращает температуру в цельсиях
     */
    double getCurrentTemperature();
}
