package org.spring.core.config;

import org.spring.core.beans.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeanConfig {


    @Bean(initMethod = "display")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public HelloBean helloBean() {
        return new HelloBean();
    }

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public HelloBean helloBean1() {
        return new HelloBean();
    }

    @Bean(initMethod = "init")
    public MovieFinderService movieFinder() {
        return new MovieFinderService();
    }

    @Bean
    public MovieLister movieLister() {
        return new MovieLister(movieFinder());
    }

    @Bean()
    public ObjectPool objectPool(){
        return ObjectPool.getInstance();
    }

    @Bean
    public DefaultServiceLocator serviceLocator(){
        return new DefaultServiceLocator();
    }

    @Bean()
    public ClientService getClientService(){
        return serviceLocator().getClientInstance();
    }

    @Bean
    public AccountService getAccountService(){
        return serviceLocator().getAccountInstance();
    }
}
