package com.cxp.blog.service.impl;

import com.cxp.blog.dao.BlogDoMapper;
import com.cxp.blog.exception.NotFoundException;
import com.cxp.blog.pojo.BlogDo;
import com.cxp.blog.pojo.BlogDoExample;
import com.cxp.blog.service.BlogDoService;
import com.cxp.blog.utils.MarkdownUtils;
import com.cxp.blog.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BlogDoServiceImpl implements BlogDoService {
    @Autowired
    BlogDoMapper blogDoMapper;


    public BlogDo getBlogById (Long id) {
        return blogDoMapper.selectByPrimaryKey ( id );
    }


    public List<BlogDo> getAlllist ( ) {
        BlogDoExample blogDoExample = new BlogDoExample ();
        blogDoExample.setOrderByClause ( "id desc" );
        return blogDoMapper.selectByExample ( blogDoExample );
    }


    public int saveBlog (BlogDo blogDo) {
        blogDo.setCreate_time ( new Date (  ) );
        blogDo.setUpdate_time ( new Date (  ) );
        blogDo.setViews ( 0 );
        blogDo.setComment_count (0);

        return blogDoMapper.insert ( blogDo );

        }



    @Override
    public int updateBlog (BlogDo blogDo) {
        blogDo.setUpdate_time ( new Date (  ) );
        return blogDoMapper.updateBlog ( blogDo );
    }


    public int updateBlog (Long id, BlogDo blogDo) {
        BlogDo b =blogDoMapper.selectByPrimaryKey ( id );
        if(b==null){
            throw new NotFoundException ( "该文章不存在" );
        }
        BeanUtils.copyProperties (blogDo,b );
        blogDo.setUpdate_time ( new Date (  ) );
        return blogDoMapper.updateByPrimaryKey ( blogDo );
    }


    public void deleteBlog (Long id) {
        blogDoMapper.deleteByPrimaryKey ( id );
    }

    @Override
    public List<FirstPageBlog> getByTypeId (Long typeId) {
        return blogDoMapper.getByTypeId ( typeId );
    }

    @Override
    public List<BlogQuery> searchAllBlog (SearchBlog searchBlog) {
        return blogDoMapper.searchByTitleOrTypeOrRecommend ( searchBlog );
    }

//    @Override
//    public List<BlogDo> searchAllBlog (BlogDo blogDo) {
//        return  blogDoMapper.searchByTitleOrTypeOrRecommend ( blogDo );
//    }

    @Override
    public List<BlogQuery> getAllBlog ( ) {
        return blogDoMapper.getAllBlogQuery ();
    }

    @Override
    public Integer getBlogTotal ( ) {
        return blogDoMapper.getBlogTotal ();
    }

    @Override
    public Integer getBlogViewTotal ( ) {
        return blogDoMapper.getBlogViewTotal ();
    }

    @Override
    public Integer getBlogCommentTotal ( ) {
        return blogDoMapper.getBlogCommentTotal ();
    }

    @Override
    public Integer getBlogMessageTotal ( ) {
        return blogDoMapper.getBlogMessageTotal ();
    }

    @Override
    public List<FirstPageBlog> getAllFirstPageBlog ( ) {
        return blogDoMapper.getFirstPageBlog ();
    }

    @Override
    public List<RecommendBlog> getRecommendedBlog ( ) {
        return blogDoMapper.getAllRecommendBlog ();
    }

    @Override
    public List<FirstPageBlog> getSearchBlog (String query) {
        return blogDoMapper.getSearchBlog ( query );
    }

    @Override
    public DetailedBlog getDetailedBlog (Long id) {
        DetailedBlog detailedBlog = blogDoMapper.getDetailedBlog ( id );
        if(detailedBlog==null){
            throw  new NotFoundException ( "该博客不存在" );
        }
        String content = detailedBlog.getContent ();
        detailedBlog.setContent ( MarkdownUtils.markdownToHtmlExtensions ( content ) );
        blogDoMapper.updateViews ( id );
        blogDoMapper.getCommentCountById ( id );
        return detailedBlog;
    }

//    public List<BlogDo> searchAllBlog (BlogDo blog) {
//        return blogDoMapper.searchByTitleOrTypeOrRecommend ( blog );
//    }



}
