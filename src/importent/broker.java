package importent;
import importent.*;

public class broker {
	public void broker() {
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("3.Exit");
		inputs in=new inputs();
		int num=in.num();
		
		try {
			if(num==1) {
				login lo=new login();
				lo.check();
			}
			else if(num==2) {
				register re=new register();
				re.regis();
			}
			else if(num==3) {
				System.out.println("Thank You For Useing..........");
			
			}
		} 
		catch (Exception String){
			System.out.println("ENTER CORECT SELECTION INTEGER........");
		}
		
		
	}
}
