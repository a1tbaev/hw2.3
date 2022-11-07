public class MyClass {
    private String name;
    private int age;
    private String[] lessons;
    private String food;

    public MyClass(String name, int age, String[] lessons, String food){
        this.name = name;
        this.age = age;
        this.lessons = lessons;
        this.food = food;
    }
    public MyClass(String[] lessons){
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getLessons() {
        return lessons;
    }

    public String getFood() {
        return food;
    }
}
