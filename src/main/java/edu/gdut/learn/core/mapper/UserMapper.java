package edu.gdut.learn.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.gdut.learn.core.entity.ProductVO;
import edu.gdut.learn.core.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    @Select("select p.*,u.name userName from product p,user u where p.user_id = u.id AND u.id = #{id};")
    List<ProductVO> productList(Integer id);
}
