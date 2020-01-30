package org.alpha.springboot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 通过加载配置文件为当前类中的属性注入值
 *
 * @Component
 *      必须将当前类加入到容器
 *
 * @ConfigurationProperties(value = "user")
 *      默认读取全局配置文件获取值，当前类中的所有属性与 user 进行绑定
 *
 * @author liyazhou1
 * @date 2020/1/30
 */
@Component
@ConfigurationProperties(value = "user")
@Data
public class User {

    private String username;
    private Integer age;
    private Boolean status;
    private Date birthday;
    private Address address;
    private List<String> lists;
    private Map<String, Object> maps;

}
