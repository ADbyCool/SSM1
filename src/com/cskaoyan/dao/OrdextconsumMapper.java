package com.cskaoyan.dao;

import com.cskaoyan.bean.Ordextconsum;

public interface OrdextconsumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insert(Ordextconsum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insertSelective(Ordextconsum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    Ordextconsum selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKeySelective(Ordextconsum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ordextconsum
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKey(Ordextconsum record);
}