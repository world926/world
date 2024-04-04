package com.world.web.admin.service.impl;

import com.nimbusds.jose.JOSEException;

import com.world.common.constant.RedisConstants;
import com.world.common.utils.JwtUtils;
import com.world.properties.JwtProperties;
import com.world.web.admin.pojo.bo.LoginUser;
import com.world.web.admin.pojo.dto.LoginDTO;
import com.world.web.admin.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.time.Duration;

/**
 * @author abcqwez
 */
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

	private final AuthenticationManager authenticationManager;

	private final JwtProperties jwtProperties;

	private final RedisTemplate<String, Object> redisTemplate;

	@Override
	public String login(LoginDTO loginDTO) throws JOSEException {
		// 构建认证对象
		UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginDTO.getAccount(), loginDTO.getPassword());
		// AuthenticationManager 认证，没通过则通过认证适配器给出对应的提示
		Authentication authenticate = authenticationManager.authenticate(authenticationToken);

		// 使用userId生成一个token并返回
		LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
		String userId = String.valueOf(loginUser.getSysUser().getUserId());

		// 将userId作为key，用户信息作为value存入redis
		redisTemplate.opsForValue().set(RedisConstants.getTokenKey(userId), loginUser, Duration.ofHours(jwtProperties.getExpirationTime()));

		return JwtUtils.createJwt(userId);
	}

}
