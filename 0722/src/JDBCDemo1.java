import java.sql.*;

public class JDBCDemo1 {
    private static final String URL = "";
    private static final String ID = "";
    private static final String PASS = "";

    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("SELECT empno, ename, job, sal ")
                .append("FROM emp ")
                .append("WHERE sal >= 1500;");

        try (Connection connection = DriverManager.getConnection(URL, ID, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(queryBuilder.toString())) {
            while (resultSet.next()) {
                int empno = resultSet.getInt(1);
                String ename = resultSet.getString("ename");
                String job = resultSet.getString("job");
                double salary = resultSet.getDouble("sal");
                System.out.printf("%d\t%s\t%s\t%.2f%n", empno, ename, job, salary);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
