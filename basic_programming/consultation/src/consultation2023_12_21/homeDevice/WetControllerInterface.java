package consultation2023_12_21.homeDevice;

/**
 * WetControllerInterface - интерфейс для контроля влажности помещения
 */
public interface WetControllerInterface {

    /**
     * метод служит для определения влажности в помещении
     * @return процент влажности
     */
    int getCurrentWetPercent();
}
