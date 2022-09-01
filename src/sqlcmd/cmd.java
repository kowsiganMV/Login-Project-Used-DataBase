package sqlcmd;

import java.sql.*;

public class cmd {
	public void add(String id,String pwd) {
		//CONNECTION VARIABLES
		String url="jdbc:mysql://localhost:3306/atm";
		String username="root";
		String password="dearam8114";
		
		try {
			//WE ARE CREATE A CONCTION OBJECT
			Connection con=DriverManager.getConnection(url, username, password);
			
			//WE WRITE A SQL COMMAND
			String sql="insert into idpwds(ID,PASSWORD) values (?,?)";
			
			//THI IS THE EXCUTE COMMAND FOR JAVA USE SQL CMD VARIABLE
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pwd);
			
			//EXCUTE UPDATE FOR DATABASE
			int rows=st.executeUpdate();
			if(rows==0) {
				System.out.println();
			}
			st.close();
			con.close();
			System.out.println("SUCCSES FULLY REGISTERED....");
		} 
		catch (SQLException e) {
			System.out.println("SYSTEM ERROR 404");
		}
	
	}
	public String[][] givevalues() {
		String url="jdbc:mysql://localhost:3306/atm";
		String username="root";
		String password="dearam8114";
		String[][] idpwds = new String[10][2];
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			String sql="SELECT*FROM idpwds";
			Statement st=con.createStatement();
			ResultSet result=st.executeQuery(sql);
			int i=0;
			while(result.next()) {
				String one=result.getString("ID");
				String two=result.getString("PASSWORD");
				for(int k=0;k<idpwds[0].length;k++) {
					if(k==0){
						idpwds[i][k]=one;
					}
					else if(k==1) {
						idpwds[i][k]=two;
					}
				}
				i++;
			}
			st.close();
			con.close();
		}
		catch (SQLException e) {
			System.out.println("SYSTEM ERROR 404");
		}
		return idpwds;
	}
}
