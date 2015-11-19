package br.edu.fa7.tecnicas.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectURL {

	   public static void main(String[] args) throws Exception {

	      // Create a variable for the connection string.
	      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
	         "databaseName=bd_biblioteca;user=sa;password=sqlserver";

	      // Declare the JDBC objects.
	      Connection con = null;

	      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	      con = DriverManager.getConnection(connectionUrl);
	      
	      if(con != null){
	    	  System.out.println("Conectado ;)");
	    	  
	    	  String query = "select * from AUTOR";
	    	  
	    	  PreparedStatement pstm = con.prepareStatement(query);
	    	  ResultSet rsSet = pstm.executeQuery();
	    	  while(rsSet.next()){
	    		  Integer id = rsSet.getInt("AUTORID");
	    		  String nome = rsSet.getString("NOME");
	    		  String end = rsSet.getString("ENDERECO");
	    		  String sexo = rsSet.getString("SEXO");
	    		  Date dtNasc = rsSet.getDate("DATA_NASCIMENTO");
	    		  
	    		  System.out.println(id + ", " + nome + ", " + end + ", " + sexo + ", " + dtNasc);
	    	  }
	      }
	   }
	}