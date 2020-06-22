package com.cxp.blog.service;

import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.vo.*;

import java.util.List;

public interface BlogDoService {
    BlogDo getBlogById(Long id);

    List<BlogDo> getAlllist(); //查询所有

    int saveBlog(BlogDo blogDo);

    int updateBlog(BlogDo blogDo);

    void deleteBlog(Long id);

    List<FirstPageBlog> getByTypeId(Long typeId);

    List<BlogQuery> searchAllBlog(SearchBlog searchBlog); //条件查询所有
//     List<BlogDo> searchAllBlog(BlogDo blogDo);
//    List<BlogQuery> getAllBlog();
     List<BlogQuery> getAllBlog();
//
//    List<BlogQuery> getBlogBySearch(SearchBlog searchBlog);

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();

    List<FirstPageBlog> getAllFirstPageBlog();

    List<RecommendBlog> getRecommendedBlog();

    List<FirstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    List<FirstPageBlog>getFirstPageBlogThree();

}
