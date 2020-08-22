package Bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc3 {

    @Test
    public void testUser() {
        // 加载spring配置文件，根据配置文件创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3) context.getBean("bean3");
        bean3.add3();
    }
}
