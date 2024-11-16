public class Section implements IPrototype<Section> {
    private String title;
    private String text;
    public Section() {}


    public Section(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Section clone() {
        return new Section(this.title, this.text);
    }

    @Override
    public String toString() {
        return "Section{title='" + title + "', text='" + text + "'}";
    }
}
