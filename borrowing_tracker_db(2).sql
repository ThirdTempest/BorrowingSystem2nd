-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2025 at 01:48 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `borrowing_tracker_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `borrowers`
--

CREATE TABLE `borrowers` (
  `borrower_id` int(55) NOT NULL,
  `name` varchar(255) NOT NULL,
  `contact` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `purpose` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `borrowers`
--

INSERT INTO `borrowers` (`borrower_id`, `name`, `contact`, `address`, `purpose`) VALUES
(1, 'Trisha Martirez', '123456123', 'tugbongan lacion', 'birthday party'),
(2, 'Ranela Esgana', '09874452738', 'purok 4 consolacion', 'party'),
(3, 'Jocelyn Santiago', '345678901', 'Consolacion', 'Seminar'),
(4, 'Ranel Esgana', '09994142698', 'Consolacion Cebu', 'Birthday Party'),
(5, 'Ashley Ortega', '0987632123', 'Sampalok st.', 'seminar');

-- --------------------------------------------------------

--
-- Table structure for table `borrowingrecords`
--

CREATE TABLE `borrowingrecords` (
  `transaction_id` int(55) NOT NULL,
  `borrower_id` int(55) NOT NULL,
  `equipment_type` varchar(255) NOT NULL,
  `date_borrowed` date NOT NULL,
  `date_return` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `is_deleted` bit(1) DEFAULT b'0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `borrowingrecords`
--

INSERT INTO `borrowingrecords` (`transaction_id`, `borrower_id`, `equipment_type`, `date_borrowed`, `date_return`, `status`, `is_deleted`) VALUES
(1, 1, 'tables', '2025-11-12', '2025-11-13', 'returned', b'1'),
(2, 2, 'chairs', '2025-11-20', '2025-11-25', 'active', b'0'),
(3, 3, 'chairs', '2025-12-10', '2025-12-13', 'returned', b'1'),
(4, 4, 'Chairs', '2025-12-15', '2025-12-17', 'active', b'0'),
(6, 5, 'Chairs', '2025-12-25', '2025-12-30', 'active', b'0');

-- --------------------------------------------------------

--
-- Table structure for table `equipment`
--

CREATE TABLE `equipment` (
  `equipment_id` int(55) NOT NULL,
  `equipment_type` varchar(255) NOT NULL,
  `available` int(55) NOT NULL,
  `borrowed` int(55) NOT NULL,
  `total_equipments` int(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`) VALUES
(1, 'ranela', 123);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `borrowers`
--
ALTER TABLE `borrowers`
  ADD PRIMARY KEY (`borrower_id`);

--
-- Indexes for table `borrowingrecords`
--
ALTER TABLE `borrowingrecords`
  ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `borrower_id` (`borrower_id`);

--
-- Indexes for table `equipment`
--
ALTER TABLE `equipment`
  ADD PRIMARY KEY (`equipment_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `borrowers`
--
ALTER TABLE `borrowers`
  MODIFY `borrower_id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `borrowingrecords`
--
ALTER TABLE `borrowingrecords`
  MODIFY `transaction_id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `equipment`
--
ALTER TABLE `equipment`
  MODIFY `equipment_id` int(55) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `borrowingrecords`
--
ALTER TABLE `borrowingrecords`
  ADD CONSTRAINT `borrowingrecords_ibfk_1` FOREIGN KEY (`borrower_id`) REFERENCES `borrowers` (`borrower_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
