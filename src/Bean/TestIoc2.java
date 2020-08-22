package Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc2 {

    @Test
    public void testUser() {
        // 加载spring配置文件，根据配置文件创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) context.getBean("bean2");
        bean2.add2();
    }
}
