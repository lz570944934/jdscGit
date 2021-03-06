package org.lanqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.lanqiao.mapper")
public class JdscApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdscApplication.class, args);
    }

}
