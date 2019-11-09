package com.example.gowelectricity.model.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(BigDecimal value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(BigDecimal value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(BigDecimal value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(BigDecimal value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<BigDecimal> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<BigDecimal> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIsNull() {
            addCriterion("send_express_time is null");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIsNotNull() {
            addCriterion("send_express_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeEqualTo(Date value) {
            addCriterion("send_express_time =", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotEqualTo(Date value) {
            addCriterion("send_express_time <>", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeGreaterThan(Date value) {
            addCriterion("send_express_time >", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_express_time >=", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeLessThan(Date value) {
            addCriterion("send_express_time <", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_express_time <=", value, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeIn(List<Date> values) {
            addCriterion("send_express_time in", values, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotIn(List<Date> values) {
            addCriterion("send_express_time not in", values, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeBetween(Date value1, Date value2) {
            addCriterion("send_express_time between", value1, value2, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_express_time not between", value1, value2, "sendExpressTime");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNull() {
            addCriterion("express_name is null");
            return (Criteria) this;
        }

        public Criteria andExpressNameIsNotNull() {
            addCriterion("express_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNameEqualTo(String value) {
            addCriterion("express_name =", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotEqualTo(String value) {
            addCriterion("express_name <>", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThan(String value) {
            addCriterion("express_name >", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameGreaterThanOrEqualTo(String value) {
            addCriterion("express_name >=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThan(String value) {
            addCriterion("express_name <", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLessThanOrEqualTo(String value) {
            addCriterion("express_name <=", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameLike(String value) {
            addCriterion("express_name like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotLike(String value) {
            addCriterion("express_name not like", value, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameIn(List<String> values) {
            addCriterion("express_name in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotIn(List<String> values) {
            addCriterion("express_name not in", values, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameBetween(String value1, String value2) {
            addCriterion("express_name between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressNameNotBetween(String value1, String value2) {
            addCriterion("express_name not between", value1, value2, "expressName");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNull() {
            addCriterion("express_code is null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNotNull() {
            addCriterion("express_code is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeEqualTo(String value) {
            addCriterion("express_code =", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotEqualTo(String value) {
            addCriterion("express_code <>", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThan(String value) {
            addCriterion("express_code >", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("express_code >=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThan(String value) {
            addCriterion("express_code <", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("express_code <=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLike(String value) {
            addCriterion("express_code like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotLike(String value) {
            addCriterion("express_code not like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIn(List<String> values) {
            addCriterion("express_code in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotIn(List<String> values) {
            addCriterion("express_code not in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeBetween(String value1, String value2) {
            addCriterion("express_code between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotBetween(String value1, String value2) {
            addCriterion("express_code not between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceIsNull() {
            addCriterion("shipping_province is null");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceIsNotNull() {
            addCriterion("shipping_province is not null");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceEqualTo(String value) {
            addCriterion("shipping_province =", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceNotEqualTo(String value) {
            addCriterion("shipping_province <>", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceGreaterThan(String value) {
            addCriterion("shipping_province >", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_province >=", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceLessThan(String value) {
            addCriterion("shipping_province <", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceLessThanOrEqualTo(String value) {
            addCriterion("shipping_province <=", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceLike(String value) {
            addCriterion("shipping_province like", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceNotLike(String value) {
            addCriterion("shipping_province not like", value, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceIn(List<String> values) {
            addCriterion("shipping_province in", values, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceNotIn(List<String> values) {
            addCriterion("shipping_province not in", values, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceBetween(String value1, String value2) {
            addCriterion("shipping_province between", value1, value2, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingProvinceNotBetween(String value1, String value2) {
            addCriterion("shipping_province not between", value1, value2, "shippingProvince");
            return (Criteria) this;
        }

        public Criteria andShippingCityIsNull() {
            addCriterion("shipping_city is null");
            return (Criteria) this;
        }

        public Criteria andShippingCityIsNotNull() {
            addCriterion("shipping_city is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCityEqualTo(String value) {
            addCriterion("shipping_city =", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotEqualTo(String value) {
            addCriterion("shipping_city <>", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityGreaterThan(String value) {
            addCriterion("shipping_city >", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_city >=", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLessThan(String value) {
            addCriterion("shipping_city <", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLessThanOrEqualTo(String value) {
            addCriterion("shipping_city <=", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLike(String value) {
            addCriterion("shipping_city like", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotLike(String value) {
            addCriterion("shipping_city not like", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityIn(List<String> values) {
            addCriterion("shipping_city in", values, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotIn(List<String> values) {
            addCriterion("shipping_city not in", values, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityBetween(String value1, String value2) {
            addCriterion("shipping_city between", value1, value2, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotBetween(String value1, String value2) {
            addCriterion("shipping_city not between", value1, value2, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCountyIsNull() {
            addCriterion("shipping_county is null");
            return (Criteria) this;
        }

        public Criteria andShippingCountyIsNotNull() {
            addCriterion("shipping_county is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCountyEqualTo(String value) {
            addCriterion("shipping_county =", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyNotEqualTo(String value) {
            addCriterion("shipping_county <>", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyGreaterThan(String value) {
            addCriterion("shipping_county >", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_county >=", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyLessThan(String value) {
            addCriterion("shipping_county <", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyLessThanOrEqualTo(String value) {
            addCriterion("shipping_county <=", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyLike(String value) {
            addCriterion("shipping_county like", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyNotLike(String value) {
            addCriterion("shipping_county not like", value, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyIn(List<String> values) {
            addCriterion("shipping_county in", values, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyNotIn(List<String> values) {
            addCriterion("shipping_county not in", values, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyBetween(String value1, String value2) {
            addCriterion("shipping_county between", value1, value2, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingCountyNotBetween(String value1, String value2) {
            addCriterion("shipping_county not between", value1, value2, "shippingCounty");
            return (Criteria) this;
        }

        public Criteria andShippingStreetIsNull() {
            addCriterion("shipping_street is null");
            return (Criteria) this;
        }

        public Criteria andShippingStreetIsNotNull() {
            addCriterion("shipping_street is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStreetEqualTo(String value) {
            addCriterion("shipping_street =", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetNotEqualTo(String value) {
            addCriterion("shipping_street <>", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetGreaterThan(String value) {
            addCriterion("shipping_street >", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_street >=", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetLessThan(String value) {
            addCriterion("shipping_street <", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetLessThanOrEqualTo(String value) {
            addCriterion("shipping_street <=", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetLike(String value) {
            addCriterion("shipping_street like", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetNotLike(String value) {
            addCriterion("shipping_street not like", value, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetIn(List<String> values) {
            addCriterion("shipping_street in", values, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetNotIn(List<String> values) {
            addCriterion("shipping_street not in", values, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetBetween(String value1, String value2) {
            addCriterion("shipping_street between", value1, value2, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingStreetNotBetween(String value1, String value2) {
            addCriterion("shipping_street not between", value1, value2, "shippingStreet");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingPersonIsNull() {
            addCriterion("shipping_person is null");
            return (Criteria) this;
        }

        public Criteria andShippingPersonIsNotNull() {
            addCriterion("shipping_person is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPersonEqualTo(String value) {
            addCriterion("shipping_person =", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonNotEqualTo(String value) {
            addCriterion("shipping_person <>", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonGreaterThan(String value) {
            addCriterion("shipping_person >", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_person >=", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonLessThan(String value) {
            addCriterion("shipping_person <", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonLessThanOrEqualTo(String value) {
            addCriterion("shipping_person <=", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonLike(String value) {
            addCriterion("shipping_person like", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonNotLike(String value) {
            addCriterion("shipping_person not like", value, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonIn(List<String> values) {
            addCriterion("shipping_person in", values, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonNotIn(List<String> values) {
            addCriterion("shipping_person not in", values, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonBetween(String value1, String value2) {
            addCriterion("shipping_person between", value1, value2, "shippingPerson");
            return (Criteria) this;
        }

        public Criteria andShippingPersonNotBetween(String value1, String value2) {
            addCriterion("shipping_person not between", value1, value2, "shippingPerson");
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andAoidIsNull() {
            addCriterion("aoid is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("aoid is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(String value) {
            addCriterion("aoid =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(String value) {
            addCriterion("aoid <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(String value) {
            addCriterion("aoid >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(String value) {
            addCriterion("aoid >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(String value) {
            addCriterion("aoid <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(String value) {
            addCriterion("aoid <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLike(String value) {
            addCriterion("aoid like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotLike(String value) {
            addCriterion("aoid not like", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<String> values) {
            addCriterion("aoid in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<String> values) {
            addCriterion("aoid not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(String value1, String value2) {
            addCriterion("aoid between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(String value1, String value2) {
            addCriterion("aoid not between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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