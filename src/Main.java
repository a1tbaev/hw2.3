public class Main {
    public static void main(String[] args) {
        String [] lessons = {"english", "soft skills","technical "};
        MyClass myClass = new MyClass("adil",18,lessons,"kuurdak");
        System.out.println("my name is: "+myClass.getName());
        System.out.println("age: "+myClass.getAge());
        for (String lesson:myClass.getLessons()) {
            System.out.println("lessons: "+lesson);
        }
        System.out.println("my favorite food: "+myClass.getFood());
        MyClass myClass1 = new MyClass(lessons);
        for (String lesson:myClass1.getLessons()) {
            System.out.println("[lessons: "+lesson+"]");
        }



    }
}