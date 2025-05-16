-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4306
-- Generation Time: May 16, 2025 at 09:35 AM
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
-- Table structure for table `barangay_equipment`
--

CREATE TABLE `barangay_equipment` (
  `equipment_id` int(55) NOT NULL,
  `equipment_type` varchar(255) NOT NULL,
  `total_equipment` int(55) NOT NULL,
  `borrowed_equipment` int(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(1, 'Trisha Martirez', '123456123', 'tugbongan lacion', 'Baptismal Events'),
(2, 'Ranela Esgana', '09874452737', 'purok 4 consolacion', 'Funerals'),
(3, 'Jocelyn Santiago', '345678901', 'Consolacion', 'Funerals'),
(4, 'Ranel Esgana', '09994142698', 'Consolacion Cebu City', 'Funerals'),
(5, 'Ashley Ortega', '0987632123', 'Sampalok st.', 'Community Trainings'),
(6, 'Mykhel Gulfan', '09987654378', 'Lapu-Lapu City', 'Community Trainings'),
(7, 'jayr Baldevieso', '09917740507', 'Law-o Basak Mandaue City Cebu', 'Funerals'),
(8, 'Fia Anderson', '09890989098', 'Mandaue', 'Funerals'),
(9, 'Sean Cole Calixton', '09934142688', 'Purok 5 Lower Tugbongan', 'Funerals'),
(10, 'Marjorie Martirez', '09876453243', 'Purok 4, Lower Tugbongan, Consolacion', 'Baptismal Events'),
(11, 'Kimberly Santos', '09674356267', 'Upper Highland St.', 'Barangay Sports Activities'),
(12, 'Trisha Gonzales', '09876543211', 'Upper st. Danao City', 'Barangay Sports Activities');

-- --------------------------------------------------------

--
-- Table structure for table `borrowingrecords`
--

CREATE TABLE `borrowingrecords` (
  `transaction_id` int(55) NOT NULL,
  `borrower_id` int(55) NOT NULL,
  `equipment_id` int(55) NOT NULL,
  `equipment_type` varchar(255) NOT NULL,
  `date_borrowed` date NOT NULL,
  `date_return` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `is_deleted` bit(1) DEFAULT b'0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `borrowingrecords`
--

INSERT INTO `borrowingrecords` (`transaction_id`, `borrower_id`, `equipment_id`, `equipment_type`, `date_borrowed`, `date_return`, `status`, `is_deleted`) VALUES
(1, 1, 0, 'tables', '2025-11-12', '2025-11-13', 'returned', b'1'),
(2, 2, 0, 'chairs', '2025-11-20', '2025-11-25', 'returned', b'1'),
(3, 3, 0, 'chairs', '2025-12-10', '2025-12-13', 'returned', b'1'),
(4, 4, 0, 'Chairs', '2025-12-15', '2025-12-20', 'returned', b'1'),
(6, 5, 0, 'Chairs', '2025-12-25', '2025-12-30', 'returned', b'1'),
(7, 6, 0, 'Tents', '2025-05-03', '2025-05-10', 'returned', b'1'),
(8, 7, 0, 'Tents', '2025-05-03', '2025-05-06', 'returned', b'1'),
(9, 8, 0, 'Tables', '2025-05-03', '2025-05-06', 'Active', b'0'),
(10, 9, 0, 'Chairs', '2025-05-03', '2025-05-06', 'Active', b'0'),
(11, 10, 0, 'Chairs', '2025-05-09', '2025-05-12', 'returned', b'1'),
(12, 11, 0, 'Tables', '2025-05-10', '2025-05-15', 'Active', b'0'),
(13, 12, 0, 'Tents', '2025-05-10', '2025-05-13', 'Active', b'0');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`) VALUES
(2, 'ranela esgana', '2d6d024c3d0385201d6d18f0262fb269c05a1135a2a3fb5ef92faf85804bda24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barangay_equipment`
--
ALTER TABLE `barangay_equipment`
  ADD PRIMARY KEY (`equipment_id`);

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
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barangay_equipment`
--
ALTER TABLE `barangay_equipment`
  MODIFY `equipment_id` int(55) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `borrowers`
--
ALTER TABLE `borrowers`
  MODIFY `borrower_id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `borrowingrecords`
--
ALTER TABLE `borrowingrecords`
  MODIFY `transaction_id` int(55) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
