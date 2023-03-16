package model;

import java.util.ArrayList;

public class Database {
	
	public static ArrayList<User> getUsers(){
                ArrayList<User> users = new ArrayList<User>();
                users.add(new User("pplante", "Portia", "Plante", 38, "123-456-7890"));
                
		return users;
	}
	
	public static ArrayList<Item> getItems(){
		return new ArrayList<Item>();
	}
        
        public static void saveUsers(){
            
        }
}
