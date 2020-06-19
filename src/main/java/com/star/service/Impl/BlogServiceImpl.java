package com.star.service.Impl;

import com.star.dao.BlogMapper;
import com.star.entity.Blog;
import com.star.queryvo.BlogQuery;
import com.star.queryvo.ShowBlog;
import com.star.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author shuhao
 * @date 2020/6/18 20:03
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    //保存新增博客
    @Override
    public int saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        blog.setCommentCount(0);
        return blogMapper.saveBlog(blog);
    }

    //获取文章管理列表
    @Override
    public List<BlogQuery> getAllBlogQuery() {
        List<BlogQuery> allBlogQuery = blogMapper.getAllBlogQuery();
        return allBlogQuery;
    }

    @Override
    public void deleteBlog(Long id) {
        blogMapper.deleteBlog(id);
    }

    //查询编辑修改的文章
    @Override
    public ShowBlog getBlogById(Long id) {
        return blogMapper.getBlogById(id);
    }

    //编辑修改文章
    @Override
    public int updateBlog(ShowBlog showBlog) {
        showBlog.setUpdateTime(new Date());
        return blogMapper.updateBlog(showBlog);
    }
}
