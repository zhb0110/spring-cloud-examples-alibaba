spring-cloud-alibaba 官方演示，演示nacos的服务注册发现与配置功能，需要启动外部nacos

1. JDK 1.8+
2. Maven 3.6+
3. ~~Spring Boot 2.2.4.RELEASE~~ 			若依是2.3.7.RELEASE，升级
4. ~~Spring Cloud Hoxton.SR1~~ 			若依是Hoxton.SR9，升级
5. ~~Spring Cloud Alibaba 2.2.0.RELEASE~~ 	若依是2.2.6.RELEASE，升级


外部是一个空文件夹
1. 先启动外部的nacos
2. nacos-config负责配置
3. discovery-provider 提供者，在nacos中服务注册，提供资源
4. discovery-consumer 消费者，在nacos中服务注册，并访问提供者，获得提供者的资源