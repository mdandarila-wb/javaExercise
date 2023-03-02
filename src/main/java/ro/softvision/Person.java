package ro.softvision;

public class Person {

    final String name;

    final int age;

    final int height;

//    Person(){
//        this.name="Marinic";
//        this.age=42;
//        this.height=178;
//    }

    Person() {
        this("Marcelino", 22, 176);
    };
    Person(String name, int age, int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
