create table `user`(
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
    `password` varchar(255) NOT NULL DEFAULT '' COMMENT '密码',
    `email` varchar(255) NOT NULL DEFAULT '' COMMENT '邮箱',
    `role` varchar(255) NOT NULL DEFAULT '' COMMENT '角色',
    `state` tinyint(1) unsigned DEFAULT 0 COMMENT '是否删除 0 为未删除、1 为已删除',
    `created_on` datetime DEFAULT current_timestamp() COMMENT '创建时间',
    `modified_on` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


INSERT INTO `user`
(username,password,email,role)
values
('admin','admin','admin@email','超级管理员');