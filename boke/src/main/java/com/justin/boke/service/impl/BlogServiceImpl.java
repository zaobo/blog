package com.justin.boke.service.impl;

import com.justin.boke.entity.Blog;
import com.justin.boke.mapper.BlogMapper;
import com.justin.boke.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Justin
 * @since 2020-06-09
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
