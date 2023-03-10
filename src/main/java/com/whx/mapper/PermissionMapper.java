package com.whx.mapper;

import com.whx.pojo.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> queryPermissionByUserId(@Param("id") Integer id);

    List<String> queryPermission(@Param("id")Integer id);
}
