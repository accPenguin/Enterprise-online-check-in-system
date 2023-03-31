package com.example.emoss.wx.db.dao;







import com.example.emoss.wx.db.pojo.TbCity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbCityDao {
    public String searchCode(String city);
}