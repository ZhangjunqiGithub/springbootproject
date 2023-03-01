package top.jacktgq.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.jacktgq.pojo.Book;

import java.util.List;

/**
 * @Author CandyWall
 * @Date 2022/1/20--12:03
 * @Description
 */
public interface BookService {
    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
