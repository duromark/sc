package com.wangxin.provider.mapper.auth;

import org.apache.ibatis.annotations.Mapper;

import com.wangxin.common.api.model.auth.UserRole;
import com.wangxin.provider.mapper.BaseMapper;

/** 
 * @Description 用户与角色关系Mapper
 * @author 王鑫 
 * @date Apr 12, 2017 9:13:44 AM  
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<String, UserRole> {

}
