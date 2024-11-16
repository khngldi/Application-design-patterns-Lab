public class Table implements IPrototype<Table> {
    private String title;
    private String[][] data;

    public Table() {}

    public Table(String title, String[][] data) {
        this.title = title;
        this.data = new String[data.length][];
        for(int i =0; i < data.length; i++) {
            this.data[i] = data[i].clone();
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = new String[data.length][];
        for(int i =0; i < data.length; i++) {
            this.data[i] = data[i].clone();
        }
    }

    @Override
    public Table clone() {
        String[][] clonedData = new String[this.data.length][];
        for(int i =0; i < this.data.length; i++) {
            clonedData[i] = this.data[i].clone();
        }
        return new Table(this.title, clonedData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Table{title='").append(title).append("', data=[");
        for(String[] row : data) {
            sb.append("[");
            for(String cell : row) {
                sb.append(cell).append(", ");
            }
            sb.append("], ");
        }
        sb.append("]}");
        return sb.toString();
    }
}
