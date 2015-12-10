/*
Navicat MySQL Data Transfer

Source Server         : omada
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : ml_2015

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2015-12-10 18:18:38
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `products`
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `p_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `barcode` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `category` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `subcategory` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `vat` int(10) NOT NULL,
  `quantity` int(10) NOT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES ('1', 'Αμπερόμετρο', '0201234564567', 'Εργαλεία', 'Μετρητές', '15.00', '23', '10');
INSERT INTO `products` VALUES ('2', 'Αντίσταση 10Ω', '0207894561237', 'Ηλεκτικά Στοιχεία', 'Αντιστάσεις', '0.05', '23', '200');
INSERT INTO `products` VALUES ('3', ' Πυκνωτής 10μF', '0209638527412', 'Ηλεκτικά Στοιχεία', 'Πυκνωτές', '0.10', '23', '250');
INSERT INTO `products` VALUES ('4', 'Σειριακή Θύρα', '0207418529639', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '1.00', '23', '100');
INSERT INTO `products` VALUES ('5', 'Διατρητη Πλακέτα 12x15cm', '0208529637415', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '0.70', '23', '150');
INSERT INTO `products` VALUES ('6', 'Πλακέτα Επιχαλκωμένη 12x15', '0201596234878', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '0.80', '23', '80');
INSERT INTO `products` VALUES ('7', 'Κολλητήρι', '0204876239654', 'Εργαλεία', 'Εξαρτήματα', '15.00', '23', '60');
INSERT INTO `products` VALUES ('8', 'Καλάι', '0203571597894', 'Εργαλεία', 'Εξαρτήματα', '5.00', '23', '75');
INSERT INTO `products` VALUES ('9', 'Μικροελεγχτης PIC 16F877A', '0307894563217', 'Ηλεκτικά Στοιχεία', 'Μικροελεγχτές', '0.80', '23', '100');
INSERT INTO `products` VALUES ('10', 'Ασφάλεια 15Α', '0507896325415', 'Ηλεκτικά Στοιχεία', 'Ασφάλειες', '0.78', '23', '125');
INSERT INTO `products` VALUES ('11', '', '', '', '', '0.00', '0', '0');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `u_id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `surname` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `rights` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `e-mail` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'eirinimp', '', 'Ειρήνη', 'Μπούντου', 'admin', 'eirini_mp94@hotmail.com', '6978787878', 'Κιβέρι Αργολίδας');
INSERT INTO `users` VALUES ('2', 'ritsakost', '', 'Αγορίτσα', 'Κωστοπούλου', 'admin', 'ritsakostopoulou@hotmail.com', '6975757575', 'Καρδίτσα Καρδίτσας');
INSERT INTO `users` VALUES ('3', 'georgekap', '', 'Γεώργιος', 'Κάπαϊ', 'admin', 'georgekapai@hotmail.com', '6976767676', 'Ακράτα Αχαΐας');
INSERT INTO `users` VALUES ('4', 'pankar', '', 'Παναγιώτα', 'Καραλή', 'user', 'pan_kar@hotmail.com', '6955555555', 'Αργος Αργολίδας');
INSERT INTO `users` VALUES ('5', '', '', '', '', '', '', '', '');
