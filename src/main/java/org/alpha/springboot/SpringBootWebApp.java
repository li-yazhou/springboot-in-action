package org.alpha.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController
 *      该注解等价于@Controller+@ResponseBody的结合，使用这个注解的类里面的方法都以json格式输出。
 *
 * @SpringBootApplication
 *      SprnigBoot项目的核心注解，主要目的是开启自动配置
 *      默认会扫描@SpringBootApplication注解所在的包及其子包，也可使用@ComponentScan("com.ly.controller")注解进行指定
 *
 * 启动springboot 的三种方式
 *     1. main方法启动
 *     2. 使用maven命令 mvn spring-boot:run 在命令行启动该应用
 *     3. java -jar 命令启动，需要先运行“mvn package”进行打包
 */
@RestController
@SpringBootApplication
public class SpringBootWebApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApp.class, args);
	}

}
