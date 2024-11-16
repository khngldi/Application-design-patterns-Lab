public class WeatherDisplay implements IObserver {//жаңартылған температура деректерін көрсетеді
    private String name;
    public WeatherDisplay(String name) {
        this.name = name;
    }
    @Override
    public void update(float temperature) {
        System.out.println(name + " показывает новую температуру: " + temperature + "°C");
    }
}
