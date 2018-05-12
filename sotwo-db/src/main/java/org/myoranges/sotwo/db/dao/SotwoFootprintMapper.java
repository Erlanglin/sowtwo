package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoFootprint;
import org.myoranges.sotwo.db.domain.SotwoFootprintExample;

public interface SotwoFootprintMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    long countByExample(SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByExample(SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insert(SotwoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insertSelective(SotwoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    List<SotwoFootprint> selectByExample(SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoFootprint> selectByExampleSelective(@Param("example") SotwoFootprintExample example, @Param("selective") SotwoFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    SotwoFootprint selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoFootprint selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoFootprint.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoFootprint record, @Param("example") SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExample(@Param("record") SotwoFootprint record, @Param("example") SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKey(SotwoFootprint record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoFootprint selectOneByExample(SotwoFootprintExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_footprint
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoFootprint selectOneByExampleSelective(@Param("example") SotwoFootprintExample example, @Param("selective") SotwoFootprint.Column ... selective);
}