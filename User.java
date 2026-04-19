class User {
    String username;
    String Password;
}

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.username = "Siddhant";
        u1.Password = "Abc@123";
        System.out.println(u1.username);
        System.out.println(u1.Password);
    } 
}
