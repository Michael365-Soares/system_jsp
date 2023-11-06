package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelLogin;

public class DAOLoginRepository {
    private Connection conexao;
    
    public DAOLoginRepository() {
    	this.conexao=ConnectionFactory.getConnection();
    }
    
	public boolean consultarUser(ModelLogin user) throws SQLException {
		String sql="select login,senha from model_login where upper(login)=upper(?) and upper(senha)=upper(?)";
		PreparedStatement stmt;
		boolean logado = false;
		stmt = conexao.prepareStatement(sql);
		stmt.setString(1,user.getLogin());
		stmt.setString(2,user.getPassword());
		ResultSet resultado=stmt.executeQuery();
		logado=resultado.next()?true:false;
		return logado;
	}
	
}
