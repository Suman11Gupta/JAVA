package CollectionFramework;

public class Student {
    int rollNumber;
    String name;
    int std;
    Student(int rollNumber,String name, int std){
        this.rollNumber=rollNumber;
        this.name=name;
        this.std=std;
    }

    public String getName() {
        return name;
    }

    public int getStd() {
        return std;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", std=" + std +
                '}';
    }

    public static void main(String[] args) {

    }
}
