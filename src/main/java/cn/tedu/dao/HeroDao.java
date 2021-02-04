package cn.tedu.dao;

import cn.tedu.entity.Hero;
import cn.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class HeroDao {
    public void add(Hero hero){
        //获取连接
        try(Connection conn= DBUtils.getConn()){
            String sql="insert into hero values(null,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,hero.getName());
            ps.setString(2,hero.getType());
            ps.setInt(3,hero.getMoney());
            ps.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
