package com.github.regyl.gfi.configuration.lock;

import java.util.concurrent.CountDownLatch;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LockConfig {

    @Bean
    public CountDownLatch metadataLatch() {
        return new CountDownLatch(1);
    }
}
