package com.cskaoyan.dao;

import com.cskaoyan.bean.Passenger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface PassengerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int deleteByPrimaryKey(Integer passengerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insert(Passenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int insertSelective(Passenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    Passenger selectByPrimaryKey(Integer passengerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKeySelective(Passenger record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table passenger
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    int updateByPrimaryKey(Passenger record);

    List<Passenger> findPassengerByName(String passenName);


    int  findAllPassengerCount();

    List<Passenger> findAllPassenger();

    List<Passenger> findPartPassenger(HashMap<String,Integer> map);
}