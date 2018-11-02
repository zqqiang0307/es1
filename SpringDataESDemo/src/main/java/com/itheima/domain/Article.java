package com.itheima.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



/**
 @Author: Mr_Zhao
 @Description:
 @Date: Create in 11:14 2018/10/28
 其中，注解解释如下：
 @Document(indexName="blob3",type="article")：
 indexName：索引的名称（必填项）
 type：索引的类型

 @Id：主键的唯一标识
 @Field(index=true,analyzer="ik_smart",store=true,searchAnalyzer="ik_smart",type =
 FieldType.text)
 index：是否设置分词
 analyzer：存储时使用的分词器
 searchAnalyze：搜索时使用的分词器
 store：是否存储
 type: 数据类型

 注： 一旦添加了@Filed注解，所有的默认值都不再生效。此外，如果添加了@Filed注解，那么type字段必须指定。
 所以一般不用添加。
 */
@Document(indexName = "blog3",type = "article")
public class Article {
    @Id
    //@Field(store = true,type = FieldType.Integer)
    private Integer id;
    //@Field(index = true,analyzer = "ik_smart",store = true,type = FieldType.text)
    private String title;
    //@Field(index = true,analyzer = "ik_smart",store = true,type = FieldType.text)
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
