public abstract class Beverage {
    // Шаблондық метод
    public void prepareRecipe() {
       try { boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    } catch (Exception e) {
        System.out.println("Ошибка при приготовлении напитка: " + e.getMessage());
    }
}

    private void boilWater() {
        System.out.println("Кипячение воды...");
    }

    private void pourInCup() {
        System.out.println("Наливание в чашку...");
    }

    // Абстрактты әдістер, оларды туынды сыныптарда жүзеге асырылады
    protected abstract void brew();
    protected abstract void addCondiments() throws Exception;

    // Хук әдісі, қосымшаларды өшіру үшін қайта анықталуы мүмкін
    protected boolean customerWantsCondiments() {
        return true; // По умолчанию қосымшаларды қосамыз
    }
}
