package com.world.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * 配置文件
 * @author SWUST
 */
@AutoConfiguration
@MapperScan("${mybatis-flex.mapper-package}")
public class MyBatisFlexConfig {

}
