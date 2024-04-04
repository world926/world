package com.world.web.admin.pojo.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import com.world.common.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 系统用户
 *
 * @author star926
 * @since 1.0.0 2022-06-16
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Table("sys_user")
public class SysUser extends BaseEntity {

	/**
	 * 主键，自增
	 */
	@Id
	private Long userId;

	/**
	 * 登录名
	 */
	private String account;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 账号状态（0正常 1停用）
	 */
	private Integer status;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 用户性别（0保密，1男，2女）
	 */
	private Byte sex;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 用户类型（0管理员，1普通用户）
	 */
	private Byte type;

	/**
	 * 删除标志（0代表未删除，1代表已删除）
	 */
	private Byte delFlag;

	/**
	 * 反序列化忽略
	 *
	 * @return password
	 */
	@JsonIgnore
	public String getPassword() {
		return password;
	}

	/**
	 * 序列化接收
	 *
	 * @param password password
	 */
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
}