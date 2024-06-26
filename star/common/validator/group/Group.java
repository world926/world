package com.world.common.validator.group;

import jakarta.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 *
 * @author star926
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
