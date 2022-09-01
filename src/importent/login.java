package importent;
import sqlcmd.cmd;

public class login {
	public void check() {
		//GET INPUTS
		inputs in=new inputs();
		
		//ID INPUT
		System.out.println("Enter Id:");
		String id=in.str();
		
		//PASSWORD INPUT
		System.out.println("Enter Passwords:");
		String pwd=in.str();
		//GET DATABASE ID PASSWORD VALUES
		cmd c=new cmd();
		String[][] idpwds=c.givevalues();
		
		//CHECKING FROM DATABASE...........
		int check=0;
		for(int i=0;i<idpwds.length;i++) {
			if(idpwds[i][0]!=null) {
				if(idpwds[i][0].equals(id) && idpwds[i][1].equals(pwd)) {
					check=1;
					System.out.println("SUCCES...............");
					break;
				}
			}
			else {
				break;
			}
			
		}
		if(check==0) {
			System.out.println("ID OR PASSWORD IS WORNG........");
			broker bro=new broker();
			bro.broker();
		}
		
	}
}
