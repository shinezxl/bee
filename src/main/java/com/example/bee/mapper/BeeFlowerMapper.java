package com.example.bee.mapper;

import com.example.bee.domain.BeeFlower;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BeeFlowerMapper {

    @Insert("INSERT INTO bee_flower(customType,flowerUrl,flowerDescribe) VALUES(#{customType},#{flowerUrl},#{flowerDescribe})")
    void insert(BeeFlower beeFlower);

    @Select("SELECT * FROM bee_flower")
    List<BeeFlower> selectList(BeeFlower beeFlower);

    @Select("UPDATE bee_flower SET customType = #{customType} WHERE id = #{id}")
    void update(BeeFlower beeFlower);

}
