package tests;

import java.sql.Connection;

import main.ConnFactory;

public class ConnFactoryTest {

	public static void main(String[] args) {
		 Connection connFactory = new ConnFactory().getConnection();

	}

}
