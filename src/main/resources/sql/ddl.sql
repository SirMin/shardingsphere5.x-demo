CREATE DATABASE test0;

USE test0;

CREATE TABLE `t_user0`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    `create_time` datetime,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_user1`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    `create_time` datetime,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/** ------------------------------------------------------------------------------------------------- **/

CREATE DATABASE test1;

USE test1;

CREATE TABLE `t_user0`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    `create_time` datetime,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `t_user1`
(
    `id`           bigint NOT NULL,
    `name`         varchar(20) DEFAULT NULL,
    `sharding_key` int         DEFAULT NULL,
    `create_time` datetime,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;