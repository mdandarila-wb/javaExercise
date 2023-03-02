package ro.softvision;

public class BaseClass {

    private String name;

    public BaseClass(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
       return "BaseClass{" +
               "name='" + name + '\'' +
               '}';
    }
}
