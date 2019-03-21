package dao;

import pojo.Rss;

public interface RssMapper {
    int deleteByPrimaryKey(Integer rssid);

    int insert(Rss record);

    int insertSelective(Rss record);

    Rss selectByPrimaryKey(Integer rssid);

    int updateByPrimaryKeySelective(Rss record);

    int updateByPrimaryKey(Rss record);
}