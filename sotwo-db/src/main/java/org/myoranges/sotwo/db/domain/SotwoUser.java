package org.myoranges.sotwo.db.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SotwoUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.username
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.password
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.gender
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.birthday
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private LocalDate birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.last_login_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private LocalDateTime lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.last_login_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String lastLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.user_level
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String userLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.nickname
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.mobile
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.register_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String registerIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.avatar
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.weixin_openid
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String weixinOpenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.status
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sotwo_user.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.id
     *
     * @return the value of sotwo_user.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.id
     *
     * @param id the value for sotwo_user.id
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.username
     *
     * @return the value of sotwo_user.username
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.username
     *
     * @param username the value for sotwo_user.username
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.password
     *
     * @return the value of sotwo_user.password
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.password
     *
     * @param password the value for sotwo_user.password
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.gender
     *
     * @return the value of sotwo_user.gender
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.gender
     *
     * @param gender the value for sotwo_user.gender
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.birthday
     *
     * @return the value of sotwo_user.birthday
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.birthday
     *
     * @param birthday the value for sotwo_user.birthday
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.last_login_time
     *
     * @return the value of sotwo_user.last_login_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.last_login_time
     *
     * @param lastLoginTime the value for sotwo_user.last_login_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.last_login_ip
     *
     * @return the value of sotwo_user.last_login_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.last_login_ip
     *
     * @param lastLoginIp the value for sotwo_user.last_login_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.user_level
     *
     * @return the value of sotwo_user.user_level
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getUserLevel() {
        return userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.user_level
     *
     * @param userLevel the value for sotwo_user.user_level
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.nickname
     *
     * @return the value of sotwo_user.nickname
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.nickname
     *
     * @param nickname the value for sotwo_user.nickname
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.mobile
     *
     * @return the value of sotwo_user.mobile
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.mobile
     *
     * @param mobile the value for sotwo_user.mobile
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.register_ip
     *
     * @return the value of sotwo_user.register_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.register_ip
     *
     * @param registerIp the value for sotwo_user.register_ip
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.avatar
     *
     * @return the value of sotwo_user.avatar
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.avatar
     *
     * @param avatar the value for sotwo_user.avatar
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.weixin_openid
     *
     * @return the value of sotwo_user.weixin_openid
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.weixin_openid
     *
     * @param weixinOpenid the value for sotwo_user.weixin_openid
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.status
     *
     * @return the value of sotwo_user.status
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.status
     *
     * @param status the value for sotwo_user.status
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.add_time
     *
     * @return the value of sotwo_user.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.add_time
     *
     * @param addTime the value for sotwo_user.add_time
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sotwo_user.deleted
     *
     * @return the value of sotwo_user.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sotwo_user.deleted
     *
     * @param deleted the value for sotwo_user.deleted
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_user
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", lastLoginIp=").append(lastLoginIp);
        sb.append(", userLevel=").append(userLevel);
        sb.append(", nickname=").append(nickname);
        sb.append(", mobile=").append(mobile);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", avatar=").append(avatar);
        sb.append(", weixinOpenid=").append(weixinOpenid);
        sb.append(", status=").append(status);
        sb.append(", addTime=").append(addTime);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_user
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
        SotwoUser other = (SotwoUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getLastLoginIp() == null ? other.getLastLoginIp() == null : this.getLastLoginIp().equals(other.getLastLoginIp()))
            && (this.getUserLevel() == null ? other.getUserLevel() == null : this.getUserLevel().equals(other.getUserLevel()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getRegisterIp() == null ? other.getRegisterIp() == null : this.getRegisterIp().equals(other.getRegisterIp()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getWeixinOpenid() == null ? other.getWeixinOpenid() == null : this.getWeixinOpenid().equals(other.getWeixinOpenid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_user
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getLastLoginIp() == null) ? 0 : getLastLoginIp().hashCode());
        result = prime * result + ((getUserLevel() == null) ? 0 : getUserLevel().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getRegisterIp() == null) ? 0 : getRegisterIp().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getWeixinOpenid() == null) ? 0 : getWeixinOpenid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sotwo_user
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        username("username"),
        password("password"),
        gender("gender"),
        birthday("birthday"),
        lastLoginTime("last_login_time"),
        lastLoginIp("last_login_ip"),
        userLevel("user_level"),
        nickname("nickname"),
        mobile("mobile"),
        registerIp("register_ip"),
        avatar("avatar"),
        weixinOpenid("weixin_openid"),
        status("status"),
        addTime("add_time"),
        deleted("deleted");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sotwo_user
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}