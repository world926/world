package com.world.order;

import com.world.order.domain.GenTable;
import com.world.order.mapper.GenTableMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

// 此注解只能在 springboot 主包下使用 需包含 main 方法与 yml 配置文件
@DisplayName("MyBatisFlex测试案例")
@SpringBootTest
class GenTableMapperTest {

    @Resource
    private GenTableMapper genTableMapper;

    @Disabled
    @DisplayName("测试查询功能")
    @Test
    public void testDisabled() {
        System.out.println(genTableMapper);
        List<GenTable> genTables = genTableMapper.selectAll();
        System.out.println(genTables);
    }
}