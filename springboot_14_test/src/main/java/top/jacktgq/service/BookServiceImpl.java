package top.jacktgq.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.jacktgq.mapper.BookMapper;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/24--1:04
 * @Description
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
}
