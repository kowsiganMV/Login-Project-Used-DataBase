package importent;

import sqlcmd.cmd;

public class register {
	public void regis() {
		//GET INPUTS
		inputs in=new inputs();
		
		//ID INPUT
		System.out.println("Enter Id:");
		String id=in.str();
		
		//PASSWORD INPUT
		System.out.println("Enter Passwords:");
		String pwd=in.str();
		
		//RE ENTERING PROCCES
		System.out.println("ReEnter Passwords:");
		String pwd1=in.str();
		
		//ADDON ID & PASSWORD IN DATABASE
		cmd c=new cmd();
		if(pwd.equals(pwd1)) {
			c.add(id, pwd);
			broker bro=new broker();
			bro.broker();
		}
		else {
			System.out.println("PLEASE ENTER SAME PASSWORDS..........");
			broker bro=new broker();
			bro.broker();
		}
		
	}

}
