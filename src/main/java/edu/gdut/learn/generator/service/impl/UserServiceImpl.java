package edu.gdut.learn.generator.service.impl;

import edu.gdut.learn.generator.entity.User;
import edu.gdut.learn.generator.mapper.UserMapper;
import edu.gdut.learn.generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author miemiehoho
 * @since 2021-03-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
