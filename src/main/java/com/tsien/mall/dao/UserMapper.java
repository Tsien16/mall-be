package com.tsien.mall.dao;

import com.tsien.mall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/1/31 0031 18:12
 */

public interface UserMapper {
    /**
     * 删除用户
     *
     * @param id 用户id
     * @return 用户id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入用户
     *
     * @param record 用户
     * @return 用户id
     */
    int insert(User record);

    /**
     * 插入用户
     *
     * @param record 用户
     * @return 用户id
     */
    int insertSelective(User record);

    /**
     * 查询用户
     *
     * @param id 用户id
     * @return 返回用户
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 更新用户
     *
     * @param record 用户
     * @return 用户id
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户
     *
     * @param record 用户
     * @return 用户id
     */
    int updateByPrimaryKey(User record);

    /**
     * 检查用户是否存在
     *
     * @param username 用户名
     * @return 根据用户名查出的用户数量
     */
    int checkUsername(String username);

    /**
     * 检查邮箱是否存在
     *
     * @param email email
     * @return 根据email查出来的数量
     */
    int checkEmail(String email);

    /**
     * 根据用户名密码查询用户
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户实体
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名，查询密码验证问题
     *
     * @param username 用户名
     * @return 问题
     */
    String selectQuestionByUsername(String username);

    /**
     * 验证忘记密码问题的答案
     *
     * @param username 用户名
     * @param question 问题
     * @param answer   答案
     * @return 查询到结果的数量
     */
    int checkAnswer(@Param("username") String username,
                    @Param("question") String question,
                    @Param("answer") String answer);
}