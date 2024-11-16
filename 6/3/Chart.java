public class Chart implements IPrototype<Chart> {
    private String title;
    private String type;
    private double[] data;

    public Chart() {}

    public Chart(String title, String type, double[] data) {
        this.title = title;
        this.type = type;
        this.data = data.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data.clone();
    }

    @Override
    public Chart clone() {
        return new Chart(this.title, this.type, this.data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Chart{title='").append(title).append("', type='").append(type).append("', data=[");
        for(double d : data) {
            sb.append(d).append(", ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
