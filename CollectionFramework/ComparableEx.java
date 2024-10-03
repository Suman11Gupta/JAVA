package CollectionFramework;

public class ComparableEx implements Comparable<ComparableEx> {
    int roll_no;
    String name;
    int std;

    public ComparableEx(int roll_no, String name, int std) {
        this.roll_no = roll_no;
        this.name = name;
        this.std = std;
    }

    public int compareTo(ComparableEx arg){

        // if(this.per>arg.per)
        //return -1;
        //else
          // return 1;     --->double

//        return (int) (this.name.compareTo(arg.name)); //-->String
        return (int) (this.roll_no-arg.roll_no);
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", std=" + std +
                '}';
    }
}
