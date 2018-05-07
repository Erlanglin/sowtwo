package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoRegionProvince;
import org.myoranges.sotwo.db.domain.SotwoRegionProvinceExample;


public interface SotwoRegionProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(SotwoRegionProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(SotwoRegionProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<SotwoRegionProvince> selectByExample(SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoRegionProvince> selectByExampleSelective(@Param("example") SotwoRegionProvinceExample example, @Param("selective") SotwoRegionProvince.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    SotwoRegionProvince selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoRegionProvince selectByPrimaryKeySelective(@Param("code") Integer code, @Param("selective") SotwoRegionProvince.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoRegionProvince record, @Param("example") SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") SotwoRegionProvince record, @Param("example") SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoRegionProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(SotwoRegionProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoRegionProvince selectOneByExample(SotwoRegionProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_region_province
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoRegionProvince selectOneByExampleSelective(@Param("example") SotwoRegionProvinceExample example, @Param("selective") SotwoRegionProvince.Column ... selective);
}