package cn.syy.hibernate;// UserRepository01.java

import cn.ssy.hibernate.Application;
import cn.ssy.hibernate.entity.UserDO;
import cn.ssy.hibernate.repository.UserRepository01;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    private UserRepository01 userRepository01;

    @Test
    public void testInsert() {
        UserDO user = new UserDO().setUsername(UUID.randomUUID().toString())
                .setPassword("nicai").setCreateTime(new Date());
        userRepository01.save(user);
    }

    @Test
    public void testUpdateById() {
        UserDO updateUser = new UserDO().setId(1)
                .setPassword("wobucai");
//        userRepository01.updateById(updateUser);
    }

    @Test
    public void testDeleteById() {
        userRepository01.deleteById(2);
    }

//    @Test
//    public void testSelectById() {
//        userRepository01.selectById(1);
//    }
//
//    @Test
//    public void testSelectByUsername() {
//        userRepository01.selectByUsername("yunai");
//    }
//
//    @Test
//    public void testSelectByIds() {
//        List<UserDO> users = userRepository01.selectByIds(Arrays.asList(1, 3));
//        System.out.println("users：" + users.size());
//    }

}
