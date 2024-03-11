import com.spring.demo.Student;
import com.spring.demo.User;
import com.spring.demo.UserController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * spring的简单练习
 * @author mahaiyang
 * @date 2024/3/11 14:14
 */
public class App {
    public static void main(String[] args) {
        // 创建spring上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        BeanFactory context = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
        // 获取指定的bean
        // 1 通过类名获取
        Student student = context.getBean(Student.class);
        // 2.通过名称获取
        Student s2 = (Student) context.getBean("student");
        // 通过类名和名称获取
        Student s3 = context.getBean("student",Student.class);
        User user = context.getBean("func",User.class);
        User u1 = context.getBean("us",User.class);
        UserController controller = context.getBean("userController",UserController.class);
        // 使用bean
        student.print();
        user.say();
        u1.hh();
        controller.say();
    }
}
