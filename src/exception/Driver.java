package exception;

public class Driver {

   private String name;
   private int age;
   private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name.trim().contains(" ")){
            throw new Exception((name+ "was invalid"));
        }
        this.name = name;



    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
