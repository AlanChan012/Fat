public class Cat extends Animal{
    int age = 20;
    String name = "cat";
    static void sound() {
        System.out.println("Meom");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.age);
        sound();
    }
}
