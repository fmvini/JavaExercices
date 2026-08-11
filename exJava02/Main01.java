import exJava02.Person;

public class Main01 {

    public static void main(String[] args) {
        var male = new Person("João");
        male.incAge();
        var female = new Person("Maria");
        female.incAge();

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName()  + " age: " + female.getAge());
    }
}