public class DocumentManager {
    public Document createDocument(IPrototype<Document> prototype) {
        return prototype.clone();
    }
}
