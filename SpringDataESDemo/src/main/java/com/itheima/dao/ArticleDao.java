package com.itheima.dao;

import com.itheima.domain.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 11:41 2018/10/28
 */
public interface ArticleDao extends ElasticsearchRepository<Article,Integer> {

    Optional<Article> findById(Integer id);
}
