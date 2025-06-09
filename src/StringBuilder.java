public class StringBuilder {
    private String name;
    private int age;
    private String status;
    public StringBuilder(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }
    public String buildInfo() {
        return "[Имя: " + name + " | Возраст: " + age + " | Статус: " + status + "]";
    }
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Олег", 25, "Активный");
        System.out.println(builder.buildInfo());
    }
}
