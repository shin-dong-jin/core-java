import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

/*
    DELIMITER $$
    CREATE PROCEDURE sp_selectDname(
        INOUT v_param VARCHAR(14)
    )
    BEGIN
        DECLARE v_out VARCHAR(14);
        SELECT loc INTO v_out
        FROM dept
        WHERE dname = v_param;
        SET v_param := v_out;
    END $$
    DELIMITER ;
 */
public class CallableStatementINOUTDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        CallableStatement callableStatement = null;

        try {
            String query = "{call sp_selectDname(?)}"; // 불완전한 SQL 문장
            callableStatement = connection.prepareCall(query); // 4

            System.out.print("부서 이름: ");
            String dName = scanner.next();

            callableStatement.setString(1, dName);
            callableStatement.registerOutParameter(1, Types.VARCHAR); // 완전한 SQL 문장

            callableStatement.execute(); // 5

            String loc = callableStatement.getString(1);

            System.out.println("부서 이름: " + dName + ", 부서 위치: " + loc);

            System.out.println("조회 성공");
        } catch (SQLException e) {
            System.out.println("조회 실패");
        }

        DBClose.dbClose(connection, callableStatement); // 7
    }
}
