package com.world.core.constant;

/**
 * 缓存的key 常量
 *
 * @author Lion Li
 */
public interface CacheConstants {

    /**
     * 在线用户 redis key
     */
    String ONLINE_TOKEN_KEY = "online_tokens:";

    /**
     * 参数管理 cache key
     */
    String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache key
     */
    String SYS_DICT_KEY = "sys_dict:";

    /**
     * 小程序使用缓存
     */
    String WECHAT_MA_KEY = "wechat:ma:";

    /**
     * 记录上一次用户选择的实验室
     */
    String USER_CHECK_LAB_ID = "lab:check:";

    /**
     * 行政区域
     */
    String SYS_REGION = "sys_region";


    /**
     * 用户成果提示
     */
    String USER_RESULT_HINT = "result:hint:";
}
