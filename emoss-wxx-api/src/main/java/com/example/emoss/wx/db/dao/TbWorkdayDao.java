package com.example.emoss.wx.db.dao;

import com.example.emoss.wx.db.pojo.TbWorkday;





        import com.example.emoss.wx.db.pojo.TbWorkday;
        import org.apache.ibatis.annotations.Mapper;

        import java.util.ArrayList;
        import java.util.HashMap;

@Mapper
public interface TbWorkdayDao {
    public Integer searchTodayIsWorkday();
    public ArrayList<String> searchWorkdayInRange(HashMap param);
}