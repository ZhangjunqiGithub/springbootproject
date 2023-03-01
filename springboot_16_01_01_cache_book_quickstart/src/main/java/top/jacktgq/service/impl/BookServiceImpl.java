package top.jacktgq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import top.jacktgq.mapper.BookMapper;
import top.jacktgq.pojo.Book;
import top.jacktgq.service.IBookService;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Author CandyWall
 * @Date 2022/1/20--12:50
 * @Description
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    private HashMap<Serializable, Book> cache = new HashMap<>();

    @Override
    // 模拟缓存
    public Book getById(Serializable id) {
        // 如果当前缓存中没有本次要查询的数据，则进行查询，否则直接从缓存中获取数据返回
        Book book = cache.get(id);
        if (book == null) {
            book = super.getById(id);
            cache.put(id, book);
        }
        return book;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        IPage<Book> page = new Page<>(currentPage, pageSize);
        bookMapper.selectPage(page, null);
        return page;
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        IPage<Book> page = new Page<>(currentPage, pageSize);
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
        lqw.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType());
        lqw.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());
        bookMapper.selectPage(page, lqw);
        return page;
    }
}
