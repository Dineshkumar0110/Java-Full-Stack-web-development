package programming;

import java.sql.SQLException;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			if (1 == 1) {
				throw new SQLException("hello");
//				System.out.println();
			} else {
//				System.out.println();
				throw new Exception();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

