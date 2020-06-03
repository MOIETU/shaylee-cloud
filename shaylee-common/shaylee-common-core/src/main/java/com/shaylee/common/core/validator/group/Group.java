package com.shaylee.common.core.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 *
 * @author Adrian
 * @date 2020-04-29
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}