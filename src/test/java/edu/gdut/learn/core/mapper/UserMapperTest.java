package edu.gdut.learn.core.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.gdut.learn.core.entity.User;
import edu.gdut.learn.core.enums.AgeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void test() {
        mapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User user = new User();
        user.setAge(10);
        user.setName("社会人");
        mapper.insert(user);
        System.out.println(user);
    }

    @Test
    void update(){
//         User user1 = mapper.selectById(7);
//        user1.setAge(3);
//        mapper.updateById(user1);

        User user = mapper.selectById(8);
        user.setName("小红");
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("age",22);
        mapper.update(user,queryWrapper);
    }

    @Test
    void delete() {
//        mapper.deleteById(1);


//        mapper.deleteBatchIds(Arrays.asList(1,2));


//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.eq("age",14);
//        mapper.delete(queryWrapper);


        Map<String, Object> map = new HashMap<>();
        map.put("id", 3);
        mapper.deleteByMap(map);
    }

    @Test
    void select() {
//        System.out.println(mapper.selectById(7));
//        mapper.selectBatchIds(Arrays.asList(7,8,9)).forEach(System.out::println);
        //Map 只能做等值判断，逻辑判断需要使用 Wrapper
//        Map<String, Object> map = new HashMap<>();
//        map.put("id", 7);
//        mapper.selectByMap(map).forEach(System.out::println);

//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.gt("id",2);
//        System.out.println(mapper.selectCount(wrapper));

        //将查询的结果封装到MAP中
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.gt("id", 2);
//        mapper.selectMaps(wrapper).forEach(System.out::println);
//        System.out.println("-----------------------");
//        mapper.selectList(wrapper).forEach(System.out::println);


        //分页查询
//        Page<User> page = new Page<>(2,2);
//
//        Page<User> result = mapper.selectPage(page,null);
//        System.out.println(result.getSize());
//        System.out.println(result.getTotal());
//        result.getRecords().forEach(System.out::println);


//        Page<Map<String,Object>> page = new Page<>(1,2);
//        mapper.selectMapsPage(page,null).getRecords().forEach(System.out::println);

//        mapper.selectObjs(null).forEach(System.out::println);

//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("id",7);
//        System.out.println(mapper.selectOne(wrapper));
    }

    @Test
    void product() {
        mapper.productList(7).forEach(System.out::println);
    }
}