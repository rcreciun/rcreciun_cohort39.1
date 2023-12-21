package consultation2023_12_21;

public interface WashMachineInterface {
    /**
     * спецефические методы для стирки отдельных типов тканей
     */
    void washCottonClothes();
    void washWoolClothes();
    void washCilkClothes();

    /**
     * метод, возвращающий количество минут до окончания программы стирки
     * @return количество минут до окончания стирки
     */
    int timeToSwitchOf();
}
