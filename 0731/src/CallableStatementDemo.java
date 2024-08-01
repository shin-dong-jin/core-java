import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
    DELIMITER $$
    CREATE PROCEDURE sp_selectEmp(
        IN v_empno SMALLINT,
        OUT v_dname VARCHAR(14),
        OUT v_loc VARCHAR(13)
    )
    BEGIN
        SELECT dname, loc INTO v_dname, v_loc
        FROM emp JOIN dept ON (emp.deptno = dept.deptno)
        WHERE empno = v_empno;
    END
    $$
    DELIMITER ;
 */

public class CallableStatementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        CallableStatement callableStatement = null;

        try {
            String query = "{call sp_selectEmp(?, ?, ?)}"; // 불완전한 SQL 문장
            callableStatement = connection.prepareCall(query); // 4

            System.out.print("사원 번호: ");
            int empNo = scanner.nextInt();

            callableStatement.setInt(1, empNo);
            callableStatement.registerOutParameter(2, Types.VARCHAR);
            callableStatement.registerOutParameter(3, Types.VARCHAR); // 완전한 SQL 문장

            callableStatement.execute(); // 5

            String dName = callableStatement.getString(2);
            String loc = callableStatement.getString(3);

            System.out.println("부서 이름: " + dName + ", 부서 위치: " + loc);

            System.out.println("조회 성공");
        } catch (SQLException e) {
            System.out.println("조회 실패");
        }

        DBClose.dbClose(connection, callableStatement); // 7
    }
}
