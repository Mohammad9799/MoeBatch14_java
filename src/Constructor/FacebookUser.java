package Constructor;

public class FacebookUser {
// username, password, name, age, and number of friends

    String username;
    String password;
    String name;
    int age;
    int number_of_friends;

    public FacebookUser(String username, String password){
        this.username=username;
        if (!password.contains(username)){
            this.password=password;
        }else {
            System.out.println("Invalid password");
            this.password="password";
        }
    }
    public FacebookUser(String username, String password, String name ){
        this(username,password);
        name = name.replace(" ","");

        boolean valid= true;

        for (int i=0; i<name.length();i++){
            if (Character.isLetter(name.charAt(i))){
                valid=false;
                break;
            }

            if (valid){
                this.name=name;
            }else {
                System.out.println("Invalid name");
                this.name="No name";
            }
        }





    }
    public FacebookUser(String username, String password, String name, int age, int number_of_friends){
        this(username,password,name);

        if (age<0){
            System.out.println("Invalid Age");
        }else {
            this.age=age;
        }

        if (number_of_friends<0 || number_of_friends>5000){
            System.out.println("Invalid number of friends");
        }else {
            this.number_of_friends=number_of_friends;
        }
    }

public void info(){
    System.out.println("Name is: " + name);
    System.out.println("Username: "+ username);
    System.out.println("Age: "+ age);
    System.out.println("Number of friends: "+ number_of_friends);
}
          public boolean sendFriendRequest(FacebookUser userTwo) {
              if(this.number_of_friends >= 5000) {
                  System.out.println("You reached the limit");
                  return false;
              } else if(userTwo.number_of_friends >= 5000) {
                  System.out.println(userTwo.name + " has reach the limit of friends");
                  return false;
              } else {
                  System.out.println("Request sent");
                  this.number_of_friends++;
                  userTwo.number_of_friends++;
                  return true;
              }



          }



}
