
public class Data_Validation_in_Setters {
    public static void main(String[] args) {
        Person example = new Person();
        example.setName("   ");
        System.out.println("Name :" + example.getName());

        example.setAge(-5);
        System.out.println("Age :" + example.getAge());
    }
}
