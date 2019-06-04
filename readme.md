```$xslt
 通过命令行设施属性
 java -jar xxx.jar --server.port=8888
 在命令行运行时，连续的两个减号--就是对application.properties中的属性值进行赋值的标识。
 所以，java -jar xxx.jar --server.port=8888命令，等价于我们在application.properties中添加属性server.port=8888
 Spring Boot也贴心的提供了屏蔽命令行访问属性的设置，只需要这句设置就能屏蔽：SpringApplication.setAddCommandLineProperties(false)



  在Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，其中{profile}对应你的环境标识，比如：

  application-dev.properties：开发环境
  application-test.properties：测试环境
  application-prod.properties：生产环境

至于哪个具体的配置文件会被加载，需要在application.properties文件中通过
spring.profiles.active属性来设置，其值对应{profile}值。  
```