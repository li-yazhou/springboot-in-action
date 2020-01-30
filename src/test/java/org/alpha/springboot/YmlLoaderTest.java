package org.alpha.springboot;

import org.alpha.springboot.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author liyazhou1
 * @date 2020/1/30
 */
@SpringBootTest
public class YmlLoaderTest {

    @Autowired
    private User user;

    @Test
    public void ymlLoader() {
        System.out.println("user = " + user);
    }


}
