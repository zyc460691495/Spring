import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

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
    //手动创建druid
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
    @Test
    public void test3() throws Exception {
        //读取配置文件 对properties进行读写
        //参数地址是相对于类加载路径地址
        ResourceBundle resourceBundle=ResourceBundle.getBundle("jdbc");
        String driver=resourceBundle.getString("jdbc.driver");
        String url=resourceBundle.getString("jdbc.url");
        String username=resourceBundle.getString("jdbc.username");
        String password=resourceBundle.getString("jdbc.password");

        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test4() throws SQLException {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
//        ComboPooledDataSource bean = applicationContext.getBean(ComboPooledDataSource.class);
//        Connection connection=bean.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test05() throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource1 = (DruidDataSource) applicationContext.getBean("dataSource1");
        DruidPooledConnection connection = dataSource1.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
