package testing;

import org.json.simple.JSONObject;

import system.Key;
import controller.AdminCtrl;
import dataManager.AdminDAO;
import model.Admin;

public class test {
	public static void main(String[] args){
		JSONObject adminJson = new JSONObject();
		adminJson.put(Key.NAME, "admin");
		adminJson.put(Key.EMAIL, "admin@email.com");
		adminJson.put(Key.PASSWORD, "admin");
		
		AdminCtrl.createAdmin(adminJson);
	}
}
