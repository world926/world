package com.world.web.admin.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.world.web.admin.mapper.SysRoleMapper;
import com.world.web.admin.pojo.po.SysRole;
import com.world.web.admin.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * @author zt
 * @date 2022/6/23 18:09
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
