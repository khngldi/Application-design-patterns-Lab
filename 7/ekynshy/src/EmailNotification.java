public class EmailNotification implements IObserver {//Функционалдылықты кеңейту - бақылаушының жаңа түрін қосу
    private String email;
    public EmailNotification(String email) {
        this.email = email;
    }
    @Override
    public void update(float temperature) {
        System.out.println("Отправка email на " + email + ": Температура изменилась на " + temperature + "°C");
    }
}
