package com.springinaction.knights;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello spring!
 * Quick introduction to dependency injection.
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // Application context as a factory to retrieve the bean.
        SpringJdbcBean bean = context.getBean(SpringJdbcBean.class);

        Computer computer = bean.getComputerById((short)1);

        context.close();
    }
}
