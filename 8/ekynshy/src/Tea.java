public class Tea extends Beverage {
    private boolean ingredientsAvailable;

    public Tea(boolean ingredientsAvailable) {
        this.ingredientsAvailable = ingredientsAvailable;
    }

    @Override
    protected void brew() {
        System.out.println("Заваривание чая...");
    }

    @Override
    protected void addCondiments() throws Exception {
        if (!ingredientsAvailable) {
            throw new Exception("Ингредиенты для чая отсутствуют.");
        }
        System.out.println("Добавление лимона...");
    }

    @Override
    protected boolean customerWantsCondiments() {
// Пайдаланушының қосымшалардың қажет екеніне шешім қабылдай алатынын есептейік
        return true; // Егер қосымшалар қажет болса, true қайтарамыз
    }
}
