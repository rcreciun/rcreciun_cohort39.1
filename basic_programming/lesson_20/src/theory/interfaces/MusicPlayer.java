package theory.interfaces;

/**
 * Интерфейс MusicPlayer представляет абстракцию для музыкального плеера.
 * <p>
 * Описывает основные действия для воспроизведения музыки.
 */
public interface MusicPlayer {
    void playMusic(String track);
    void stopMusic();
}

