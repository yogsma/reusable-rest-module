package com.betterjavacode.socialpie.interfaces;

import com.betterjavacode.socialpie.managers.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManagerFactory
{
    @Bean
    public CompanyManager getCompanyManager()
    {
        return new CompanyManagerImpl();
    }

    @Bean
    public UserManager getUserManager()
    {
        return new UserManagerImpl();
    }

    @Bean
    public AddressManager getAddressManager()
    {
        return new AddressManagerImpl();
    }

    @Bean
    public TwitterManager getTwitterManager()
    {
        return new TwitterManagerImpl();
    }

    @Bean
    public InstagramManager getInstagramManager()
    {
        return new InstagramManagerImpl();
    }
}
