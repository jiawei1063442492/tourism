package com.yuanzhi.tourism.entity;

import java.util.ArrayList;
import java.util.List;

public class HistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryExample() {
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

        public Criteria andHistoryIdIsNull() {
            addCriterion("history_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("history_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(Integer value) {
            addCriterion("history_id =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(Integer value) {
            addCriterion("history_id <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(Integer value) {
            addCriterion("history_id >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_id >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(Integer value) {
            addCriterion("history_id <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("history_id <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<Integer> values) {
            addCriterion("history_id in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<Integer> values) {
            addCriterion("history_id not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("history_id between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("history_id not between", value1, value2, "historyId");
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

        public Criteria andHistoryTypeIsNull() {
            addCriterion("history_type is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeIsNotNull() {
            addCriterion("history_type is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeEqualTo(Integer value) {
            addCriterion("history_type =", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNotEqualTo(Integer value) {
            addCriterion("history_type <>", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeGreaterThan(Integer value) {
            addCriterion("history_type >", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_type >=", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeLessThan(Integer value) {
            addCriterion("history_type <", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("history_type <=", value, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeIn(List<Integer> values) {
            addCriterion("history_type in", values, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNotIn(List<Integer> values) {
            addCriterion("history_type not in", values, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("history_type between", value1, value2, "historyType");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("history_type not between", value1, value2, "historyType");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameIsNull() {
            addCriterion("history_type_name is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameIsNotNull() {
            addCriterion("history_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameEqualTo(String value) {
            addCriterion("history_type_name =", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameNotEqualTo(String value) {
            addCriterion("history_type_name <>", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameGreaterThan(String value) {
            addCriterion("history_type_name >", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("history_type_name >=", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameLessThan(String value) {
            addCriterion("history_type_name <", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameLessThanOrEqualTo(String value) {
            addCriterion("history_type_name <=", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameLike(String value) {
            addCriterion("history_type_name like", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameNotLike(String value) {
            addCriterion("history_type_name not like", value, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameIn(List<String> values) {
            addCriterion("history_type_name in", values, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameNotIn(List<String> values) {
            addCriterion("history_type_name not in", values, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameBetween(String value1, String value2) {
            addCriterion("history_type_name between", value1, value2, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeNameNotBetween(String value1, String value2) {
            addCriterion("history_type_name not between", value1, value2, "historyTypeName");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlIsNull() {
            addCriterion("history_type_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlIsNotNull() {
            addCriterion("history_type_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlEqualTo(String value) {
            addCriterion("history_type_imgurl =", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlNotEqualTo(String value) {
            addCriterion("history_type_imgurl <>", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlGreaterThan(String value) {
            addCriterion("history_type_imgurl >", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("history_type_imgurl >=", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlLessThan(String value) {
            addCriterion("history_type_imgurl <", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlLessThanOrEqualTo(String value) {
            addCriterion("history_type_imgurl <=", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlLike(String value) {
            addCriterion("history_type_imgurl like", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlNotLike(String value) {
            addCriterion("history_type_imgurl not like", value, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlIn(List<String> values) {
            addCriterion("history_type_imgurl in", values, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlNotIn(List<String> values) {
            addCriterion("history_type_imgurl not in", values, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlBetween(String value1, String value2) {
            addCriterion("history_type_imgurl between", value1, value2, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTypeImgurlNotBetween(String value1, String value2) {
            addCriterion("history_type_imgurl not between", value1, value2, "historyTypeImgurl");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeIsNull() {
            addCriterion("history_time is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeIsNotNull() {
            addCriterion("history_time is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeEqualTo(String value) {
            addCriterion("history_time =", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeNotEqualTo(String value) {
            addCriterion("history_time <>", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeGreaterThan(String value) {
            addCriterion("history_time >", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("history_time >=", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeLessThan(String value) {
            addCriterion("history_time <", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeLessThanOrEqualTo(String value) {
            addCriterion("history_time <=", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeLike(String value) {
            addCriterion("history_time like", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeNotLike(String value) {
            addCriterion("history_time not like", value, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeIn(List<String> values) {
            addCriterion("history_time in", values, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeNotIn(List<String> values) {
            addCriterion("history_time not in", values, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeBetween(String value1, String value2) {
            addCriterion("history_time between", value1, value2, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimeNotBetween(String value1, String value2) {
            addCriterion("history_time not between", value1, value2, "historyTime");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesIsNull() {
            addCriterion("history_times is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesIsNotNull() {
            addCriterion("history_times is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesEqualTo(Integer value) {
            addCriterion("history_times =", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesNotEqualTo(Integer value) {
            addCriterion("history_times <>", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesGreaterThan(Integer value) {
            addCriterion("history_times >", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_times >=", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesLessThan(Integer value) {
            addCriterion("history_times <", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesLessThanOrEqualTo(Integer value) {
            addCriterion("history_times <=", value, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesIn(List<Integer> values) {
            addCriterion("history_times in", values, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesNotIn(List<Integer> values) {
            addCriterion("history_times not in", values, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesBetween(Integer value1, Integer value2) {
            addCriterion("history_times between", value1, value2, "historyTimes");
            return (Criteria) this;
        }

        public Criteria andHistoryTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("history_times not between", value1, value2, "historyTimes");
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