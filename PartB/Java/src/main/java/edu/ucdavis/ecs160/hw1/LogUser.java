package edu.ucdavis.ecs160.hw1;

public class LogUser implements User{
    private final User inner; 

    public LogUser (User inner){
        this.inner = inner; 
    }

    private String cls() {
        return inner.getClass().getSimpleName();
    }

    public String getName(){
        System.out.println("[LOG] " + cls() + ".getName()");
        return inner.getName(); 
    }

    public String getEmail(){
        System.out.println("[LOG] " + cls() + ".getEmail()");
        return inner.getEmail(); 
    }

    public void setEmail(String email){
        System.out.println("[LOG] " + cls() + ".setEmail(\"" + email + "\")");
        inner.setEmail(email); 
    }


}
