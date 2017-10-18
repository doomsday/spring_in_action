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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        // Application context as a factory to retrieve the bean whose ID is knight.
        Knight knight = context.getBean(Knight.class);
        // It's blissfully unaware of the fact that it’s dealing with BraveKnight. Only the KnightConfig.java.
        knight.embarkOnQuest();
        context.close();
    }
}
