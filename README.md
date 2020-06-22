# 夏天的风
个人博客系统（SpringBoot+Mybatis）

博客地址：http://blog.cxp853.top

### 使用该源码希望能够注明原博客以及源码出处，并禁止商用，谢谢！

项目参考b站李仁密老师的Spring Boot开发小而美的个人博客。

## 技术组合

### 前端
1. JS框架：JQuery

3. CSS框架：[Semantic UI官网](https://semantic-ui.com/ "Semantic UI官网")

5. Markdown编辑器：[编辑器 Markdown](https://pandao.github.io/editor.md/ "编辑器 Markdown")

7. 代码高亮：[代码高亮 prism](https://github.com/PrismJS/prism "代码高亮 prism")

9. 动画效果：[动画 animate.css](https://animate.style/ "动画 animate.css")

11. 文章目录：[目录生成 Tocbot](https://tscanlin.github.io/tocbot/ "目录生成 Tocbot")

14. 照片墙：[lightbox插件](https://github.com/JavaScript-Kit/jkresponsivegallery "lightbox插件")


### 后端环境：
1. 核心框架：SpringBoot 2.3.0

2. 项目构建：jdk1.8、Maven 3

3. 持久层框架：Mybatis

4. 模板框架：Thymeleaf

5. 分页插件：PageHelper

6. 加密：MD5加密

7. 运行环境：阿里云Centos7

8. 数据库：Mysql

## 功能需求
### 普通用户
-  查看文章信息：文章列表、推荐文章、文章标题、文章内容、发布时间、访问量以及评论等信息

-  查看分类文章：分类列表、分类文章信息

-  查看时间轴：按照文章时间发布顺序查看文章

-  搜索文章：导航栏右边搜索框根据关键字搜索

-  留言：留言并回复

-  查看友链：查看并访问博主在友链页面添加的友链连接

-  查看相册信息：相册列表、照片名称、照片拍摄地点、时间、照片描述

## 管理员用户（站主）
- 拥有普通用户所有功能权限

- 登录：在主页路径下加“/admin”，可进入登录页面，根据数据库的用户名和密码进行登录

- 文章管理：查询文章列表、新增文章、编辑文章、删除文章、搜索文章

- 分类管理：查询分类列表、新增分类、编辑分类、删除分类

- 友链管理：查询友链列表、新增友链、编辑友链、删除友链

- 相册管理：查询相册列表、新增照片、编辑照片、删除照片

- 消息管理：登录后恢复评论留言会显示栈主的头像信息，并能显示删除消息按键，可以对消息进行删除

## 数据库设计

### 数据表
- 博客数据表：t_blog

- 分类数据表：t_type

- 用户数据表：t_user

- 评论数据表：t_comment

- 留言数据表：t_message

- 友链数据表：t_friend

- 相册数据表：t_picture

## 表组成
- 博客表：id、title（标题）、content（文章）、first_picture（首图）、views（浏览数）、flag（原创标志）、appreciation（是否赞赏）、share_statemment（是否开启转载）、commentabled（是否开启评论）、publisted（是否发布）、recommend（是否保存）、createtime（创建时间）、updatetime（更新时间）、typeid（分类id）、userid（用户id）、description（描述）、tag_ids(标签组)、commentcount（评论数）

- 评论表：id、nickname（昵称）、email（邮箱）、content（内容）、avatar（头像）、createtime（创建时间）、blogid（博客id）、parent_comment_id（父亲id）、admincomment（股管理员评论）

- 友联表：id、createtime（创建时间）、blogaddress（网站地址）、blogname（网站名称）、pictaddress（图片地址）

- 留言表：id、nickname（昵称）、email（邮箱）、content（内容）、createtime（创建时间）、avatar(头像)、parent_message_id（父评论id）、admin_message（管理员评论）

- 图片表：id、pictureaddress（图片地址）、picturedescription（图片描述）、picturename（图片名称）、picturetime（图片地址）

- 标签表：id、name（标签名）

- 分类表：id、name（分类名）

- 用户表：id、nickname（昵称）、username（用户名）、password（密码）、email（邮箱）、avatar（头像）、type（分类）、createtime（创建时间）、updatetime（更新时间）
