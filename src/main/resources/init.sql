CREATE TABLE `bee_flower` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `customType` varchar(11) DEFAULT '' COMMENT '自定义类型',
  `flowerUrl` varchar(255) DEFAULT '' COMMENT '花朵地址',
  `flowerDescribe` varchar(30) DEFAULT '' COMMENT '花朵描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of bee_flower
-- ----------------------------
INSERT INTO `bee_flower` VALUES ('1', '架构师成长之路1', 'https://baijiahao.baidu.com/s?id=1588935226240284754', '成为一名架构师得学习哪些知识？');