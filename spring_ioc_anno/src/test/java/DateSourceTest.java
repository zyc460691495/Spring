import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.sql.Connection;

public class DateSourceTest {

    @Test
    //手动创建c3p0
    public void test1() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/sell?serverTimezone=UTC");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    //手动创建c3p0
    public void test2() throws Exception {
        DruidDataSource druidDataSource =new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/sell?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
