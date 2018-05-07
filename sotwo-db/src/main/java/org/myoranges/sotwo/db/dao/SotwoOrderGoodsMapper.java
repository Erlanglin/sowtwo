package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoOrderGoods;
import org.myoranges.sotwo.db.domain.SotwoOrderGoodsExample;


public interface SotwoOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(SotwoOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(SotwoOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<SotwoOrderGoods> selectByExample(SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoOrderGoods> selectByExampleSelective(@Param("example") SotwoOrderGoodsExample example, @Param("selective") SotwoOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    SotwoOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoOrderGoods record, @Param("example") SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") SotwoOrderGoods record, @Param("example") SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(SotwoOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoOrderGoods selectOneByExample(SotwoOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoOrderGoods selectOneByExampleSelective(@Param("example") SotwoOrderGoodsExample example, @Param("selective") SotwoOrderGoods.Column ... selective);
}