package com.whx.mapper;

import com.whx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wu
 * @since 2023-01-07
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    List<User> queryByLikeUsername(String username);
}
