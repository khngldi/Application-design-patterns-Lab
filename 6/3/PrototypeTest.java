public class PrototypeTest {
    public static void main(String[] args) {
        Document originalDocument = new Document();
        originalDocument.setTitle("Исследование рынка");
        originalDocument.setContent("Введение в исследование рынка.");

        Section section1 = new Section("Анализ конкурентов", "Текст анализа конкурентов.");
        Section section2 = new Section("Целевая аудитория", "Текст о целевой аудитории.");
        originalDocument.addSection(section1);
        originalDocument.addSection(section2);

        Image image1 = new Image("");
        Image image2 = new Image("");
        originalDocument.addImage(image1);
        originalDocument.addImage(image2);

        System.out.println("=== Оригинальный Документ ===");
        System.out.println(originalDocument);

        DocumentManager manager = new DocumentManager();

        Document clonedDocument = manager.createDocument(originalDocument);

        clonedDocument.setTitle("Анализ продаж");
        clonedDocument.setContent("Введение в анализ продаж.");

        clonedDocument.getSections().get(0).setTitle("Анализ конкурентов и партнеров");
        clonedDocument.getSections().get(0).setText("Обновлённый текст анализа конкурентов и партнеров.");

        Section section3 = new Section("Стратегия маркетинга", "Текст о стратегии маркетинга.");
        clonedDocument.addSection(section3);

        clonedDocument.getSections().remove(1);

        clonedDocument.getImages().get(0).setUrl("");

        Image image3 = new Image("");
        clonedDocument.addImage(image3);

        System.out.println("\n=== Клонированный Документ (После Изменений) ===");
        System.out.println(clonedDocument);

        System.out.println("\n=== Оригинальный Документ (После Клонирования и Изменений в Клоне) ===");
        System.out.println(originalDocument);

        System.out.println("\n=== Сравнение Экземпляров ===");
        System.out.println("Оригинальный и клонированный документы - один и тот же экземпляр? " + (originalDocument == clonedDocument));
    }
}
