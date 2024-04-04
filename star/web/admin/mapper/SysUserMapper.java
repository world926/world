package com.world.web.admin.mapper;

import com.mybatisflex.core.BaseMapper;
import com.world.web.admin.pojo.po.SysUser;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * 系统用户
 *
 * @author abcqwez
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
	/**
	 * 查询用户权限
	 *
	 * @param userId 用户id
	 * @return 用户权限列表
	 */
	Set<String> selectPermsByUserId(Long userId);
}
