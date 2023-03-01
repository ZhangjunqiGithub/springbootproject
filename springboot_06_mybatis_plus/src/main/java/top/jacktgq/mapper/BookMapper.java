package top.jacktgq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/19--23:00
 * @Description
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
