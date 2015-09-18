package com.onboard.domain.mapper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.onboard.domain.mapper.model.common.BaseCriteria;
import com.onboard.domain.mapper.model.common.BaseExample;

public class CompanyExample implements BaseExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected int start = 0;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected int limit = -1;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public CompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public List<BaseCriteria> getOredBaseCriteria() {
        List<BaseCriteria> list = new ArrayList<BaseCriteria>();
        list.addAll(oredCriteria);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public int getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public int getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public void setLimit(int start, int limit) {
        this.start = start;
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    public CompanyExample(CompanyObject sample) {
        oredCriteria = new ArrayList<Criteria>();
        Criteria criteria = this.or();
        if (sample.getName() != null) {
            criteria.andNameEqualTo(sample.getName());
        }
        if (sample.getCreatorId() != null) {
            criteria.andCreatorIdEqualTo(sample.getCreatorId());
        }
        if (sample.getCreated() != null) {
            criteria.andCreatedEqualTo(sample.getCreated());
        }
        if (sample.getUpdated() != null) {
            criteria.andUpdatedEqualTo(sample.getUpdated());
        }
        if (sample.getDeleted() != null) {
            criteria.andDeletedEqualTo(sample.getDeleted());
        }
        if (sample.getPrivileged() != null) {
            criteria.andPrivilegedEqualTo(sample.getPrivileged());
        }
        if (sample.getMoney() != null) {
            criteria.andMoneyEqualTo(sample.getMoney());
        }
        if (sample.getLastPayTime() != null) {
            criteria.andLastPayTimeEqualTo(sample.getLastPayTime());
        }
        if (sample.getCreatorName() != null) {
            criteria.andCreatorNameEqualTo(sample.getCreatorName());
        }
        if (sample.getCreatorAvatar() != null) {
            criteria.andCreatorAvatarEqualTo(sample.getCreatorAvatar());
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table company
     * 
     * @mbggenerated Fri Sep 18 09:12:13 CST 2015
     */
    protected abstract static class GeneratedCriteria extends BaseCriteria {

        protected GeneratedCriteria() {
            super();
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creatorId =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creatorId <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creatorId >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creatorId >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creatorId <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creatorId <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creatorId in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creatorId not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creatorId between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creatorId not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andPrivilegedIsNull() {
            addCriterion("privileged is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegedIsNotNull() {
            addCriterion("privileged is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegedEqualTo(Boolean value) {
            addCriterion("privileged =", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedNotEqualTo(Boolean value) {
            addCriterion("privileged <>", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedGreaterThan(Boolean value) {
            addCriterion("privileged >", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("privileged >=", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedLessThan(Boolean value) {
            addCriterion("privileged <", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedLessThanOrEqualTo(Boolean value) {
            addCriterion("privileged <=", value, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedIn(List<Boolean> values) {
            addCriterion("privileged in", values, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedNotIn(List<Boolean> values) {
            addCriterion("privileged not in", values, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedBetween(Boolean value1, Boolean value2) {
            addCriterion("privileged between", value1, value2, "privileged");
            return (Criteria) this;
        }

        public Criteria andPrivilegedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("privileged not between", value1, value2, "privileged");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNull() {
            addCriterion("lastPayTime is null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIsNotNull() {
            addCriterion("lastPayTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeEqualTo(Date value) {
            addCriterion("lastPayTime =", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotEqualTo(Date value) {
            addCriterion("lastPayTime <>", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThan(Date value) {
            addCriterion("lastPayTime >", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastPayTime >=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThan(Date value) {
            addCriterion("lastPayTime <", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("lastPayTime <=", value, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeIn(List<Date> values) {
            addCriterion("lastPayTime in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotIn(List<Date> values) {
            addCriterion("lastPayTime not in", values, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeBetween(Date value1, Date value2) {
            addCriterion("lastPayTime between", value1, value2, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andLastPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("lastPayTime not between", value1, value2, "lastPayTime");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creatorName is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creatorName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creatorName =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creatorName <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creatorName >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creatorName >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creatorName <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creatorName <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creatorName like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creatorName not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creatorName in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creatorName not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creatorName between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creatorName not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarIsNull() {
            addCriterion("creatorAvatar is null");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarIsNotNull() {
            addCriterion("creatorAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarEqualTo(String value) {
            addCriterion("creatorAvatar =", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarNotEqualTo(String value) {
            addCriterion("creatorAvatar <>", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarGreaterThan(String value) {
            addCriterion("creatorAvatar >", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("creatorAvatar >=", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarLessThan(String value) {
            addCriterion("creatorAvatar <", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarLessThanOrEqualTo(String value) {
            addCriterion("creatorAvatar <=", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarLike(String value) {
            addCriterion("creatorAvatar like", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarNotLike(String value) {
            addCriterion("creatorAvatar not like", value, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarIn(List<String> values) {
            addCriterion("creatorAvatar in", values, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarNotIn(List<String> values) {
            addCriterion("creatorAvatar not in", values, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarBetween(String value1, String value2) {
            addCriterion("creatorAvatar between", value1, value2, "creatorAvatar");
            return (Criteria) this;
        }

        public Criteria andCreatorAvatarNotBetween(String value1, String value2) {
            addCriterion("creatorAvatar not between", value1, value2, "creatorAvatar");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table company
     * 
     * @mbggenerated do_not_delete_during_merge Fri Sep 18 09:12:13 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}