package com.cxp.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogDo {
    private Long id;

    private String title;

    private String first_picture;

    private String flag;

    private Integer views;

    private Boolean appreciation;

    private Boolean share_statement;

    private Boolean commentabled;

    private Boolean published;

    private Boolean recommend;

    private Date create_time;

    private Date update_time;

    private Long type_id;

    private Long user_id;

    private String description;

    private String tag_ids;

    private Integer comment_count;

    private String content;

    private UserDo userDo;

    private TypeDo typeDo;

    private List<TagsDo> tags = new ArrayList<> ();

    private List<CommentDo> comments = new ArrayList<>();

    private String tagsToIds(List<TagsDo> tags){
        if(!tags.isEmpty()){
            StringBuffer ids = new StringBuffer();
            boolean flag = false;
            for(TagsDo tag: tags){
                if(flag){
                    ids.append(",");
                }else {
                    flag = true;
                }
                ids.append(tag.getId());
            }
            return ids.toString();
        }else {
            return tag_ids;
        }
    }

    public void init(){
        this.tag_ids = tagsToIds(this.getTags());
    }

    public UserDo getUserDo ( ) {
        return userDo;
    }

    public void setUserDo (UserDo userDo) {
        this.userDo = userDo;
    }

    public TypeDo getTypeDo ( ) {
        return typeDo;
    }

    public void setTypeDo (TypeDo typeDo) {
        this.typeDo = typeDo;
    }

    public List<TagsDo> getTags ( ) {
        return tags;
    }

    public void setTags (List<TagsDo> tags) {
        this.tags = tags;
    }

    public List<CommentDo> getComments ( ) {
        return comments;
    }

    public void setComments (List<CommentDo> comments) {
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getFirst_picture() {
        return first_picture;
    }

    public void setFirst_picture(String first_picture) {
        this.first_picture = first_picture == null ? null : first_picture.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Boolean getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(Boolean appreciation) {
        this.appreciation = appreciation;
    }

    public Boolean getShare_statement() {
        return share_statement;
    }

    public void setShare_statement(Boolean share_statement) {
        this.share_statement = share_statement;
    }

    public Boolean getCommentabled() {
        return commentabled;
    }

    public void setCommentabled(Boolean commentabled) {
        this.commentabled = commentabled;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Long getType_id() {
        return type_id;
    }

    public void setType_id(Long type_id) {
        this.type_id = type_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTag_ids() {
        return tag_ids;
    }

    public void setTag_ids(String tag_ids) {
        this.tag_ids = tag_ids == null ? null : tag_ids.trim();
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}