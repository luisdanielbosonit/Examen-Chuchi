package com.bosonit.trainning.examenChuchi.config;

import com.bosonit.trainning.examenChuchi.registry.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {

    @Bean
    public FactoryBean<?> factoryBean(){
        final ServiceLocatorFactoryBean bean=new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(ServiceRegistry.class);
        return bean;
    }
}



