package io.github.vino42;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootMybatisFlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisFlexApplication.class, args);
    }

}
