package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Models.Season;

public class SeasonRepository {
	
	String url="jdbc:mysql://127.0.0.1:3306/proyecto1";
    String usuario="ashley";
    String contrasenia="Ashley/523_5";
	
	
	
public List<Season> getSeasons(){
		
		List<Season> seasons = new ArrayList<Season>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(url, usuario, contrasenia);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "SELECT * FROM seasons\r\n"
					+ "ORDER BY year;";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int year = rs.getInt("year");
				
				Season season = new Season(year);
				seasons.add(season);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return seasons;
		
	}

}
