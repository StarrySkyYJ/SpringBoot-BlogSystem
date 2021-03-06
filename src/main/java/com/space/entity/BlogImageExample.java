package com.space.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogImageExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andImageTitleIsNull() {
            addCriterion("image_title is null");
            return (Criteria) this;
        }

        public Criteria andImageTitleIsNotNull() {
            addCriterion("image_title is not null");
            return (Criteria) this;
        }

        public Criteria andImageTitleEqualTo(String value) {
            addCriterion("image_title =", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleNotEqualTo(String value) {
            addCriterion("image_title <>", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleGreaterThan(String value) {
            addCriterion("image_title >", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("image_title >=", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleLessThan(String value) {
            addCriterion("image_title <", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleLessThanOrEqualTo(String value) {
            addCriterion("image_title <=", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleLike(String value) {
            addCriterion("image_title like", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleNotLike(String value) {
            addCriterion("image_title not like", value, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleIn(List<String> values) {
            addCriterion("image_title in", values, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleNotIn(List<String> values) {
            addCriterion("image_title not in", values, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleBetween(String value1, String value2) {
            addCriterion("image_title between", value1, value2, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageTitleNotBetween(String value1, String value2) {
            addCriterion("image_title not between", value1, value2, "imageTitle");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIsNull() {
            addCriterion("image_description is null");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIsNotNull() {
            addCriterion("image_description is not null");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionEqualTo(String value) {
            addCriterion("image_description =", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotEqualTo(String value) {
            addCriterion("image_description <>", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionGreaterThan(String value) {
            addCriterion("image_description >", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("image_description >=", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLessThan(String value) {
            addCriterion("image_description <", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("image_description <=", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLike(String value) {
            addCriterion("image_description like", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotLike(String value) {
            addCriterion("image_description not like", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIn(List<String> values) {
            addCriterion("image_description in", values, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotIn(List<String> values) {
            addCriterion("image_description not in", values, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionBetween(String value1, String value2) {
            addCriterion("image_description between", value1, value2, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotBetween(String value1, String value2) {
            addCriterion("image_description not between", value1, value2, "imageDescription");
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