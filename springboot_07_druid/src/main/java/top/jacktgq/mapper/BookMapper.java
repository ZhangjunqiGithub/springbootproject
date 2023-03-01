package top.jacktgq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/19--23:00
 * @Description
 */
@Mapper
public interface BookMapper {
    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
