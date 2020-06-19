package com.star.service;

import com.star.entity.Blog;
import com.star.queryvo.BlogQuery;
import com.star.queryvo.ShowBlog;

import java.util.List;

/**
 * @author shuhao
 * @date 2020/6/18 20:03
 */
public interface BlogService {

    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlogQuery();

    //删除博客
    void deleteBlog(Long id);

    //查询编辑修改的文章
    ShowBlog getBlogById(Long id);

    //编辑修改文章
    int updateBlog(ShowBlog showBlog);
}
