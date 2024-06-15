package com.example.BusReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class BusReservationApplication {

	public static void main(String[] args) {
		/* SpringApplication.run(BusTicketBookingApplication.class, args);
	}

	 */

		testDatabaseConnection();
		SpringApplication.run(BusReservationApplication.class, args);
	}

	private static void testDatabaseConnection() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/TicketBookingSystem";
		String username = "root";
		String password = "L27m24td05@2024";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			System.out.println("Connection successful!");
		} catch (SQLException e) {
			System.err.println("Connection failed: " + e.getMessage());
		}
	}
}
