/*****************************/
/* Base Schema  */
/*****************************/

/*Table structure for table `tenant` */

CREATE TABLE `product` (
  `product_id` bigint(20) NOT NULL,
  `product_name` varchar(80) NOT NULL,
  `product_code` varchar(80) NOT NULL,
  `release_date` datetime NOT NULL,
  `description` varchar(80) NOT NULL,
  `price` integer(10) NOT NULL,
  `star_rating` bigint (20) NOT NULL,
  `image_url` varchar(80) NOT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `reviews` (
  `id` bigint(20) NOT NULL,
  `description` varchar(80) NOT NULL,
  `ratings` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` bigint(20) AUTO_INCREMENT primary key,
  `first_name` varchar(80) NOT NULL,
  `last_name` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
