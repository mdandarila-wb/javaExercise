package ro.softvision;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person();
//
//          System.err.println((person.getName()));
////        System.err.println((person.age));
////        System.err.println((person.height));
////
//
//          System.out.println(person.toString());
////        for (String arg: args){
////            System.out.println(arg);
////        }
////        System.out.println("Hello world!");

        var baseClass = new BaseClass("BaseClassName");
        var extendingClass = new ExtendingClass("ExtendingClassName");

        System.err.println(baseClass);
        System.err.println(extendingClass);

        System.err.println(baseClass.getName());
        System.err.println(extendingClass.getName());
    }
}