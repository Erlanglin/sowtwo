package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoCart;
import org.myoranges.sotwo.db.domain.SotwoCartExample;

public interface SotwoCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    long countByExample(SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByExample(SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insert(SotwoCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insertSelective(SotwoCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    List<SotwoCart> selectByExample(SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoCart> selectByExampleSelective(@Param("example") SotwoCartExample example, @Param("selective") SotwoCart.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    SotwoCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCart selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoCart.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoCart record, @Param("example") SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExample(@Param("record") SotwoCart record, @Param("example") SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKey(SotwoCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCart selectOneByExample(SotwoCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_cart
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCart selectOneByExampleSelective(@Param("example") SotwoCartExample example, @Param("selective") SotwoCart.Column ... selective);
}