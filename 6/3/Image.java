public class Image implements IPrototype<Image> {
    private String url;
    public Image() {}


    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Image clone() {
        return new Image(this.url);
    }

    @Override
    public String toString() {
        return "Image{url='" + url + "'}";
    }
}
