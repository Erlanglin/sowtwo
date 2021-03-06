package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoCoupon;
import org.myoranges.sotwo.db.domain.SotwoCouponExample;

public interface SotwoCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    long countByExample(SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByExample(SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insert(SotwoCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insertSelective(SotwoCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    List<SotwoCoupon> selectByExample(SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoCoupon> selectByExampleSelective(@Param("example") SotwoCouponExample example, @Param("selective") SotwoCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    SotwoCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCoupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoCoupon record, @Param("example") SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExample(@Param("record") SotwoCoupon record, @Param("example") SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKey(SotwoCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCoupon selectOneByExample(SotwoCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCoupon selectOneByExampleSelective(@Param("example") SotwoCouponExample example, @Param("selective") SotwoCoupon.Column ... selective);
}