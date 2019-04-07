package com.space.entity;

import java.util.ArrayList;
import java.util.List;

public class BlogCategoriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogCategoriesExample() {
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

        public Criteria andCategoriesNameIsNull() {
            addCriterion("categories_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameIsNotNull() {
            addCriterion("categories_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameEqualTo(String value) {
            addCriterion("categories_name =", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotEqualTo(String value) {
            addCriterion("categories_name <>", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameGreaterThan(String value) {
            addCriterion("categories_name >", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("categories_name >=", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLessThan(String value) {
            addCriterion("categories_name <", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLessThanOrEqualTo(String value) {
            addCriterion("categories_name <=", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameLike(String value) {
            addCriterion("categories_name like", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotLike(String value) {
            addCriterion("categories_name not like", value, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameIn(List<String> values) {
            addCriterion("categories_name in", values, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotIn(List<String> values) {
            addCriterion("categories_name not in", values, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameBetween(String value1, String value2) {
            addCriterion("categories_name between", value1, value2, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesNameNotBetween(String value1, String value2) {
            addCriterion("categories_name not between", value1, value2, "categoriesName");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionIsNull() {
            addCriterion("categories_description is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionIsNotNull() {
            addCriterion("categories_description is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionEqualTo(String value) {
            addCriterion("categories_description =", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionNotEqualTo(String value) {
            addCriterion("categories_description <>", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionGreaterThan(String value) {
            addCriterion("categories_description >", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("categories_description >=", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionLessThan(String value) {
            addCriterion("categories_description <", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionLessThanOrEqualTo(String value) {
            addCriterion("categories_description <=", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionLike(String value) {
            addCriterion("categories_description like", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionNotLike(String value) {
            addCriterion("categories_description not like", value, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionIn(List<String> values) {
            addCriterion("categories_description in", values, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionNotIn(List<String> values) {
            addCriterion("categories_description not in", values, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionBetween(String value1, String value2) {
            addCriterion("categories_description between", value1, value2, "categoriesDescription");
            return (Criteria) this;
        }

        public Criteria andCategoriesDescriptionNotBetween(String value1, String value2) {
            addCriterion("categories_description not between", value1, value2, "categoriesDescription");
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