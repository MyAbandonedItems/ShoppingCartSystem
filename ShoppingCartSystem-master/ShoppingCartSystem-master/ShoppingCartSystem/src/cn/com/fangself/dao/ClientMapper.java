package cn.com.fangself.dao;

import cn.com.fangself.model.pojo.Client;
import cn.com.fangself.model.pojo.ClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    long countByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int deleteByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int insertSelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    List<Client> selectByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    Client selectByPrimaryKey(Integer clientid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_client
     *
     * @mbg.generated Sun Jun 04 21:02:56 GMT+08:00 2017
     */
    int updateByPrimaryKey(Client record);
}