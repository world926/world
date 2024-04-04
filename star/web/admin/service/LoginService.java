package com.world.web.admin.service;


import com.nimbusds.jose.JOSEException;
import com.world.common.result.Result;
import com.world.web.admin.pojo.dto.LoginDTO;
import com.world.web.admin.pojo.po.SysUser;

import java.util.Map;

/**
 * @author abcqwez
 */
public interface LoginService {

	/**
	 * 用户登录
	 *
	 * @param loginDTO 登录信息
	 * @return token值
	 * @throws JOSEException jwt构建异常
	 */
	String login(LoginDTO loginDTO) throws JOSEException;
}
