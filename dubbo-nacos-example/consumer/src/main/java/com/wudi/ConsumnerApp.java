package com.wudi;

import com.wudi.provider.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumnerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumnerApp.class, args);
    }

    @Reference(version = "1.0.0")
    private ProviderService providerService;

    @Bean
    public ApplicationRunner afterRun() {
        return args -> {
            System.out.println("[消费者服务调用]");
            System.out.println(providerService.echo(" consumer !"));
            System.out.println("[消费者服务调用]");
        };
    }

}
