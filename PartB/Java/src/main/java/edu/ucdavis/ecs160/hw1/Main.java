package edu.ucdavis.ecs160.hw1;

public class Main {
    public static void main(String[] args) {

        User user = new LogUser(new AdminUser("Alice", "alice@ucdavis.edu")); // init user 
        user.setEmail("alice@ucdavis.edu");
        user.getName();
        user.getEmail();

    }
}
