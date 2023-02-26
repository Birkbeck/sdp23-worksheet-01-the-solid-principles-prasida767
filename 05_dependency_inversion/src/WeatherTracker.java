import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Notifier> notifier;

    public WeatherTracker(List<Notifier> notifiers) {
       this.notifier = notifiers;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        notifier.forEach(n -> n.weatherNotification(weatherDescription));
    }
}
