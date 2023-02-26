public class Phone implements Notifier{
    @Override
    public void weatherNotification(String weatherDescription) {
        if (weatherDescription.equalsIgnoreCase("rainy")) {
            System.out.print(generateWeatherAlert(weatherDescription));
        }
    }

    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
