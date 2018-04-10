/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.1.51-community : Database - bs
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bs`;

/*Table structure for table `bus_data` */

DROP TABLE IF EXISTS `bus_data`;

CREATE TABLE `bus_data` (
  `id` varchar(64) NOT NULL,
  `user_id` varchar(64) DEFAULT NULL COMMENT '创建者',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `fund_num` varchar(10) DEFAULT NULL COMMENT '数量',
  `type_id` varchar(64) DEFAULT NULL COMMENT '单位',
  `distribution_flag` char(1) DEFAULT '0' COMMENT '配送标记，0未配送，1配送',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bus_data` */

/*Table structure for table `bus_department` */

DROP TABLE IF EXISTS `bus_department`;

CREATE TABLE `bus_department` (
  `id` varchar(64) NOT NULL,
  `department_name` varchar(64) DEFAULT NULL COMMENT '部门名字',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bus_department` */

insert  into `bus_department`(`id`,`department_name`,`del_flag`) values ('1','门诊部','0'),('2','住院部','0');

/*Table structure for table `bus_type` */

DROP TABLE IF EXISTS `bus_type`;

CREATE TABLE `bus_type` (
  `id` varchar(64) NOT NULL,
  `type_name` varchar(64) DEFAULT NULL COMMENT '科室名字',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  `department_id` varchar(64) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bus_type` */

insert  into `bus_type`(`id`,`type_name`,`del_flag`,`department_id`) values ('1','泌尿外科','0','1'),('2','耳鼻喉科','0','1'),('3','眼科','0','1'),('4','泌尿外科','0','2'),('5','脑外科','0','2');

/*Table structure for table `bus_type_fund` */

DROP TABLE IF EXISTS `bus_type_fund`;

CREATE TABLE `bus_type_fund` (
  `id` varchar(64) NOT NULL,
  `name` varchar(64) DEFAULT NULL COMMENT '名字',
  `unit` varchar(20) DEFAULT NULL COMMENT '单位',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  `type_id` varchar(64) DEFAULT NULL COMMENT '科室id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bus_type_fund` */

insert  into `bus_type_fund`(`id`,`name`,`unit`,`del_flag`,`type_id`) values ('1','检查手套','付','0','1'),('10','血糖试纸','盒','0','4'),('11','一次性导尿包','只','0','4'),('12','引流袋','只','0','4'),('13','利器盒','只','0','5'),('14','棉球','袋','0','5'),('15','一次性延长管','根','0','5'),('2','消毒片','瓶','0','1'),('3','一次性注射针','支','0','1'),('4','碘伏','瓶','0','2'),('5','纱布叠片','片','0','2'),('6','一次性口罩','只','0','2'),('7','绷带','卷','0','3'),('8','耦合剂','瓶','0','3'),('9','引眼科手术巾','条','0','3');

/*Table structure for table `bus_user` */

DROP TABLE IF EXISTS `bus_user`;

CREATE TABLE `bus_user` (
  `id` varchar(64) NOT NULL,
  `name` varchar(64) DEFAULT NULL COMMENT '名字',
  `login_name` varchar(64) DEFAULT NULL COMMENT '登录账号',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `del_flag` char(1) DEFAULT '0' COMMENT '删除标记',
  `department_id` varchar(64) DEFAULT NULL COMMENT '部门id',
  `type_id` varchar(64) DEFAULT NULL COMMENT '科室id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `bus_user` */

insert  into `bus_user`(`id`,`name`,`login_name`,`password`,`del_flag`,`department_id`,`type_id`) values ('1','admin','admin','123456','0','1','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
