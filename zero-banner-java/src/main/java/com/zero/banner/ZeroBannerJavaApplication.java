package com.zero.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZeroBannerJavaApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(ZeroBannerJavaApplication.class, args);
        long end = System.currentTimeMillis();
        System.out.println("启动耗时：" + (end - start) + "ms");
    }

}
