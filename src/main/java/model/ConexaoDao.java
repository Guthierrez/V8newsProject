package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDao {
		private Connection conexao;
		private String url = "jdbc:derby://localhost/V8news;create=true";
		private String user = "news";
		private String password = "123";
		private static ConexaoDao instancia;
		
		public ConexaoDao(){
			 try {  
		            Class.forName("org.apache.derby.jdbc.ClientDriver");  
		  
		        } catch (ClassNotFoundException e) {  
		            System.out.println("Driver nao encontrdao!");  
		        }  
		  
		        try {  
		            this.conexao = DriverManager.getConnection(this.url, this.user,  
		                    this.password);  
		            System.out.println("Conexão realizada com sucesso!");  
		  
		        } catch (SQLException e) {  
		            System.err.println(e.getMessage());  
		        }  
		}  
		
		 
	    public synchronized static ConexaoDao getInstancia() {  
	        if (instancia == null) {  
	            instancia = new ConexaoDao();  
	        }  
	        return instancia;  
	    }
	    
	    public Connection getConexao() {  
	        return conexao;  
	    } 
	  
}

