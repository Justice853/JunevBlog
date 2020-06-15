package com.cxp.blog.service;

import com.cxp.blog.pojo.PictureDo;

import java.util.List;

public interface PictureDoService {
    //查询照片
    List<PictureDo> listPicture();

    //添加图片
    int savePicture(PictureDo picture);

    //根据id查询照片
    PictureDo getPicture(Long id);

    //    编辑修改相册
    int updatePicture(PictureDo picture);

    //    删除照片
    void deletePicture(Long id);
}
