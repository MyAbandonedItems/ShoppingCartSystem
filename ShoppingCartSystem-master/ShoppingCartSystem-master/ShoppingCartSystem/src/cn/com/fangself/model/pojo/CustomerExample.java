package cn.com.fangself.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
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

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidIsNull() {
            addCriterion("customeruuid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidIsNotNull() {
            addCriterion("customeruuid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidEqualTo(String value) {
            addCriterion("customeruuid =", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidNotEqualTo(String value) {
            addCriterion("customeruuid <>", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidGreaterThan(String value) {
            addCriterion("customeruuid >", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidGreaterThanOrEqualTo(String value) {
            addCriterion("customeruuid >=", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidLessThan(String value) {
            addCriterion("customeruuid <", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidLessThanOrEqualTo(String value) {
            addCriterion("customeruuid <=", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidLike(String value) {
            addCriterion("customeruuid like", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidNotLike(String value) {
            addCriterion("customeruuid not like", value, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidIn(List<String> values) {
            addCriterion("customeruuid in", values, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidNotIn(List<String> values) {
            addCriterion("customeruuid not in", values, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidBetween(String value1, String value2) {
            addCriterion("customeruuid between", value1, value2, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomeruuidNotBetween(String value1, String value2) {
            addCriterion("customeruuid not between", value1, value2, "customeruuid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIsNull() {
            addCriterion("customerpwd is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIsNotNull() {
            addCriterion("customerpwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdEqualTo(String value) {
            addCriterion("customerpwd =", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotEqualTo(String value) {
            addCriterion("customerpwd <>", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdGreaterThan(String value) {
            addCriterion("customerpwd >", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("customerpwd >=", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLessThan(String value) {
            addCriterion("customerpwd <", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLessThanOrEqualTo(String value) {
            addCriterion("customerpwd <=", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLike(String value) {
            addCriterion("customerpwd like", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotLike(String value) {
            addCriterion("customerpwd not like", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIn(List<String> values) {
            addCriterion("customerpwd in", values, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotIn(List<String> values) {
            addCriterion("customerpwd not in", values, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdBetween(String value1, String value2) {
            addCriterion("customerpwd between", value1, value2, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotBetween(String value1, String value2) {
            addCriterion("customerpwd not between", value1, value2, "customerpwd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_customer
     *
     * @mbg.generated do_not_delete_during_merge Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_customer
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
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