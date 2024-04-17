package com.world.order;

import com.world.order.domain.Order;
import com.world.order.mapper.OrderMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Slf4j
// 此注解只能在 springboot 主包下使用 需包含 main 方法与 yml 配置文件
@DisplayName("MyBatisFlex测试案例")
@SpringBootTest
class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Disabled
    @DisplayName("测试查询功能")
    @Test
    public void testDisabled() {
        log.debug("OrderMapper：{}", orderMapper);
        // 添加
        // Order order = new Order();
        // order.setOrderNo(RandomStringUtils.random(16, true, true));
        // order.setUserId(1L);
        // order.setAmount(new BigDecimal("100"));
        // orderMapper.insert(order);
        // 查询
        List<Order> orders = orderMapper.selectAll();
        log.debug("orderAllInfo：{}", orders);
    }
}