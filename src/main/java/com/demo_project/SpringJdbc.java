package com.demo_project;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbc {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/demo_project/Config.xml");
        JdbcTemplate  Jdbc = (JdbcTemplate)context.getBean("jdbcTemplate");
        Jdbc.execute(Queries.CreateDb);
        context.close();
    }
}
