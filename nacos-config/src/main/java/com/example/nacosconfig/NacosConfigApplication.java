package com.example.nacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigApplication.class, args);
//        String userName = applicationContext.getEnvironment().getProperty("user.name");
//        String userAge = applicationContext.getEnvironment().getProperty("user.age");
//        System.err.println("user name :"+userName+"; age: "+userAge);


        while(true) {
            //当动态配置刷新时，会自动更新到 Enviroment中，因此这里每隔一秒中从Enviroment中获取配置
            // 这里这么写只是想让人看到是否更新了。
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");

//            System.err.println("user name :" + userName + "; age: " + userAge);

            //获取当前部署的环境
            String currentEnv = applicationContext.getEnvironment().getProperty("current.env");
            System.err.println("in "+currentEnv+" enviroment; "+"user name :" + userName + "; age: " + userAge);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
