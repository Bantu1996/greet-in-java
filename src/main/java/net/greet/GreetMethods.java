package net.greet;
import java.util.HashMap;

public class GreetMethods {

    HashMap<String, Integer> greetMethods = new HashMap<>();


    public void greetUser(String name, String language){
if(!greetMethods.containsKey(name)){
greetMethods.put(name, 1);
}
else if (greetMethods.containsKey(name)){
    greetMethods.put(name, greetMethods.get(name) + 1);
}
        System.out.println(Languages.valueOf(language).getLanguage() + name);
    }
public String greetedUsers(){
        return this.greetMethods.toString();
}
    public String greetedUserName(String name){
        return String.valueOf(greetMethods);
    }
    public int counter(){
        int count = greetMethods.size();
        return count;
    }
}
