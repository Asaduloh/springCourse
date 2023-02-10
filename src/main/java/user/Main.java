package user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Colculate colculate = context.getBean("colc", Colculate.class);
        Colculate colculate1 = context.getBean("colc2", Colculate.class);
        colculate1.uchBurchak();
        colculate.kvadrat();
        context.close();
    }
}
