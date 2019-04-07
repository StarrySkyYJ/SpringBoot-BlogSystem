package com.space.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogCommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCommentsExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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

        public Criteria andCommentsNumLikeIsNull() {
            addCriterion("comments_num_like is null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeIsNotNull() {
            addCriterion("comments_num_like is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeEqualTo(Long value) {
            addCriterion("comments_num_like =", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeNotEqualTo(Long value) {
            addCriterion("comments_num_like <>", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeGreaterThan(Long value) {
            addCriterion("comments_num_like >", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeGreaterThanOrEqualTo(Long value) {
            addCriterion("comments_num_like >=", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeLessThan(Long value) {
            addCriterion("comments_num_like <", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeLessThanOrEqualTo(Long value) {
            addCriterion("comments_num_like <=", value, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeIn(List<Long> values) {
            addCriterion("comments_num_like in", values, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeNotIn(List<Long> values) {
            addCriterion("comments_num_like not in", values, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeBetween(Long value1, Long value2) {
            addCriterion("comments_num_like between", value1, value2, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsNumLikeNotBetween(Long value1, Long value2) {
            addCriterion("comments_num_like not between", value1, value2, "commentsNumLike");
            return (Criteria) this;
        }

        public Criteria andCommentsDateIsNull() {
            addCriterion("comments_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentsDateIsNotNull() {
            addCriterion("comments_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsDateEqualTo(Date value) {
            addCriterion("comments_date =", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateNotEqualTo(Date value) {
            addCriterion("comments_date <>", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateGreaterThan(Date value) {
            addCriterion("comments_date >", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comments_date >=", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateLessThan(Date value) {
            addCriterion("comments_date <", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateLessThanOrEqualTo(Date value) {
            addCriterion("comments_date <=", value, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateIn(List<Date> values) {
            addCriterion("comments_date in", values, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateNotIn(List<Date> values) {
            addCriterion("comments_date not in", values, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateBetween(Date value1, Date value2) {
            addCriterion("comments_date between", value1, value2, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andCommentsDateNotBetween(Date value1, Date value2) {
            addCriterion("comments_date not between", value1, value2, "commentsDate");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdIsNull() {
            addCriterion("parent_comments_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdIsNotNull() {
            addCriterion("parent_comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdEqualTo(Integer value) {
            addCriterion("parent_comments_id =", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdNotEqualTo(Integer value) {
            addCriterion("parent_comments_id <>", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdGreaterThan(Integer value) {
            addCriterion("parent_comments_id >", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_comments_id >=", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdLessThan(Integer value) {
            addCriterion("parent_comments_id <", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_comments_id <=", value, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdIn(List<Integer> values) {
            addCriterion("parent_comments_id in", values, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdNotIn(List<Integer> values) {
            addCriterion("parent_comments_id not in", values, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_comments_id between", value1, value2, "parentCommentsId");
            return (Criteria) this;
        }

        public Criteria andParentCommentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_comments_id not between", value1, value2, "parentCommentsId");
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