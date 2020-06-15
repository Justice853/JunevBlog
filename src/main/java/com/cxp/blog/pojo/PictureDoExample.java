package com.cxp.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class PictureDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureDoExample() {
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

        public Criteria andPictureaddressIsNull() {
            addCriterion("pictureaddress is null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIsNotNull() {
            addCriterion("pictureaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressEqualTo(String value) {
            addCriterion("pictureaddress =", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotEqualTo(String value) {
            addCriterion("pictureaddress <>", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThan(String value) {
            addCriterion("pictureaddress >", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pictureaddress >=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThan(String value) {
            addCriterion("pictureaddress <", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThanOrEqualTo(String value) {
            addCriterion("pictureaddress <=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLike(String value) {
            addCriterion("pictureaddress like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotLike(String value) {
            addCriterion("pictureaddress not like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIn(List<String> values) {
            addCriterion("pictureaddress in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotIn(List<String> values) {
            addCriterion("pictureaddress not in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressBetween(String value1, String value2) {
            addCriterion("pictureaddress between", value1, value2, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotBetween(String value1, String value2) {
            addCriterion("pictureaddress not between", value1, value2, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionIsNull() {
            addCriterion("picturedescription is null");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionIsNotNull() {
            addCriterion("picturedescription is not null");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionEqualTo(String value) {
            addCriterion("picturedescription =", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionNotEqualTo(String value) {
            addCriterion("picturedescription <>", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionGreaterThan(String value) {
            addCriterion("picturedescription >", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("picturedescription >=", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionLessThan(String value) {
            addCriterion("picturedescription <", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionLessThanOrEqualTo(String value) {
            addCriterion("picturedescription <=", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionLike(String value) {
            addCriterion("picturedescription like", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionNotLike(String value) {
            addCriterion("picturedescription not like", value, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionIn(List<String> values) {
            addCriterion("picturedescription in", values, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionNotIn(List<String> values) {
            addCriterion("picturedescription not in", values, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionBetween(String value1, String value2) {
            addCriterion("picturedescription between", value1, value2, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturedescriptionNotBetween(String value1, String value2) {
            addCriterion("picturedescription not between", value1, value2, "picturedescription");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNull() {
            addCriterion("picturename is null");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNotNull() {
            addCriterion("picturename is not null");
            return (Criteria) this;
        }

        public Criteria andPicturenameEqualTo(String value) {
            addCriterion("picturename =", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotEqualTo(String value) {
            addCriterion("picturename <>", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThan(String value) {
            addCriterion("picturename >", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThanOrEqualTo(String value) {
            addCriterion("picturename >=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThan(String value) {
            addCriterion("picturename <", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThanOrEqualTo(String value) {
            addCriterion("picturename <=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLike(String value) {
            addCriterion("picturename like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotLike(String value) {
            addCriterion("picturename not like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameIn(List<String> values) {
            addCriterion("picturename in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotIn(List<String> values) {
            addCriterion("picturename not in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameBetween(String value1, String value2) {
            addCriterion("picturename between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotBetween(String value1, String value2) {
            addCriterion("picturename not between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturetimeIsNull() {
            addCriterion("picturetime is null");
            return (Criteria) this;
        }

        public Criteria andPicturetimeIsNotNull() {
            addCriterion("picturetime is not null");
            return (Criteria) this;
        }

        public Criteria andPicturetimeEqualTo(String value) {
            addCriterion("picturetime =", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeNotEqualTo(String value) {
            addCriterion("picturetime <>", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeGreaterThan(String value) {
            addCriterion("picturetime >", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeGreaterThanOrEqualTo(String value) {
            addCriterion("picturetime >=", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeLessThan(String value) {
            addCriterion("picturetime <", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeLessThanOrEqualTo(String value) {
            addCriterion("picturetime <=", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeLike(String value) {
            addCriterion("picturetime like", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeNotLike(String value) {
            addCriterion("picturetime not like", value, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeIn(List<String> values) {
            addCriterion("picturetime in", values, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeNotIn(List<String> values) {
            addCriterion("picturetime not in", values, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeBetween(String value1, String value2) {
            addCriterion("picturetime between", value1, value2, "picturetime");
            return (Criteria) this;
        }

        public Criteria andPicturetimeNotBetween(String value1, String value2) {
            addCriterion("picturetime not between", value1, value2, "picturetime");
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