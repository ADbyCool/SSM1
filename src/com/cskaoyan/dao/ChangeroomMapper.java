package com.cskaoyan.dao;

import com.cskaoyan.bean.Changeroom;

public interface ChangeroomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insert(Changeroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insertSelective(Changeroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    Changeroom selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKeySelective(Changeroom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeroom
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKey(Changeroom record);
}