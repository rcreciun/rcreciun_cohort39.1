package theory.coffe_machine;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Clock implements ClockInterface{

    // поле timeZone хранит информацию о временной зоне.
    private ZoneId timeZone;

    public Clock(ZoneId timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public void showTime() {
        LocalTime time = LocalTime.now(timeZone);
        System.out.println("Текущее время: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    @Override
    public String toString() {
        return "Текущее время: " + LocalTime.now(timeZone).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public void setTimeZone(ZoneId newTimeZone) {
        this.timeZone = newTimeZone;
    }

    public ZoneId getTimeZone() {
        return timeZone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && !(obj instanceof Clock clock)) {
            return false;
        }

        Clock clock = (Clock) obj;

        return this.timeZone.equals(clock.timeZone);
    }
}

