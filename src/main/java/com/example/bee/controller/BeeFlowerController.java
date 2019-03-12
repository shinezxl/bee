package com.example.bee.controller;

import com.example.bee.config.BeeConstant;
import com.example.bee.domain.BeeFlower;
import com.example.bee.mapper.BeeFlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/beeFlower")
public class BeeFlowerController {

    @Autowired
    BeeFlowerMapper beeFlowerMapper;

    @PostMapping("/insert")
    public String insert(BeeFlower beeFlower){
        try {
            beeFlowerMapper.insert(beeFlower);
            return BeeConstant.SUUCESS;
        } catch (Exception e) {
            return BeeConstant.FAILURE;
        }
    }

    @GetMapping("/selectList")
    public List<BeeFlower> selectList(BeeFlower beeFlower){
        try {
            return beeFlowerMapper.selectList(beeFlower);
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("/update")
    public String update(BeeFlower beeFlower){
        try {
            beeFlowerMapper.update(beeFlower);
            return BeeConstant.SUUCESS;
        } catch (Exception e) {
            return BeeConstant.FAILURE;
        }
    }
}
