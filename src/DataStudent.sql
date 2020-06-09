CREATE SCHEMA if not exists `DataStudent`;
USE DataStudent;
DROP PROCEDURE IF EXISTS `?`;
DELIMITER //
ALTER SCHEMA `datastudent`  DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_general_ci ;
CREATE PROCEDURE `?`()
BEGIN
  DECLARE CONTINUE HANDLER FOR SQLEXCEPTION BEGIN END;
   CREATE TABLE `DataStudent`.`Student`
(
    `Id`	int PRIMARY KEY auto_increment,
	`IdCard`	TEXT,
	`Name`	TEXT,
	`Birthday`	TEXT,
	`Email`	TEXT
);

CREATE TABLE `DataStudent`.`User` (
    `Id` INT PRIMARY KEY AUTO_INCREMENT,
     `Username` text,
     `Password` text not null
);


/*ALTER TABLE `DataProject`.`Remind` ADD FOREIGN KEY (`IdUser`) REFERENCES `DataProject`.`User` (`Id`);/* liên kết khóa ngoại.*/




END //
/*DELIMITER ;*/
CALL `?`();
DROP PROCEDURE `?`;
INSERT INTO `datastudent`.`student` (`IdCard`, `Name`, `Birthday`, `Email`)
 VALUES ('1612359','Nguyễn Thanh Luân', '08/03/1998','nguyenthanhluan0803@gmail.com');
INSERT INTO `datastudent`.`student` (`IdCard`, `Name`, `Birthday`, `Email`) VALUES ('1612360','Nguyễn Thanh Luân', '08/03/1998','nguyenthanhluan0803@gmail.com');
INSERT INTO `datastudent`.`student` (`IdCard`, `Name`, `Birthday`, `Email`) VALUES ('1612361','Nguyễn Thanh Luân', '08/03/1998','nguyenthanhluan0803@gmail.com');
/*INSERT INTO Student values('1612362','Nguyễn Thanh Luân', '08/03/1998','nguyenthanhluan0803@gmail.com');*/
INSert INTO `datastudent`.`user` ( `Username`, `Password`) values ('luan', '123');