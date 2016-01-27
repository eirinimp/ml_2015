-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 27 Ιαν 2016 στις 21:44:33
-- Έκδοση διακομιστή: 5.6.21
-- Έκδοση PHP: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Βάση δεδομένων: `ml_2015`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `products`
--

CREATE TABLE IF NOT EXISTS `products` (
`p_id` int(5) NOT NULL,
  `title` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `barcode` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `category` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `subcategory` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `vat` int(10) NOT NULL,
  `quantity` int(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Άδειασμα δεδομένων του πίνακα `products`
--

INSERT INTO `products` (`p_id`, `title`, `barcode`, `category`, `subcategory`, `price`, `vat`, `quantity`) VALUES
(1, 'Αμπερόμετρο', '0201234564567', 'Εργαλεία', 'Μετρητές', '15.00', 23, 10),
(2, 'Αντίσταση 10Ω', '0207894561237', 'Ηλεκτικά Στοιχεία', 'Αντιστάσεις', '0.05', 23, 200),
(3, ' Πυκνωτής 10μF', '0209638527412', 'Ηλεκτικά Στοιχεία', 'Πυκνωτές', '0.10', 23, 250),
(4, 'Σειριακή Θύρα', '0207418529639', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '1.00', 23, 100),
(5, 'Διατρητη Πλακέτα 12x15cm', '0208529637415', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '0.70', 23, 150),
(6, 'Πλακέτα Επιχαλκωμένη 12x15', '0201596234878', 'Ηλεκτικά Στοιχεία', 'Εξαρτήματα', '0.80', 23, 80),
(7, 'Κολλητήρι', '0204876239654', 'Εργαλεία', 'Εξαρτήματα', '15.00', 23, 60),
(8, 'Καλάι', '0203571597894', 'Εργαλεία', 'Εξαρτήματα', '5.00', 23, 75),
(9, 'Μικροελεγχτης PIC 16F877A', '0307894563217', 'Ηλεκτικά Στοιχεία', 'Μικροελεγχτές', '0.80', 23, 100),
(10, 'Ασφάλεια 15Α', '0507896325415', 'Ηλεκτικά Στοιχεία', 'Ασφάλειες', '0.78', 23, 125);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`u_id` int(10) NOT NULL,
  `username` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `surname` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `rights` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `e-mail` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `phone` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Άδειασμα δεδομένων του πίνακα `users`
--

INSERT INTO `users` (`u_id`, `username`, `password`, `name`, `surname`, `rights`, `e-mail`, `phone`, `address`) VALUES
(1, 'eirinimp', 'ce589abb971c391a62dac92dca8b3b35', 'Ειρήνη', 'Μπούντου', 'admin', 'eirini_mp94@hotmail.com', '6978787878', 'Κιβέρι Αργολίδας'),
(2, 'ritsakost', '98f41855dd0de7e94e1bee9b7ac5c5b7', 'Αγορίτσα', 'Κωστοπούλου', 'admin', 'ritsakostopoulou@hotmail.com', '6975757575', 'Καρδίτσα Καρδίτσας'),
(3, 'georgekap', '2771517ee94e060cfee58a939c2c19b1', 'Γεώργιος', 'Κάπαϊ', 'admin', 'georgekapai@hotmail.com', '6976767676', 'Ακράτα Αχαΐας'),
(4, 'pankar', '1a1dc91c907325c69271ddf0c944bc72', 'Παναγιώτα', 'Καραλή', 'user', 'pan_kar@hotmail.com', '6955555555', 'Αργος Αργολίδας');

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `products`
--
ALTER TABLE `products`
 ADD PRIMARY KEY (`p_id`);

--
-- Ευρετήρια για πίνακα `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `products`
--
ALTER TABLE `products`
MODIFY `p_id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT για πίνακα `users`
--
ALTER TABLE `users`
MODIFY `u_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
