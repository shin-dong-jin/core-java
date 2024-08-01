import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/*
    DELIMITER //
    CREATE PROCEDURE sp_deleteDept()
    BEGIN
        DELETE FROM dept_clone;
    END
    //
    DELIMITER ;
 */
public class CallableStatementWithoutParameterDemo {
    public static void main(String[] args) {
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        CallableStatement callableStatement = null;

        try {
            String query = "{call sp_deleteDept()}"; // 완전한 SQL 문장
            callableStatement = connection.prepareCall(query); // 4
            callableStatement.execute(); // 5
            System.out.println("삭제 성공");
        } catch (SQLException e) {
            System.out.println("삭제 실패");
        }

        DBClose.dbClose(connection, callableStatement); // 7
    }
}

