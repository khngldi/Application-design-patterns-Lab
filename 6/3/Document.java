import java.util.ArrayList;
import java.util.List;

public class Document implements IPrototype<Document> {
    private String title;
    private String content;
    private List<Section> sections;
    private List<Image> images;
    private List<Table> tables;
    private List<Chart> charts;

    public Document() {
        sections = new ArrayList<>();
        images = new ArrayList<>();
        tables = new ArrayList<>();
        charts = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public void setCharts(List<Chart> charts) {
        this.charts = charts;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    @Override
    public Document clone() {
        Document clonedDocument = new Document();
        clonedDocument.setTitle(this.title);
        clonedDocument.setContent(this.content);

        for (Section section : this.sections) {
            clonedDocument.addSection(section.clone());
        }

        for (Image image : this.images) {
            clonedDocument.addImage(image.clone());
        }

        return clonedDocument;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sections=" + sections +
                ", images=" + images +
                '}';
    }
}
