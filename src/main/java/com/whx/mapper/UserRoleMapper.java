package com.whx.mapper;

import com.whx.pojo.UserRole;
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
public interface UserRoleMapper extends BaseMapper<UserRole> {

    void deleteByUserId(Integer id);

    List<String> queryByUserId(Integer id);

    void setRole(Integer id);
}
