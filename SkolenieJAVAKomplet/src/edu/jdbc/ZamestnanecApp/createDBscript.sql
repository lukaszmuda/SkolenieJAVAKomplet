create database if not exists demo;

use demo;

drop table if exists zamestnanci;

CREATE TABLE `zamestnanci` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `priezvisko` varchar(64) DEFAULT NULL,
  `meno` varchar(64) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `oddelenie` varchar(64) DEFAULT NULL,
  `plat` DECIMAL(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (1,'Doe','John','john.doe@foo.com', 'HR', 55000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (2,'Public','Mary','mary.public@foo.com', 'Engineering', 75000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (3,'Queue','Susan','susan.queue@foo.com', 'Legal', 130000.00);

INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (4,'Williams','David','david.williams@foo.com', 'HR', 120000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (5,'Johnson','Lisa','lisa.johnson@foo.com', 'Engineering', 50000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (6,'Smith','Paul','paul.smith@foo.com', 'Legal', 100000.00);

INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (7,'Adams','Carl','carl.adams@foo.com', 'HR', 50000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (8,'Brown','Bill','bill.brown@foo.com', 'Engineering', 50000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (9,'Thomas','Susan','susan.thomas@foo.com', 'Legal', 80000.00);

INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (10,'Davis','John','john.davis@foo.com', 'HR', 45000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (11,'Fowler','Mary','mary.fowler@foo.com', 'Engineering', 65000.00);
INSERT INTO `zamestnanci` (`id`,`priezvisko`,`meno`,`email`, `oddelenie`, `plat`) VALUES (12,'Waters','David','david.waters@foo.com', 'Legal', 90000.00);

