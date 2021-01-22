import com.zyc.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {


    @Test
    public void test1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");

//        singleton下是一个对象
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
