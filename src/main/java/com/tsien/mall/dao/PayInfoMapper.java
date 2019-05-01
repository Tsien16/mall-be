package com.tsien.mall.dao;

import com.tsien.mall.pojo.PayInfo;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface PayInfoMapper {

    /**
     * 根据主键删除
     *
     * @param id 主键
     * @return 删除的条数
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insert(PayInfo record);

    /**
     * 有选择的插入数据
     *
     * @param record 实体
     * @return 插入的数据量
     */
    int insertSelective(PayInfo record);

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 实体
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * 有选择的更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /**
     * 根据主键更新
     *
     * @param record 实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(PayInfo record);
}