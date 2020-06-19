package com.star.dao;

import com.star.entity.Blog;
import com.star.queryvo.BlogQuery;
import com.star.queryvo.ShowBlog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shuhao
 * @date 2020/6/18 20:04
 */
@Mapper
@Repository
public interface BlogMapper {

    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlogQuery();

    //删除博客
    void deleteBlog(Long id);

    //编辑博客
    int updateBlog(ShowBlog showBlog);

    //查询编辑修改的文章
    ShowBlog getBlogById(Long id);
}
