import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/*
    DELIMITER $$
    CREATE PROCEDURE sp_insertDept(
        IN v_deptno TINYINT,
        IN v_dname VARCHAR(14),
        IN v_loc VARCHAR(13)
    )
    BEGIN
        INSERT INTO dept_clone(deptno, dname, loc)
        VALUES(v_deptno, v_dname, v_loc);
        COMMIT;
    END
    $$
    DELIMITER ;
 */
public class CallableStatementINDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        CallableStatement callableStatement = null;

        try {
            String query = "{call sp_insertDept(?, ?, ?)}"; // 불완전한 SQL 문장
            callableStatement = connection.prepareCall(query); // 4
            
            System.out.print("부서 번호: ");
            int deptNo = scanner.nextInt();
            System.out.print("부서 이름: ");
            String dName = scanner.next();
            System.out.print("부서 위치: ");
            String loc = scanner.next();
            
            callableStatement.setInt(1, deptNo);
            callableStatement.setString(2, dName);
            callableStatement.setString(3, loc); // 완전한 SQL 문장
            
            callableStatement.execute(); // 5
            
            System.out.println("새 레코드 삽입 성공");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
        }

        DBClose.dbClose(connection, callableStatement); // 7
    }
}
