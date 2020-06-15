package com.cxp.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureIsNull() {
            addCriterion("first_picture is null");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureIsNotNull() {
            addCriterion("first_picture is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureEqualTo(String value) {
            addCriterion("first_picture =", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureNotEqualTo(String value) {
            addCriterion("first_picture <>", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureGreaterThan(String value) {
            addCriterion("first_picture >", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureGreaterThanOrEqualTo(String value) {
            addCriterion("first_picture >=", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureLessThan(String value) {
            addCriterion("first_picture <", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureLessThanOrEqualTo(String value) {
            addCriterion("first_picture <=", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureLike(String value) {
            addCriterion("first_picture like", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureNotLike(String value) {
            addCriterion("first_picture not like", value, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureIn(List<String> values) {
            addCriterion("first_picture in", values, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureNotIn(List<String> values) {
            addCriterion("first_picture not in", values, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureBetween(String value1, String value2) {
            addCriterion("first_picture between", value1, value2, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFirst_pictureNotBetween(String value1, String value2) {
            addCriterion("first_picture not between", value1, value2, "first_picture");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNull() {
            addCriterion("appreciation is null");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNotNull() {
            addCriterion("appreciation is not null");
            return (Criteria) this;
        }

        public Criteria andAppreciationEqualTo(Boolean value) {
            addCriterion("appreciation =", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotEqualTo(Boolean value) {
            addCriterion("appreciation <>", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThan(Boolean value) {
            addCriterion("appreciation >", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("appreciation >=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThan(Boolean value) {
            addCriterion("appreciation <", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThanOrEqualTo(Boolean value) {
            addCriterion("appreciation <=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationIn(List<Boolean> values) {
            addCriterion("appreciation in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotIn(List<Boolean> values) {
            addCriterion("appreciation not in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationBetween(Boolean value1, Boolean value2) {
            addCriterion("appreciation between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("appreciation not between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andShare_statementIsNull() {
            addCriterion("share_statement is null");
            return (Criteria) this;
        }

        public Criteria andShare_statementIsNotNull() {
            addCriterion("share_statement is not null");
            return (Criteria) this;
        }

        public Criteria andShare_statementEqualTo(Boolean value) {
            addCriterion("share_statement =", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementNotEqualTo(Boolean value) {
            addCriterion("share_statement <>", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementGreaterThan(Boolean value) {
            addCriterion("share_statement >", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("share_statement >=", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementLessThan(Boolean value) {
            addCriterion("share_statement <", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementLessThanOrEqualTo(Boolean value) {
            addCriterion("share_statement <=", value, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementIn(List<Boolean> values) {
            addCriterion("share_statement in", values, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementNotIn(List<Boolean> values) {
            addCriterion("share_statement not in", values, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementBetween(Boolean value1, Boolean value2) {
            addCriterion("share_statement between", value1, value2, "share_statement");
            return (Criteria) this;
        }

        public Criteria andShare_statementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("share_statement not between", value1, value2, "share_statement");
            return (Criteria) this;
        }

        public Criteria andCommentabledIsNull() {
            addCriterion("commentabled is null");
            return (Criteria) this;
        }

        public Criteria andCommentabledIsNotNull() {
            addCriterion("commentabled is not null");
            return (Criteria) this;
        }

        public Criteria andCommentabledEqualTo(Boolean value) {
            addCriterion("commentabled =", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotEqualTo(Boolean value) {
            addCriterion("commentabled <>", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledGreaterThan(Boolean value) {
            addCriterion("commentabled >", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("commentabled >=", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledLessThan(Boolean value) {
            addCriterion("commentabled <", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledLessThanOrEqualTo(Boolean value) {
            addCriterion("commentabled <=", value, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledIn(List<Boolean> values) {
            addCriterion("commentabled in", values, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotIn(List<Boolean> values) {
            addCriterion("commentabled not in", values, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledBetween(Boolean value1, Boolean value2) {
            addCriterion("commentabled between", value1, value2, "commentabled");
            return (Criteria) this;
        }

        public Criteria andCommentabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("commentabled not between", value1, value2, "commentabled");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Boolean value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Boolean value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Boolean value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Boolean value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Boolean value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Boolean> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Boolean> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Boolean value1, Boolean value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andType_idIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andType_idIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andType_idEqualTo(Long value) {
            addCriterion("type_id =", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThan(Long value) {
            addCriterion("type_id >", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThan(Long value) {
            addCriterion("type_id <", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idIn(List<Long> values) {
            addCriterion("type_id in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Long value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Long value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Long value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Long> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTag_idsIsNull() {
            addCriterion("tag_ids is null");
            return (Criteria) this;
        }

        public Criteria andTag_idsIsNotNull() {
            addCriterion("tag_ids is not null");
            return (Criteria) this;
        }

        public Criteria andTag_idsEqualTo(String value) {
            addCriterion("tag_ids =", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsNotEqualTo(String value) {
            addCriterion("tag_ids <>", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsGreaterThan(String value) {
            addCriterion("tag_ids >", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsGreaterThanOrEqualTo(String value) {
            addCriterion("tag_ids >=", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsLessThan(String value) {
            addCriterion("tag_ids <", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsLessThanOrEqualTo(String value) {
            addCriterion("tag_ids <=", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsLike(String value) {
            addCriterion("tag_ids like", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsNotLike(String value) {
            addCriterion("tag_ids not like", value, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsIn(List<String> values) {
            addCriterion("tag_ids in", values, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsNotIn(List<String> values) {
            addCriterion("tag_ids not in", values, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsBetween(String value1, String value2) {
            addCriterion("tag_ids between", value1, value2, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andTag_idsNotBetween(String value1, String value2) {
            addCriterion("tag_ids not between", value1, value2, "tag_ids");
            return (Criteria) this;
        }

        public Criteria andComment_countIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andComment_countIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andComment_countEqualTo(Integer value) {
            addCriterion("comment_count =", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countLessThan(Integer value) {
            addCriterion("comment_count <", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countIn(List<Integer> values) {
            addCriterion("comment_count in", values, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "comment_count");
            return (Criteria) this;
        }

        public Criteria andComment_countNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "comment_count");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}