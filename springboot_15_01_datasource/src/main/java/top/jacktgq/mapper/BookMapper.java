package top.jacktgq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/24--1:05
 * @Description
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
