package com.world.web.admin.pojo.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.world.web.admin.pojo.vo.SysUserVO;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author star926
 */
@Data
public class LoginUser implements UserDetails {
    /**
     * 用户信息
     */
    private SysUserVO sysUser;

    /**
     * 用户权限
     */
    private Set<String> permissions;

    public LoginUser() {
    }

    public LoginUser(SysUserVO sysUser, Set<String> permissions) {
        this.sysUser = sysUser;
        this.permissions = permissions;
    }

    @JsonIgnore
    private Set<SimpleGrantedAuthority> authorities;

    @JsonIgnore
    @Override
    public String getPassword() {
        return sysUser.getPassword();
    }


    @JsonIgnore
    @Override
    public String getUsername() {
        return sysUser.getAccount();
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(authorities!=null){
            return authorities;
        }

        // 把permissions中String类型的权限信息封装成SimpleGrantedAuthority对象
        return authorities = permissions.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());
    }

    /**
     * 账户是否未过期，过期无法验证
     *
     * @return true
     */
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * 指定用户是否解锁，锁定的用户无法进行身份验证
     *
     * @return true
     */
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * 指示是否已过期的用户的凭据(密码)，过期的凭据防止认证
     *
     * @return true
     */
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * 是否可用，禁用的用户不能身份验证
     *
     * @return true
     */
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
