package accessModifiers;

public class Chair {

    private int size;
    public String model;



    public int getSize(){
        if(this.model.equals("IKEA")){
            return size;
        }
        else {
            System.out.println("Wrong");
        }
        return 0;
    }

    public void setSize(int size){
        if (size>0){
            this.size = size;
        }
        else {
            System.out.println("Wrong Entree!!");
        }

    }


    public void info(){
        System.out.println("Model: "+ model);
        System.out.println("Size: "+ size);
    }






}
