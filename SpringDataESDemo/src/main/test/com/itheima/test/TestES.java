package com.itheima.test;

import com.itheima.QuickStartApplication;
import com.itheima.domain.Article;
import com.itheima.service.ArticleService;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:42 2018/10/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = QuickStartApplication.class)
public class TestES {

    @Autowired
    private ArticleService as;

    @Test
    public void test1() {
        Article a = new Article();
        a.setId(1);
        a.setTitle("elasticSearch 3.0版本发布...更新");
        a.setContent("ElasticSearch是一个基于Lucene的搜索服务器。它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口");
        as.save(a);
    }

    @Test
    public void update() {
        Article a = new Article();
        a.setId(1);
        a.setTitle("elasticSearch 3.0版本发布...更新...");
        a.setContent("ElasticSearch是一个基于Lucene的搜索服务器。它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口");
        as.save(a);
    }
    @Test
    public void delete() {
        Article a = new Article();
        a.setId(1);
        as.delete(a);
    }
    @Test
    public void saveAll() {
        for(int i= 1;i <=100;i++) {
            Article article = new Article();
            article.setId(Integer.parseInt(i + ""));
            article.setTitle("elasticSearch 3.0版本发布...更新...");
            article.setContent("ElasticSearch是一个基于Lucene的搜索服务器。它提供了一个分布式多用户能力的全文搜索引擎，基于RESTful web接口");
            as.save(article);
        }
    }
    @Test
    public void findAllSort() {
        Iterable<Article> list = as.findAll();
        for (Article article : list) {
            System.out.println(article);
        }
    }

    @Test
    public void findAllPage() {
        Pageable pageable = PageRequest.of(0, 10);
        Page<Article> page = as.findAll(pageable);
        for (Article article : page.getContent()) {
            System.out.println(article);
        }
    }

    @Test
    public void findById() {
        Optional<Article> byId = as.findById(1);

        System.out.println(byId.get());
    }
}
