-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 10, 2021 at 07:37 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(60) NOT NULL,
  `fname` varchar(60) NOT NULL,
  `mname` varchar(60) NOT NULL,
  `gname` varchar(60) NOT NULL,
  `mno` varchar(60) NOT NULL,
  `dob` varchar(60) NOT NULL,
  `gender` varchar(60) NOT NULL,
  `eadd` varchar(60) NOT NULL,
  `ms` varchar(60) NOT NULL,
  `address` varchar(60) NOT NULL,
  `city` varchar(60) NOT NULL,
  `pincode` varchar(60) NOT NULL,
  `state` varchar(60) NOT NULL,
  `religion` varchar(60) NOT NULL,
  `category` varchar(60) NOT NULL,
  `income` varchar(60) NOT NULL,
  `education` varchar(60) NOT NULL,
  `occupation` varchar(60) NOT NULL,
  `pan` varchar(60) NOT NULL,
  `aadhar` varchar(60) NOT NULL,
  `senior` varchar(60) NOT NULL,
  `existing` varchar(60) NOT NULL,
  `acctype` varchar(60) NOT NULL,
  `srequired` varchar(600) NOT NULL,
  `balance` int(30) NOT NULL,
  `accno` int(60) NOT NULL,
  `pin` varchar(60) NOT NULL,
  `formno` varchar(60) NOT NULL,
  `cbook` int(15) NOT NULL,
  `who` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `fname`, `mname`, `gname`, `mno`, `dob`, `gender`, `eadd`, `ms`, `address`, `city`, `pincode`, `state`, `religion`, `category`, `income`, `education`, `occupation`, `pan`, `aadhar`, `senior`, `existing`, `acctype`, `srequired`, `balance`, `accno`, `pin`, `formno`, `cbook`, `who`) VALUES
('\"Arunangshu Das\"', '\"Gobinda Das\"', '\"Kumkum Bhowmick\"', '\"Gobinda Das\"', '7439457626', 'Jul 18, 2002', '\"Male\"', 'arunangshu2002@gmail.com', '\"Unmarried\"', '\"Mission Para, Rahara\"', '\"Kolkata\"', '\"700118\"', '\"West Bengal\"', '\"Hindu\"', '\"General\"', '\"<1,00,000\"', '\"Non-Graduate\"', '\"Salaried\"', '\"AAeu234567Y\"', '\"987654321012\"', '\"No\"', '\"No\"', 'Savings Account', 'ATM Card\"Email Address\"Cheque Book\"E-Statement', 39634, 1018182005, '9876', ' 3070', 1, 'self'),
('\"Shalini Sen\"', '\"Maukhk Sen\"', '\"Senha Sen\"', '\"Maukhk Sen\"', '6292245392', 'Jul 1, 2002', '\"Female\"', 'shalinisen@gmail.com', '\"Unmarried\"', '\"Feeder road, Belghoria\"', '\"kolkata\"', '\"700056\"', '\"West Bengal\"', '\"Hindu\"', '\"General\"', '\"<50,000\"', '\"Non-Graduate\"', '\"Salaried\"', '\"AAsd2226Y\"', '\"234567890112\"', '\"No\"', '\"No\"', 'Savings Account', 'ATM Card\"Internet Banking\"Email Address\"Cheque Book\"E-Statement', 10366, 1018182008, '1234', ' 184', 1, '3013'),
('\"Anirban Dasgupta \"', '\"Gopal Dasgupta\"', '\"Rita Dasgupta\"', '\"Gopal Dasgupta\"', '\"7980648850\"', 'Mar 11, 1990', '\"Male\"', '\"danirban1990@gmail.com\"', '\"Married\"', '\"12/7Natun  Pally \"', '\"Kolkata\"', '\"700056\"', '\"West Bengal\"', '\"Hindu\"', '\"General\"', '\"<3,50,000\"', '\"Post-Graduate\"', '\"Salaried\"', '\"GTNXZ4433A\"', '\"9754 4321 3456\"', '\"No\"', '\"No\"', 'Savings Account', 'ATM Card\"Internet Banking\"Email Address\"Cheque Book\"E-Statement', 71050, 1018182013, '167', ' 6980', 1, 'self'),
('\"Debasish Roy\"', '\"Manojit Roy\"', '\"Satavisa Roy\"', '\"Manojit Roy\"', '9526453421', 'Aug 10, 2001', '\"Male\"', 'debasish2021@gmail.com', '\"Unmarried\"', '\"76,Patipukur,Dumdum\"', '\"Kolkata\"', '\"700001\"', '\"West Bengal\"', '\"Hindu\"', '\"General\"', '\"<50,000\"', '\"Non-Graduate\"', '\"Salaried\"', '\"EHAPC6277E\"', '\"892345764529\"', '\"No\"', '\"No\"', 'Savings Account', 'ATM Card\"Internet Banking\"Mobile Banking\"Email Address\"Cheque Book\"E-Statement', 109500, 1018182017, '67890', ' 488', 3, '3016');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `name` varchar(60) NOT NULL,
  `fname` varchar(60) NOT NULL,
  `eid` int(16) NOT NULL,
  `mother` varchar(60) NOT NULL,
  `gname` varchar(60) NOT NULL,
  `mno` varchar(60) NOT NULL,
  `dob` varchar(60) NOT NULL,
  `gender` varchar(60) NOT NULL,
  `eadd` varchar(60) NOT NULL,
  `ms` varchar(60) NOT NULL,
  `address` varchar(60) NOT NULL,
  `city` varchar(60) NOT NULL,
  `pincode` varchar(60) NOT NULL,
  `state` varchar(60) NOT NULL,
  `aadhar` varchar(60) NOT NULL,
  `pan` varchar(60) NOT NULL,
  `religion` varchar(60) NOT NULL,
  `designation` varchar(60) NOT NULL,
  `qualification` varchar(60) NOT NULL,
  `toj` varchar(60) NOT NULL,
  `ald` varchar(60) NOT NULL,
  `pop` varchar(60) NOT NULL,
  `doj` varchar(60) NOT NULL,
  `pin` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`name`, `fname`, `eid`, `mother`, `gname`, `mno`, `dob`, `gender`, `eadd`, `ms`, `address`, `city`, `pincode`, `state`, `aadhar`, `pan`, `religion`, `designation`, `qualification`, `toj`, `ald`, `pop`, `doj`, `pin`) VALUES
('\"Aradhya Patro\"', '\"Debabrata Patro\"', 3013, '\"Munmun Patro\"', '\"Debabrata Patro\"', '\"9765454321\"', 'May 2, 1996', '\"Male\"', '\"paradhya@gmail.com\"', '\"Married\"', '\"Beharampur\"', '\"Bhubaneswar\"', '\"587654\"', '\"Odisha\"', '\"123456789012\"', '\"AAser345U\"', '\"Hindu\"', '\"Deputy Manager\"', '\"B.sc\"', '\"Permarent\"', 'Jul 1, 2021', '\"Andhra Pradesh\"', '\"15/Jul/2021\"', '1234'),
('\"Soumen Panja\"', '\"Ajit Panja\"', 3015, '\"Mira Panja\"', '\"Ajit Panja\"', '\"7384336774\"', 'Jan 10, 1989', '\"Male\"', '\"dsoumen1989@gmail.com\"', '\"Unmarried\"', '\"12/5 Alimuddin Street\"', '\"kolkata\"', '\"700016\"', '\"West Bengal\"', '\"9876 6789 8899\"', '\"AEGPR5566A\"', '\"Hindu\"', '\"Cashier\"', '\"M.B.A.\"', '\"Permarent\"', 'Jul 27, 2021', '\"Haryana\"', '\"27/Jul/2021\"', '2365'),
('\"Shalini Sen\"', '\"Manoj Sen\"', 3016, '\"Kanika Sen\"', '\"Manoj Sen\"', '\"9831312040\"', 'Feb 2, 1999', '\"Female\"', '\"shalini@gmail.com\"', '\"Married\"', '\"56,Feeder road, Belgharia\"', '\"Kolkata\"', '\"700056\"', '\"West Bengal\"', '\"912345102141\"', '\"BGJDR7685B\"', '\"Hindu\"', '\"Manager\"', '\"B.sc\"', '\"Permarent\"', 'Aug 12, 2021', '\"West Bengal\"', '\"13/Aug/2021\"', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`accno`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`eid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `accno` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1018182019;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `eid` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3017;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
