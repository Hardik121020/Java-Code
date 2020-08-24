import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
class Bank 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?user=root&password=ROOT");
		int k;
		System.out.println("1.New Record\n2.Delete Record");
		System.out.print("Enter Your Choise:");
		k = sc.nextInt();
		switch(k)
		{
			case 1:
				String n=JOptionPane.showInputDialog("Enter Name:");
				String s=JOptionPane.showInputDialog("Enter Amount:");
				float fs=Float.parseFloat(s);
				String sql = "INSERT INTO bank(Name,Amount) VALUE(?,?)";
				PreparedStatement st = con.prepareStatement(sql);
				 
				st.setString(1, n);// 1 specifies the first parameter in the query
				st.setFloat(2, fs); // 2 specifies the second parameter in the query
				st.executeUpdate(); //no agrument
				st.close();
				con.close();
				break;
			case 2:
				String n1=JOptionPane.showInputDialog("Enter Yout ID:");
				int ins = Integer.parseInt(n1);
				String sql1 = "delete from Bank where CustomerID =?";
				PreparedStatement st1 = con.prepareStatement(sql1);
				 
				st1.setString(1, n1); // 2 specifies the second parameter in the query
				st1.executeUpdate(); //no agrument
				st1.close();
				con.close();
				break;
			default:
				System.out.println("Wrong Choise");
				break;
		}
		System.out.println("---SQL executed successfully---");	
	}
}
