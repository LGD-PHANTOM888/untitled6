public class UserBuilder {
    private String name;
    private int age;
    private String status;

    public UserBuilder(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String buildInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Ім’я: ").append(name)
                .append(" | Вік: ").append(age)
                .append(" | Статус: ").append(status)
                .append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder("Олег", 25, "Активний");
        System.out.println(builder.buildInfo());
    }
}
