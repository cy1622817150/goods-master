package jlu.edu.cn.lsh.po;

public class Cartitem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cartitem.cartItemId
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String cartitemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cartitem.quantity
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cartitem.bid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String bid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cartitem.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cartitem.orderBy
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private Integer orderby;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cartitem.cartItemId
     *
     * @return the value of cartitem.cartItemId
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getCartitemid() {
        return cartitemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cartitem.cartItemId
     *
     * @param cartitemid the value for cartitem.cartItemId
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setCartitemid(String cartitemid) {
        this.cartitemid = cartitemid == null ? null : cartitemid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cartitem.quantity
     *
     * @return the value of cartitem.quantity
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cartitem.quantity
     *
     * @param quantity the value for cartitem.quantity
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cartitem.bid
     *
     * @return the value of cartitem.bid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cartitem.bid
     *
     * @param bid the value for cartitem.bid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cartitem.uid
     *
     * @return the value of cartitem.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cartitem.uid
     *
     * @param uid the value for cartitem.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cartitem.orderBy
     *
     * @return the value of cartitem.orderBy
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public Integer getOrderby() {
        return orderby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cartitem.orderBy
     *
     * @param orderby the value for cartitem.orderBy
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setOrderby(Integer orderby) {
        this.orderby = orderby;
    }
}