package com.space.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNull() {
            addCriterion("head_img_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIsNotNull() {
            addCriterion("head_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlEqualTo(String value) {
            addCriterion("head_img_url =", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotEqualTo(String value) {
            addCriterion("head_img_url <>", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThan(String value) {
            addCriterion("head_img_url >", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_img_url >=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThan(String value) {
            addCriterion("head_img_url <", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLessThanOrEqualTo(String value) {
            addCriterion("head_img_url <=", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlLike(String value) {
            addCriterion("head_img_url like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotLike(String value) {
            addCriterion("head_img_url not like", value, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlIn(List<String> values) {
            addCriterion("head_img_url in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotIn(List<String> values) {
            addCriterion("head_img_url not in", values, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlBetween(String value1, String value2) {
            addCriterion("head_img_url between", value1, value2, "headImgUrl");
            return (Criteria) this;
        }

        public Criteria andHeadImgUrlNotBetween(String value1, String value2) {
            addCriterion("head_img_url not between", value1, value2, "headImgUrl");
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

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogIsNull() {
            addCriterion("last_update_blog is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogIsNotNull() {
            addCriterion("last_update_blog is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogEqualTo(Date value) {
            addCriterion("last_update_blog =", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogNotEqualTo(Date value) {
            addCriterion("last_update_blog <>", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogGreaterThan(Date value) {
            addCriterion("last_update_blog >", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_blog >=", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogLessThan(Date value) {
            addCriterion("last_update_blog <", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogLessThanOrEqualTo(Date value) {
            addCriterion("last_update_blog <=", value, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogIn(List<Date> values) {
            addCriterion("last_update_blog in", values, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogNotIn(List<Date> values) {
            addCriterion("last_update_blog not in", values, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogBetween(Date value1, Date value2) {
            addCriterion("last_update_blog between", value1, value2, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBlogNotBetween(Date value1, Date value2) {
            addCriterion("last_update_blog not between", value1, value2, "lastUpdateBlog");
            return (Criteria) this;
        }

        public Criteria andVipPointIsNull() {
            addCriterion("vip_point is null");
            return (Criteria) this;
        }

        public Criteria andVipPointIsNotNull() {
            addCriterion("vip_point is not null");
            return (Criteria) this;
        }

        public Criteria andVipPointEqualTo(Integer value) {
            addCriterion("vip_point =", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointNotEqualTo(Integer value) {
            addCriterion("vip_point <>", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointGreaterThan(Integer value) {
            addCriterion("vip_point >", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_point >=", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointLessThan(Integer value) {
            addCriterion("vip_point <", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointLessThanOrEqualTo(Integer value) {
            addCriterion("vip_point <=", value, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointIn(List<Integer> values) {
            addCriterion("vip_point in", values, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointNotIn(List<Integer> values) {
            addCriterion("vip_point not in", values, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointBetween(Integer value1, Integer value2) {
            addCriterion("vip_point between", value1, value2, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipPointNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_point not between", value1, value2, "vipPoint");
            return (Criteria) this;
        }

        public Criteria andVipRankIsNull() {
            addCriterion("vip_rank is null");
            return (Criteria) this;
        }

        public Criteria andVipRankIsNotNull() {
            addCriterion("vip_rank is not null");
            return (Criteria) this;
        }

        public Criteria andVipRankEqualTo(Integer value) {
            addCriterion("vip_rank =", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotEqualTo(Integer value) {
            addCriterion("vip_rank <>", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankGreaterThan(Integer value) {
            addCriterion("vip_rank >", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_rank >=", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankLessThan(Integer value) {
            addCriterion("vip_rank <", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankLessThanOrEqualTo(Integer value) {
            addCriterion("vip_rank <=", value, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankIn(List<Integer> values) {
            addCriterion("vip_rank in", values, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotIn(List<Integer> values) {
            addCriterion("vip_rank not in", values, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankBetween(Integer value1, Integer value2) {
            addCriterion("vip_rank between", value1, value2, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipRankNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_rank not between", value1, value2, "vipRank");
            return (Criteria) this;
        }

        public Criteria andVipPermissionIsNull() {
            addCriterion("vip_permission is null");
            return (Criteria) this;
        }

        public Criteria andVipPermissionIsNotNull() {
            addCriterion("vip_permission is not null");
            return (Criteria) this;
        }

        public Criteria andVipPermissionEqualTo(Integer value) {
            addCriterion("vip_permission =", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionNotEqualTo(Integer value) {
            addCriterion("vip_permission <>", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionGreaterThan(Integer value) {
            addCriterion("vip_permission >", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_permission >=", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionLessThan(Integer value) {
            addCriterion("vip_permission <", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionLessThanOrEqualTo(Integer value) {
            addCriterion("vip_permission <=", value, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionIn(List<Integer> values) {
            addCriterion("vip_permission in", values, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionNotIn(List<Integer> values) {
            addCriterion("vip_permission not in", values, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionBetween(Integer value1, Integer value2) {
            addCriterion("vip_permission between", value1, value2, "vipPermission");
            return (Criteria) this;
        }

        public Criteria andVipPermissionNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_permission not between", value1, value2, "vipPermission");
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