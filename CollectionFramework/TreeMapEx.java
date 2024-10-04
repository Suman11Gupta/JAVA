package CollectionFramework;

public class TreeMapEx {
    int roll_no;
    String name;
    int age;

    public TreeMapEx(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\tRoll No. "+roll_no+"\tAge: "+age;
    }
}
