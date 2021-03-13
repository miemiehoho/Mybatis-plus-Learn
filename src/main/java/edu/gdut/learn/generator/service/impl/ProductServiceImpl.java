package edu.gdut.learn.generator.service.impl;

import edu.gdut.learn.generator.entity.Product;
import edu.gdut.learn.generator.mapper.ProductMapper;
import edu.gdut.learn.generator.service.ProductService;
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
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
