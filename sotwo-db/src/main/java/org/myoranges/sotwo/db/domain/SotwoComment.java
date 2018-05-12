package org.myoranges.sotwo.db.domain;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SotwoComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.type_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Byte typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.value_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Integer valueId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.content
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.user_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.has_picture
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Boolean hasPicture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.pic_urls
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String[] picUrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.star
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Short star;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_comment.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.id
     *
     * @return the value of sotwo_comment.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.id
     *
     * @param id the value for sotwo_comment.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.type_id
     *
     * @return the value of sotwo_comment.type_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Byte getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.type_id
     *
     * @param typeId the value for sotwo_comment.type_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setTypeId(Byte typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.value_id
     *
     * @return the value of sotwo_comment.value_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Integer getValueId() {
        return valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.value_id
     *
     * @param valueId the value for sotwo_comment.value_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.content
     *
     * @return the value of sotwo_comment.content
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.content
     *
     * @param content the value for sotwo_comment.content
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.user_id
     *
     * @return the value of sotwo_comment.user_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.user_id
     *
     * @param userId the value for sotwo_comment.user_id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.has_picture
     *
     * @return the value of sotwo_comment.has_picture
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.has_picture
     *
     * @param hasPicture the value for sotwo_comment.has_picture
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.pic_urls
     *
     * @return the value of sotwo_comment.pic_urls
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String[] getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.pic_urls
     *
     * @param picUrls the value for sotwo_comment.pic_urls
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.star
     *
     * @return the value of sotwo_comment.star
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Short getStar() {
        return star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.star
     *
     * @param star the value for sotwo_comment.star
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setStar(Short star) {
        this.star = star;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.add_time
     *
     * @return the value of sotwo_comment.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.add_time
     *
     * @param addTime the value for sotwo_comment.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_comment.deleted
     *
     * @return the value of sotwo_comment.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_comment.deleted
     *
     * @param deleted the value for sotwo_comment.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_comment
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeId=").append(typeId);
        sb.append(", valueId=").append(valueId);
        sb.append(", content=").append(content);
        sb.append(", userId=").append(userId);
        sb.append(", hasPicture=").append(hasPicture);
        sb.append(", picUrls=").append(picUrls);
        sb.append(", star=").append(star);
        sb.append(", addTime=").append(addTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_comment
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SotwoComment other = (SotwoComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getValueId() == null ? other.getValueId() == null : this.getValueId().equals(other.getValueId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHasPicture() == null ? other.getHasPicture() == null : this.getHasPicture().equals(other.getHasPicture()))
            && (Arrays.equals(this.getPicUrls(), other.getPicUrls()))
            && (this.getStar() == null ? other.getStar() == null : this.getStar().equals(other.getStar()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_comment
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getValueId() == null) ? 0 : getValueId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHasPicture() == null) ? 0 : getHasPicture().hashCode());
        result = prime * result + (Arrays.hashCode(getPicUrls()));
        result = prime * result + ((getStar() == null) ? 0 : getStar().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sotwo_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        typeId("type_id"),
        valueId("value_id"),
        content("content"),
        userId("user_id"),
        hasPicture("has_picture"),
        picUrls("pic_urls"),
        star("star"),
        addTime("add_time"),
        deleted("deleted");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_comment
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}