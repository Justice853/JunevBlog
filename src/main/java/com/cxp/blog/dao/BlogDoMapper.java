package com.cxp.blog.dao;

import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.pojo.BlogDoExample;
import com.cxp.blog.vo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BlogDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BlogDo record);

    int insertSelective(BlogDo record);

    List<BlogDo> selectByExampleWithBLOBs(BlogDoExample example);

    List<BlogDo> selectByExample(BlogDoExample example);

    BlogDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogDo record);

    int updateByPrimaryKeyWithBLOBs(BlogDo record);

    int updateByPrimaryKey(BlogDo record);

    List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog);

    List<BlogQuery> getAllBlogQuery();

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();

    List<FirstPageBlog> getFirstPageBlog();

    List<RecommendBlog> getAllRecommendBlog();

    List<FirstPageBlog> getByTypeId(Long typeId);

    List<FirstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    int updateViews(Long id);

    int getCommentCountById(Long id);

    int updateBlog(BlogDo blogDo);

    List<FirstPageBlog>getFirstPageBlogThree();

}