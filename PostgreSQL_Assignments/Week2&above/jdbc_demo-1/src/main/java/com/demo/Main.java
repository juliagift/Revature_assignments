package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello World with Maven");
		
		Connection connection = null;
		try {
			//Step 1 - Load Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded Successfully");
			//Step 2 - Open Connection (url, username, password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "3201610";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Success");
			//step 3 - Create Statement
			Statement statement = connection.createStatement();
			String sql = "select player_id, player_name, team_id, avg_score, dob, birth_city from test1.player order by dob desc";
			//Step 4 - Execute Query
			ResultSet resultSet = statement.executeQuery(sql);
			//Step 5 - Process Results
			while (resultSet.next()) {
				System.out.print("Player_id : " +resultSet.getInt("player_id"));
				System.out.print(" Player_name : " +resultSet.getString("player_name"));
				System.out.print(" Team_id : " +resultSet.getInt("team_id"));
				System.out.print(" Avg_score : " +resultSet.getInt("avg_score"));
				System.out.print(" DOB : " +resultSet.getDate("dob"));
				System.out.println(" Birth_city : " +resultSet.getString("birth_city"));
			}
			System.out.println("Results Processed");
		} catch (ClassNotFoundException e) {
			System.out.println(e);;
		} catch (SQLException e) {
			System.out.println(e);;
		} finally {
			try {
				//Step - Close Connection
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
