-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 01, 2021 at 04:47 PM
-- Server version: 8.0.27
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ques_table_admin`
--

-- --------------------------------------------------------

--
-- Table structure for table `question_table`
--

DROP TABLE IF EXISTS `question_table`;
CREATE TABLE IF NOT EXISTS `question_table` (
  `id` varchar(10) NOT NULL,
  `question` varchar(500) NOT NULL,
  `option1` varchar(500) NOT NULL,
  `option2` varchar(500) NOT NULL,
  `option3` varchar(500) NOT NULL,
  `option4` varchar(500) NOT NULL,
  `answer` varchar(500) NOT NULL,
  `maxmarks` int NOT NULL,
  `level` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `question_table`
--

INSERT INTO `question_table` (`id`, `question`, `option1`, `option2`, `option3`, `option4`, `answer`, `maxmarks`, `level`) VALUES
('1', 'Which statement is not true in java language?  ', 'A public member of a class can be accessed in all the packages.', 'A private member of a class cannot be accessed by the methods of the same class.', 'A private member of a class cannot be accessed from its derived class. ', 'A protected member of a class can be accessed from its derived class.', 'A protected member of a class can be accessed from its derived class.', 3, 'Good'),
('2', 'To prevent any method from overriding, we declare the method as,    ', ' static', 'const', 'final', 'abstract', 'abstract', 3, 'Good'),
('3', 'The fields in an interface are implicitly specified as,  ', 'static only ', 'protected', 'private ', 'Both static and final', 'Both static and final', 3, 'Good'),
('4', 'Which of the following is not true?  ', 'An interface can extend another interface.', 'A class which is implementing an interface must implement all the methods of the interface.', 'An interface can implement another interface.', 'An interface is a solution for multiple inheritance in java.', 'An interface is a solution for multiple inheritance in java.', 3, 'Good'),
('5', 'Which of the following is true?  ', 'A finally block is executed before the catch block but after the try block.', 'A finally block is executed, only after the catch block is executed.', 'A finally block is executed whether an exception is thrown or not.', ' A finally block is executed, only if an exception occurs.', ' A finally block is executed, only if an exception occurs.', 3, 'Good'),
('6', 'Among these expressions, which is(are) of type String?  ', '“0”', '“ab” + “cd” ', '‘0’ ', ' Both Option1 and Option2', ' Both Option1 and Option2', 5, 'Tough'),
('7', 'What is the type and value of the following expression? (Notice the integer division) -4 + 1/2 + 2*-3 + 5.0  ', 'int -5', 'double -4.5', 'int -4', 'double -5.0', 'double -5.0', 5, 'Tough'),
('8', 'Which of the following variable declaration would NOT compile in a java program?  ', 'int VAR;', 'int var1; ', 'int 1_var;', 'int var;', 'int var;', 5, 'Tough'),
('9', 'A constructor  ', 'Is used to create objects.', 'May be declared private', 'Must have the same name as the class it is declared within.', 'All of the above', 'All of the above', 7, 'Complex'),
('10', 'A protected member cannot be accessed in, Which is the false option? ', 'a subclass of different package ', 'a non-subclass of different package', ' a non-subclass of the same package', 'a subclass of the same package', 'a subclass of the same package', 7, 'Complex'),
('11', 'dwd', 'dwd', 'asd', 'adada', 'dada', 'dada', 7, '');

-- --------------------------------------------------------

--
-- Table structure for table `student details`
--

DROP TABLE IF EXISTS `student details`;
CREATE TABLE IF NOT EXISTS `student details` (
  `name` varchar(100) NOT NULL,
  `rollno` varchar(100) NOT NULL,
  `section` varchar(100) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `phoneno` varchar(100) NOT NULL,
  `date` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `marks` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student_detail`
--

DROP TABLE IF EXISTS `student_detail`;
CREATE TABLE IF NOT EXISTS `student_detail` (
  `name` varchar(100) NOT NULL,
  `rollno` varchar(100) NOT NULL,
  `section` varchar(100) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `phoneno` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `marks` varchar(100) NOT NULL,
  `q1` varchar(500) NOT NULL,
  `q2` varchar(500) NOT NULL,
  `q3` varchar(500) NOT NULL,
  `q4` varchar(500) NOT NULL,
  `q5` varchar(500) NOT NULL,
  `q6` varchar(500) NOT NULL,
  `q7` varchar(500) NOT NULL,
  `q8` varchar(500) NOT NULL,
  `q9` varchar(500) NOT NULL,
  `q10` varchar(500) NOT NULL,
  `verdict` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `student_detail`
--

INSERT INTO `student_detail` (`name`, `rollno`, `section`, `emailid`, `phoneno`, `date`, `marks`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`, `q8`, `q9`, `q10`, `verdict`) VALUES
('subas', '117', 'b', 'belli@mail.com', '985674321', '29-11-2021', '5', '', '', '', '', '', '', '', '', '', '', ''),
('subas', '117', 'b', 'iit2020117@iiita.ac.in', '978623345', '29-11-2021', '5', '', '', '', '', '', '', '', '', '', '', ''),
('aa', '11', 'a', 'nnii', '12234', '29-11-2021', '6', '', '', '', '', '', '', '', '', '', '', ''),
('qqq', '122', 'b', 'qwert', '56678231', '29-11-2021', '6', '', '', '', '', '', '', '', '', '', '', ''),
('aaa', '111', 'a', 'aa', '11', '29-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('nithin', 'ii2020155', 'B', 'akshaytelu@gmail.com', '9848808984', '29-11-2021', '18', '', '', '', '', '', '', '', '', '', '', ''),
('vinet', '1', 'b', 'iit2020149@iiita.ac.in', '987654321', '29-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('shylesh', '11', 'b', 'iit2020141@iiita.ac.in', '9866625645', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('nikil', '12', 'a', 'cuni@mail.com', '8885226479', '30-11-2021', '10', '', '', '', '', '', '', '', '', '', '', ''),
('trilok', '13', 'a', 'bibu@mail.com', '658992341', '30-11-2021', '9', '', '', '', '', '', '', '', '', '', '', ''),
('risab', '13', 'b', 'pat@mail.com', '7899542231', '30-11-2021', '9', '', '', '', '', '', '', '', '', '', '', ''),
('dasd', 'sfaFSASFAF', 'AFAF', 'aFASF', 'afasf', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('akshay ', 'aa', 'aaa', 'aaa', 'aaaaa', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('akshay', '355', '333', '33', '333', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('vuneteiq', 'aEq', 'b', 'AKB', 'sss', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('akshay', '5221', 'B', 'gmao.com', '9848808984', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', ''),
('akshaygha', 'iit2020155678', 'B', 'akshaytelu@', '389906823', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', 'final', 'protected', 'An interface can implement another interface.', 'A finally block is executed whether an exception is thrown or not.', '', '', '', '', '', ''),
('akshay', '1234secb', 'secb', 'akshay@gmail.com', '9848898943', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', 'abstract', '', 'An interface can implement another interface.', '', '', '', '', '', '', ''),
('akshay', '^^^^', 'hjwvh', 'qwdjfwkbjfb', '780470', '30-11-2021', '0', 'A private member of a class cannot be accessed by the methods of the same class.', '', '', 'An interface can implement another interface.', '', '', 'int -4', '', '', '', ''),
('nandaji', '698532', '2525', '32525', '325123153215', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', 'const', 'private ', 'A class which is implementing an interface must implement all the methods of the interface.', 'A finally block is executed, only after the catch block is executed.', '‘0’ ', 'int -4', 'int var1; ', 'Must have the same name as the class it is declared within.', '', ''),
('akshay kumar', '890809', 'b', 'akshay', 'jink', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', 'abstract', 'private ', 'An interface can implement another interface.', 'A finally block is executed, only after the catch block is executed.', '“ab” + “cd” ', 'double -4.5', 'int 1_var;', 'All of the above', 'a subclass of the same package', ''),
('akshay ', '1657', 'fghv', 'giub', 'giuviu898', '30-11-2021', '11', 'A public member of a class can be accessed in all the packages.', 'abstract', 'Both static and final', 'A class which is implementing an interface must implement all the methods of the interface.', 'A finally block is executed, only after the catch block is executed.', ' Both Option1 and Option2', '', '', '', '', ''),
('akshay', '785', 'iyoi', 'gsd', 'gdg', '30-11-2021', '3', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', '', ''),
('vineeth', '455', 'B', 'ajsjsh', '869968', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', '', ''),
('akshay', 'kumar', 'ajhv', 'jhvkjh', '38936', '30-11-2021', '50', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('vineeth', 'iit2020155', 'uiywe', 'jwkqvc', 'fwejkbf', '30-11-2021', '44', 'A private member of a class cannot be accessed by the methods of the same class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('akshay', 'iit2020155', 'sec', 'emai', 'phon', '30-11-2021', '0', 'A private member of a class cannot be accessed by the methods of the same class.', '', '', '', '', '', '', '', '', '', ''),
('jhc', 'kjgkb', 'kjbk b', 'vjv', 'mvmnn', '30-11-2021', '0', 'A private member of a class cannot be accessed from its derived class. ', '', '', '', '', '', '', '', '', '', ''),
('kjv', 'nkhu ku', 'hvjkhv', 'j jh', 'hvjh ', '30-11-2021', '55', 'A protected member of a class can be accessed from its derived class.', 'abstract', '', '', '', '', 'int -4', 'int var;', '', 'a subclass of the same package', ''),
('aksjss', ',ebf', 'efjb a', 'efkj ', 'cbjkeb', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', '', '', '', '', '', '', '', '', ''),
('akjshau', 'skjcb', 'sadvn', 'sdva', 'dsv', '30-11-2021', '0', 'A public member of a class can be accessed in all the packages.', 'abstract', '', '', '', '', '', '', '', '', ''),
('AAA', '11', 'C', 'BBNNMM', '8877', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('AA', '99', 'B', 'IIUOO', '99877', '30-11-2021', '0', 'A private member of a class cannot be accessed by the methods of the same class.', 'final', 'private ', 'An interface can implement another interface.', '', '', '', '', '', '', ''),
('kjszg', 'sjbc', 'sbc', 'scmb,', 'ascban', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', '', '', '', '', '', '', '', '', ''),
('jhv', 'mhvlhvj,lyvh', 'hvljh', 'vjhv', 'gcuyc', '30-11-2021', '0', '', 'abstract', '', '', '', '', '', '', '', '', ''),
('cmb', 'adjB KJ xabjdk kkd ', 'dsdbkdasj', 'dasbjkadkjd', 'daasd', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', '', '', '', '', '', '', '', ''),
(',sbca', 'sc,ab', 'sm,c b', 'sc ,m', 's,mc, ', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', '', '', '', '', '', '', ''),
('akshay', 'ksks', 'adbk', 'adm ', 'abxkjacb', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', '', '', '', '', '', ''),
('akshsy', 'sfcaf', 'safaf', 'safsf', 'afasf', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', '', '', '', '', '', '', '', '', ''),
('akshay', '89362', 'section B', 'akshayasfhkasf', 'asifha', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', '', ''),
('kbkl', ',b,j', 'kjvbkj', 'jmbjk', 'jbvkjbv', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', '', ''),
('akshay', 'skfbalksfb;alifa', 'sabfclak/f', 'asfjbaflkj', 'asfna f.k', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('adfasf', 'afsaf', 'asfk,', 'asfk', 'afs,m', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', '', '', '', '', '', ''),
('sfklasf', 'afslkn', 'flakfbla', 'sf,msf blak', 'af,bflkabksk', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'const', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', '', '', '', '', '', '', ''),
('yf', 'kjvjkvj', 'h', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', '', '', '', '', '', '', '', ''),
('jvlou', 'hbch', 'hjvic', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', '', '', '', '', '', '', ''),
('kj', 'qwertyuiugfgh', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('mm', '546wd453d3', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', '', '', '', '', '', ''),
('akshay', 'wdawfafas', 'vzvsav', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('kj', 'dfgtfc jmkl,;l', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('sffs', 'sfasf', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', '', '', '', '', ''),
('ff', 'fsdfsdf', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', '', '', '', '', ''),
('gh', 'vhmmm', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', '', '', '', '', '', '', '', ''),
('akgd', 'dwmbd', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('wqkr', 'rrr', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', '', '', '', '', '', '', '', ''),
('kjbs', '11332', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', '', '', '', '', '', '', '', '', '', ''),
('mvcmh', 'asxcvfvhj', '', '', '', '30-11-2021', '0', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', '', '', '', '', '', '', '', ''),
('aafw', 'afsf', '', '', '', '30-11-2021', '44', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('akshay', '248648269824', '', '', '', '30-11-2021', '30', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', '', '', ''),
('akshay', 'iit2020155taksh', 'adj', '', '', '30-11-2021', '44', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('ajKDVKD', 'DJBDKJD', '', '', '', '30-11-2021', '30', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', '', '', ''),
('akshay', '828282', 'b', '', '', '30-11-2021', '44', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', 'All of the above', 'a subclass of the same package', ''),
('ajkdg', 'dDA', 'DD', 'DD', 'CC', '30-11-2021', '25', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', '', '', '', ''),
('VINEET', '149', 'B', 'IIT2020149@IIITA.AC.IN', '8897947042', '30-11-2021', '33', 'A public member of a class can be accessed in all the packages.', 'abstract', 'protected', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int 1_var;', 'All of the above', 'a subclass of the same package', ''),
('akshay', 'yt63829', 'asjk', 'akshay', 'e222', '30-11-2021', '30', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -5.0', 'int var;', '', '', 'Pass'),
('aaajkf', 'das', '', '', '', '30-11-2021', '0', '', '', '', '', '', '', '', '', '', '', ''),
('akshy', 'iit2020255', 'B', 'akshaytelu@gm,ail', 'wfq', '30-11-2021', '12', 'A protected member of a class can be accessed from its derived class.', 'abstract', 'Both static and final', 'An interface is a solution for multiple inheritance in java.', '', '', '', '', '', '', 'Fail'),
('sairam', '120', 'b', 'sairam@mail.com', '9988765432', '01-12-2021', '11', 'A public member of a class can be accessed in all the packages.', 'const', 'Both static and final', 'An interface can implement another interface.', ' A finally block is executed, only if an exception occurs.', ' Both Option1 and Option2', 'double -4.5', '', '', '', 'Fail');

-- --------------------------------------------------------

--
-- Table structure for table `student_details`
--

DROP TABLE IF EXISTS `student_details`;
CREATE TABLE IF NOT EXISTS `student_details` (
  `name` varchar(100) NOT NULL,
  `rollno` varchar(100) NOT NULL,
  `section` varchar(100) NOT NULL,
  `emailid` varchar(100) NOT NULL,
  `phoneno` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `marks` varchar(10) NOT NULL,
  `verdict` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
