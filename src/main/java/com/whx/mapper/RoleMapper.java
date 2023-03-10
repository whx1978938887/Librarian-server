package com.whx.mapper;

import com.whx.pojo.Role;
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
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoleByLikeName(String name);

    Role getRoleByEqualName(String name);
}
