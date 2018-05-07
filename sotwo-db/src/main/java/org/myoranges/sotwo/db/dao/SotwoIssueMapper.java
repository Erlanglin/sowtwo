package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoIssue;
import org.myoranges.sotwo.db.domain.SotwoIssueExample;


public interface SotwoIssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(SotwoIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(SotwoIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<SotwoIssue> selectByExample(SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoIssue> selectByExampleSelective(@Param("example") SotwoIssueExample example, @Param("selective") SotwoIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    SotwoIssue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoIssue.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoIssue record, @Param("example") SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") SotwoIssue record, @Param("example") SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(SotwoIssue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoIssue selectOneByExample(SotwoIssueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_issue
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoIssue selectOneByExampleSelective(@Param("example") SotwoIssueExample example, @Param("selective") SotwoIssue.Column ... selective);
}