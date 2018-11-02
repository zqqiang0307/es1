package com.itheima.service;

import com.itheima.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 11:42 2018/10/28
 */
public interface ArticleService {
    /**
     * 保存
     * @param article
     */
    public void save(Article article);

    /**
     * 删除
     * @param article
     */
    void delete(Article article);

    /**
     * 查询全部
     * @return
     */
    Iterable<Article> findAll();

    /**
     * 分页查询
     * @param pageable
     * @return
     */
    Page<Article> findAll(Pageable pageable);

    Optional<Article> findById(Integer id);
}
