package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoAdmin;
import org.myoranges.sotwo.db.domain.SotwoAdminExample;

public interface SotwoAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(SotwoAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(SotwoAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<SotwoAdmin> selectByExample(SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoAdmin> selectByExampleSelective(@Param("example") SotwoAdminExample example, @Param("selective") SotwoAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    SotwoAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoAdmin selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoAdmin.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoAdmin record, @Param("example") SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") SotwoAdmin record, @Param("example") SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(SotwoAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoAdmin selectOneByExample(SotwoAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_admin
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoAdmin selectOneByExampleSelective(@Param("example") SotwoAdminExample example, @Param("selective") SotwoAdmin.Column ... selective);
}