package com.artisan.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 
 * @author yangshangwei
 *
 * @param <T> 通用mapper 创建CommonMapper接口继承Mapper
 * 
 * 
 * 通用 Mapper 是一个可以实现任意 MyBatis 通用方法的框架，项目提供了常规的增删改查操作以及 Example 相关的单表操作。
 * 通用 Mapper 是为了解决 MyBatis 使用中 90% 的基本操作.
 * PageHelper则提供通用的分页查询功能，使用它们可以很方便的进行开发，可以节省开发人员大量的时间
 * 
 * 通用Mapper的GIT地址： https://gitee.com/free/Mapper

         分页插件的GIT地址： https://github.com/pagehelper/Mybatis-PageHelper
 * 
 */
public interface CommonMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
