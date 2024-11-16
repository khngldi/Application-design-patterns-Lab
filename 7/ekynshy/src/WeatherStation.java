import java.util.ArrayList;
import java.util.List;
//температураны сақтайды және бақылаушыларға хабарлайды
public class WeatherStation implements ISubject {
    private List<IObserver> observers;
    private float temperature;
    public WeatherStation() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(IObserver observer) {//Қатені өңдеу (мысалы, жоқ бақылаушыны жою әрекеті):
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else {
            System.out.println("Наблюдатель не найден.");
        }
    }
    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(temperature);
        }
    }
    public void setTemperature(float newTemperature) {
        System.out.println("Изменение температуры: " + newTemperature + "°C");
        temperature = newTemperature;
        notifyObservers();
    }
}
