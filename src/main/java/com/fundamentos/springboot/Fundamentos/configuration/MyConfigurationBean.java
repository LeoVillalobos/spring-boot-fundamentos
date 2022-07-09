package com.fundamentos.springboot.Fundamentos.configuration;

import com.fundamentos.springboot.Fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean
    public IMyBean beanOpetation () {
        return new MyBean2Implement();
    }

    @Bean
    public IMyOperation beanOpetationOperation () {
        return new MyOperationImplement();
    }

    @Bean
    public IMyBeanWithDependency beanOpetationOperationWithDependency (IMyOperation myOperation) {
        return new MyBeanWithDependencyImplement(myOperation);
    }

    @Bean
    public  ITypeDay typeDay () {
        return new DayInUSA();
    }



}
