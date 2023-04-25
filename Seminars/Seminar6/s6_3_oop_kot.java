import java.text.Format;

public class s6_3_oop_kot {
    public int age;
    public String name;
    public String gender;
    public String type;
    public int cat_id;

    @Override
    public String toString() {
        return String.format("name: %s, age: %d, gender: %s, type: %s", name, age, gender, type);
    }

    public void changeAge(int age) {
        this.age = age;
    }

}
