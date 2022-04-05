package automationtest;

public class Variable_Q2 {
    int id;
    String name;

    public Variable_Q2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + name);
    }

    public static <obj1> void main(String[] args) {
        Variable_Q2 obj1 = new Variable_Q2(101, "Deepmala");
        Variable_Q2 obj2 = new Variable_Q2(101, "Prime");
        obj1.display();
        obj2.display();
    }
}


















