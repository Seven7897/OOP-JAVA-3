package GenealogicalTreeResearch;

public class Human {
    private String name;
    private String gender;
    private int age;

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human(String name) {
        this(name, "", 0);
    }

    public String getInfo() {
        return "Human: " + this.name + ", " + this.age + " y.o.";
    }

    public String getName() {
        return name;
    }
}

