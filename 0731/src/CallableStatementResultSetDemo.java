import java.sql.*;
import java.util.Scanner;

/*
    DELIMITER $$
    CREATE PROCEDURE sp_select_emp_dept (
        IN v_deptno TINYINT
    )
    BEGIN
        SELECT empno, ename, dname, loc, dept.deptno
        FROM emp NATURAL JOIN dept
        WHERE deptno = v_deptno;
    END $$
    DELIMITER ;
 */
public class CallableStatementResultSetDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        CallableStatement callableStatement = null;

        try {
            String query = "{call sp_select_emp_dept(?)}"; // 불완전한 SQL 문장
            callableStatement = connection.prepareCall(query); // 4

            System.out.print("부서 번호: ");
            int deptNumber = scanner.nextInt();

            callableStatement.setInt(1, deptNumber); // 완전한 SQL 문장

            ResultSet resultSet = callableStatement.executeQuery(); // 5
            boolean flag = resultSet.next();
            if (!flag) {
                System.out.println("조건에 맞는 결과값이 없습니다.");
            } else {
                do {
                    System.out.printf("%d\t%s\t%s\t%s",
                            resultSet.getInt("empno"), resultSet.getString("ename"),
                            resultSet.getString("dname"), resultSet.getString("loc"));
                    System.out.println();
                } while (resultSet.next());
            }

            System.out.println("조회 성공");
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("조회 실패");
        }

        DBClose.dbClose(connection, callableStatement); // 7
    }
}
