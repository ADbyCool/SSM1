package com.cskaoyan.bean;

public class Orderpayment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderpayment.orderPaymentId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    private Integer orderpaymentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderpayment.orderPaymentName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    private String orderpaymentname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderpayment.del_flag
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    private Integer delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderpayment.orderPaymentId
     *
     * @return the value of orderpayment.orderPaymentId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public Integer getOrderpaymentid() {
        return orderpaymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderpayment.orderPaymentId
     *
     * @param orderpaymentid the value for orderpayment.orderPaymentId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public void setOrderpaymentid(Integer orderpaymentid) {
        this.orderpaymentid = orderpaymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderpayment.orderPaymentName
     *
     * @return the value of orderpayment.orderPaymentName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public String getOrderpaymentname() {
        return orderpaymentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderpayment.orderPaymentName
     *
     * @param orderpaymentname the value for orderpayment.orderPaymentName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public void setOrderpaymentname(String orderpaymentname) {
        this.orderpaymentname = orderpaymentname == null ? null : orderpaymentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderpayment.del_flag
     *
     * @return the value of orderpayment.del_flag
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderpayment.del_flag
     *
     * @param delFlag the value for orderpayment.del_flag
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}