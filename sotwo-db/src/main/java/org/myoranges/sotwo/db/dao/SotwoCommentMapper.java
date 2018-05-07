package org.myoranges.sotwo.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.myoranges.sotwo.db.domain.SotwoComment;
import org.myoranges.sotwo.db.domain.SotwoCommentExample;


public interface SotwoCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(SotwoComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(SotwoComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<SotwoComment> selectByExample(SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<SotwoComment> selectByExampleSelective(@Param("example") SotwoCommentExample example, @Param("selective") SotwoComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    SotwoComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") SotwoComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") SotwoComment record, @Param("example") SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") SotwoComment record, @Param("example") SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(SotwoComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(SotwoComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoComment selectOneByExample(SotwoCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Sotwo_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SotwoComment selectOneByExampleSelective(@Param("example") SotwoCommentExample example, @Param("selective") SotwoComment.Column ... selective);
}