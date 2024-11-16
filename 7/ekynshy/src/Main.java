public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay mobileApp = new WeatherDisplay("Мобильное приложение");
        WeatherDisplay digitalBillboard = new WeatherDisplay("Электронное табло");

        weatherStation.registerObserver(mobileApp);
        weatherStation.registerObserver(digitalBillboard);
        //Бақылаушыларды хабардар ету үшін температураны өзгерту
        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);
        //Дисплейлердің бірін алып тастап, температураны қайтадан өзгертеміз
        weatherStation.removeObserver(digitalBillboard);
        weatherStation.setTemperature(28.0f);
    }
}
