package com.whx.mapper;

import com.whx.pojo.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wu
 * @since 2023-01-07
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
