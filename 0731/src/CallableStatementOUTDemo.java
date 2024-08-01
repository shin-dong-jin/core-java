import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

/*
    DELIMITER //
    CREATE PROCEDURE sp_test(
        OUT v_now DATETIME,
        OUT v_version VARCHAR(30)
    )
    BEGIN
        SELECT now(), version() INTO v_now, v_version;
    END
    //
    DELIMITER ;
 */
public class CallableStatementOUTDemo {
    public static void main(String[] args) throws SQLException {
        Connection connection = new DBConnection().getConnection(); // 1, 2, 3

        /*
            In parameter: set method 사용하고,
            Out parameter: registerOutParameter() 사용한다.
            InOut parameter: set, register 둘 다 사용한다.
         */
        String query = "{call sp_test(?, ?)}"; // 미완성 SQL
        CallableStatement callableStatement = connection.prepareCall(query); // 4
        callableStatement.registerOutParameter(1, Types.DATE);
        callableStatement.registerOutParameter(2, Types.VARCHAR); // 완전한 SQL 문장

        callableStatement.execute(); // 5
        Date now = callableStatement.getDate(1);
        String version = callableStatement.getString(2);
        System.out.println(now + ", " + version);

        DBClose.dbClose(connection, callableStatement); // 7
    }
}