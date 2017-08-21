package org.github.mervyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*主要目的是开启自动配置.相当于@Configuration，@EnableAutoConfiguration，@ComponentScan的组合
* @Configuration:它就是JavaConfig形式的Spring Ioc容器的配置类使用的那个@Configuration，SpringBoot社区推荐使用基于
* 				JavaConfig的配置形式，所以，这里的启动类标注了@Configuration之后，本身其实也是一个IoC容器的配置类。
* @ComponentScan:@ComponentScan这个注解在Spring中很重要，它对应XML配置中的元素，@ComponentScan的功能其实
* 				就是自动扫描并加载符合条件的组件（比如@Component和@Repository等）或者bean定义，最终将这些bean定义加
* 				载到IoC容器中。我们可以通过basePackages等属性来细粒度的定制@ComponentScan自动扫描的范围，如果不指定，
* 				则默认Spring框架实现会从声明@ComponentScan所在类的package进行扫描。所以SpringBoot的启动类最好是放在
* 				root package下，因为默认不指定basePackages。
* @EnableAutoConfiguration：@EnableAutoConfiguration也是借助@Import的帮助，将所有符合自动配置条件的bean定义加载到
* 				IoC容器。
*
* */
@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);
	}
}
