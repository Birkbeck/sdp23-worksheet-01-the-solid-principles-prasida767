public class Emailer implements Notifier {
    @Override
    public void weatherNotification(String weatherDescription) {
        if (weatherDescription.equalsIgnoreCase("sunny")) {
            String alert = generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }

    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
