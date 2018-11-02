package com.itheima.service.impl;

import com.itheima.dao.ArticleDao;
import com.itheima.domain.Article;
import com.itheima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 11:42 2018/10/28
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public void save(Article article) {
        articleDao.save(article);
    }

    @Override
    public void delete(Article article) {
        articleDao.delete(article);
    }

    @Override
    public Iterable<Article> findAll() {
        return articleDao.findAll(Sort.by(Sort.Order.desc("id")));
    }

    @Override
    public Page<Article> findAll(Pageable pageable) {
        return articleDao.findAll(pageable);
    }

    @Override
    public Optional<Article> findById(Integer id) {
        return articleDao.findById(id);
    }
}
