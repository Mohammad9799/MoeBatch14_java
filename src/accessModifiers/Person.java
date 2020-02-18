package accessModifiers;

public class Person {

  private   String name ;
  private   String gander;
  private   int age;
  private double height;
  private   double weight;


    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getGander() {
        return gander;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if (age>0 && age<=120){
            this.age = age;
        }else {
            System.out.println("Invalid Age!!");
        }
    }

    public void setGander (String gander){
        if (gander.equalsIgnoreCase("Male") || gander.equalsIgnoreCase("Female")){
            this.gander = gander;
        }else {
            System.out.println("Wrong Entree!!!");
        }
    }

    public void heightAndWeight(double height, double weight){
        if (height>=0 && weight>=0){
            this.height = height;
            this.weight = weight;
        }
    }







}
