package com.itqf.test;

import com.sun.jmx.mbeanserver.Repository;
import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @autor hhh
 * @create 2019/7/10
 */
public class TestActiviti {
    @Test
    public void deploy(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
       RepositoryService repositoryService = (RepositoryService) applicationContext.getBean("repositoryService");
       repositoryService.createDeployment().addClasspathResource("leave.bpmn").deploy();
    }
}
