package com.cxp.blog.service.impl;

import com.cxp.blog.dao.PictureDoMapper;
import com.cxp.blog.pojo.PictureDo;
import com.cxp.blog.pojo.PictureDoExample;
import com.cxp.blog.service.PictureDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureDoServiceImpl implements PictureDoService {
    @Autowired
    PictureDoMapper pictureDoMapper;
    @Override
    public List<PictureDo> listPicture ( ) {
        PictureDoExample pictureDoExample = new PictureDoExample ();
        pictureDoExample.setOrderByClause ( "id desc" );
        return pictureDoMapper.selectByExample ( pictureDoExample );
    }

    @Override
    public int savePicture (PictureDo picture) {
        return pictureDoMapper.insert ( picture );
    }

    @Override
    public PictureDo getPicture (Long id) {
        return pictureDoMapper.selectByPrimaryKey ( id );
    }

    @Override
    public int updatePicture (PictureDo picture) {
        return pictureDoMapper.updateByPrimaryKey (picture );
    }

    @Override
    public void deletePicture (Long id) {
        pictureDoMapper.deleteByPrimaryKey ( id );
    }
}
