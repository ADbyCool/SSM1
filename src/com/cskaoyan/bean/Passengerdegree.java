package com.cskaoyan.bean;

public class Passengerdegree {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passengerdegree.passengerDegreeId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    private Integer passengerdegreeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column passengerdegree.passengerDegreeName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    private String passengerdegreename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passengerdegree.passengerDegreeId
     *
     * @return the value of passengerdegree.passengerDegreeId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public Integer getPassengerdegreeid() {
        return passengerdegreeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passengerdegree.passengerDegreeId
     *
     * @param passengerdegreeid the value for passengerdegree.passengerDegreeId
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public void setPassengerdegreeid(Integer passengerdegreeid) {
        this.passengerdegreeid = passengerdegreeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column passengerdegree.passengerDegreeName
     *
     * @return the value of passengerdegree.passengerDegreeName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public String getPassengerdegreename() {
        return passengerdegreename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column passengerdegree.passengerDegreeName
     *
     * @param passengerdegreename the value for passengerdegree.passengerDegreeName
     *
     * @mbg.generated Wed Apr 11 11:16:49 CST 2018
     */
    public void setPassengerdegreename(String passengerdegreename) {
        this.passengerdegreename = passengerdegreename == null ? null : passengerdegreename.trim();
    }
}