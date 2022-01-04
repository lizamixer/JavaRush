package Other.Serialization;

// Родительский класс, не реализующий Serializable
public class Parent {
    public String firstName;
    private String lastName;
    public Parent(){
        System.out.println("Create Parent");
        firstName="old_first";
        lastName="old_last";
    }
    public void changeNames() {
        firstName="new_first";
        lastName="new_last";
    }
    public String toString() {
        return super.toString()+",first="+firstName+",last="+lastName;
    }
}
