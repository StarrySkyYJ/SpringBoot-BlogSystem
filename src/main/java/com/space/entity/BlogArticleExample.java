package com.space.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("blogArticleExample")
public class BlogArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogArticleExample() {
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNull() {
            addCriterion("article_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNotNull() {
            addCriterion("article_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDateEqualTo(Date value) {
            addCriterion("article_date =", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotEqualTo(Date value) {
            addCriterion("article_date <>", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThan(Date value) {
            addCriterion("article_date >", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_date >=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThan(Date value) {
            addCriterion("article_date <", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThanOrEqualTo(Date value) {
            addCriterion("article_date <=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateIn(List<Date> values) {
            addCriterion("article_date in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotIn(List<Date> values) {
            addCriterion("article_date not in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateBetween(Date value1, Date value2) {
            addCriterion("article_date between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotBetween(Date value1, Date value2) {
            addCriterion("article_date not between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIsNull() {
            addCriterion("article_views is null");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIsNotNull() {
            addCriterion("article_views is not null");
            return (Criteria) this;
        }

        public Criteria andArticleViewsEqualTo(Long value) {
            addCriterion("article_views =", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotEqualTo(Long value) {
            addCriterion("article_views <>", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsGreaterThan(Long value) {
            addCriterion("article_views >", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsGreaterThanOrEqualTo(Long value) {
            addCriterion("article_views >=", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsLessThan(Long value) {
            addCriterion("article_views <", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsLessThanOrEqualTo(Long value) {
            addCriterion("article_views <=", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIn(List<Long> values) {
            addCriterion("article_views in", values, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotIn(List<Long> values) {
            addCriterion("article_views not in", values, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsBetween(Long value1, Long value2) {
            addCriterion("article_views between", value1, value2, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotBetween(Long value1, Long value2) {
            addCriterion("article_views not between", value1, value2, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsIsNull() {
            addCriterion("article_num_comments is null");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsIsNotNull() {
            addCriterion("article_num_comments is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsEqualTo(Long value) {
            addCriterion("article_num_comments =", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsNotEqualTo(Long value) {
            addCriterion("article_num_comments <>", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsGreaterThan(Long value) {
            addCriterion("article_num_comments >", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsGreaterThanOrEqualTo(Long value) {
            addCriterion("article_num_comments >=", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsLessThan(Long value) {
            addCriterion("article_num_comments <", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsLessThanOrEqualTo(Long value) {
            addCriterion("article_num_comments <=", value, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsIn(List<Long> values) {
            addCriterion("article_num_comments in", values, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsNotIn(List<Long> values) {
            addCriterion("article_num_comments not in", values, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsBetween(Long value1, Long value2) {
            addCriterion("article_num_comments between", value1, value2, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumCommentsNotBetween(Long value1, Long value2) {
            addCriterion("article_num_comments not between", value1, value2, "articleNumComments");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeIsNull() {
            addCriterion("article_num_like is null");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeIsNotNull() {
            addCriterion("article_num_like is not null");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeEqualTo(Long value) {
            addCriterion("article_num_like =", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeNotEqualTo(Long value) {
            addCriterion("article_num_like <>", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeGreaterThan(Long value) {
            addCriterion("article_num_like >", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeGreaterThanOrEqualTo(Long value) {
            addCriterion("article_num_like >=", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeLessThan(Long value) {
            addCriterion("article_num_like <", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeLessThanOrEqualTo(Long value) {
            addCriterion("article_num_like <=", value, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeIn(List<Long> values) {
            addCriterion("article_num_like in", values, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeNotIn(List<Long> values) {
            addCriterion("article_num_like not in", values, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeBetween(Long value1, Long value2) {
            addCriterion("article_num_like between", value1, value2, "articleNumLike");
            return (Criteria) this;
        }

        public Criteria andArticleNumLikeNotBetween(Long value1, Long value2) {
            addCriterion("article_num_like not between", value1, value2, "articleNumLike");
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