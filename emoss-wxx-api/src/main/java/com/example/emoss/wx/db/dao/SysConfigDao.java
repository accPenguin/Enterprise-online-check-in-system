package com.example.emoss.wx.db.dao;

import com.example.emoss.wx.db.pojo.SysConfig;




        import com.example.emoss.wx.db.pojo.SysConfig;
        import org.apache.ibatis.annotations.Mapper;

        import java.util.List;

@Mapper
public interface SysConfigDao {
    public List<SysConfig> selectAllParam();
}