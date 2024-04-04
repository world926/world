package com.world.web.admin.service;

import com.mybatisflex.core.service.IService;
import com.world.web.admin.pojo.po.SysMenu;

import java.util.List;

/**
 * @author zt
 * @date 2022/6/23 18:09
 */
public interface SysMenuService extends IService<SysMenu> {

	/**
	 * 获取权限集合
	 *
	 * @param userId 用户ID
	 * @return 指定用户权限集合
	 */
	List<String> listPermsByUserId(Long userId);
}
