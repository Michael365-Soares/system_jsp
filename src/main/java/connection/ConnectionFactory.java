package connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	private static Connection conexao=null;
	
	public static Connection getConnection() {
		
		Properties prop=getProperties();
		String url=prop.getProperty("banco.url");
		String user=prop.getProperty("banco.user");
		String password=prop.getProperty("banco.password");
		
		if(conexao==null) {
			try {
				conexao=DriverManager.getConnection(url, user, password);
				conexao.setAutoCommit(false);/*Impedi a realização de alterações no BD sem autorização...*/
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Conexão ao SGBD estabelecida...");
			return conexao;
		}else {
			System.out.println("Conexão ao SGBD estabelecida...");
			return conexao;
		}
		
	}
	
    
	private static Properties getProperties() {
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream("C:\\Users\\micha\\eclipse-workspace\\system_jsp\\src\\sgbd_conexao\\config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
}
