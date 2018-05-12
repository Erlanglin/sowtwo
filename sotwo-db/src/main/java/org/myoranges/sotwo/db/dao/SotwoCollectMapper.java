package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoCollect;
import org.myoranges.sotwo.db.domain.SotwoCollectExample;

public interface SotwoCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    long countByExample(SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByExample(SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insert(SotwoCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int insertSelective(SotwoCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    List<SotwoCollect> selectByExample(SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoCollect> selectByExampleSelective(@Param("example") SotwoCollectExample example, @Param("selective") SotwoCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    SotwoCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCollect selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoCollect record, @Param("example") SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByExample(@Param("record") SotwoCollect record, @Param("example") SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated Sat May 12 10:41:29 CST 2018
     */
    int updateByPrimaryKey(SotwoCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCollect selectOneByExample(SotwoCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sotwo_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoCollect selectOneByExampleSelective(@Param("example") SotwoCollectExample example, @Param("selective") SotwoCollect.Column ... selective);
}