-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2023 a las 19:10:42
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `apirest2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(120) DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `product`
--

INSERT INTO `product` (`id`, `name`, `price`) VALUES
(3, 'tortillita5', 150),
(5, 'Liqueur Banana, Ramazzotti', 78.08),
(6, 'Muffin Batt - Carrot Spice', 89.94),
(7, 'Wine - Jackson Triggs Okonagan', 76.11),
(8, 'Sprouts - Brussel', 73.45),
(9, 'Garlic - Primerba, Paste', 24.59),
(10, 'Soup Campbells', 54.36),
(11, 'Cheese - St. Andre', 31.79),
(12, 'cambio_categories', 550),
(13, 'Coffee Cup 12oz 5342cd', 93.63),
(14, 'Veal - Inside - New', 550),
(15, 'Beef - Roasted, Cooked', 50.88),
(16, 'Octopus', 6.23),
(17, 'Juice - Pineapple, 48 Oz', 82.85),
(18, 'Veal - Inside', 86.73),
(19, 'Beef - Rouladin, Sliced', 46.27),
(20, 'Monkfish Fresh - Skin Off', 15.87),
(21, 'Wine - Delicato Merlot', 88.2),
(22, 'Cherries - Frozen', 71.29),
(23, 'Lamb Rack - Ontario', 87.13),
(24, 'Sugar - Splenda Sweetener', 96.07),
(25, 'Amarula Cream', 15.09),
(26, 'Chicken Breast Wing On', 32.67),
(27, 'Whmis Spray Bottle Graduated', 94.47),
(28, 'Beef - Striploin Aa', 3.09),
(29, 'Wine - Beaujolais Villages', 47.62),
(30, 'Tea - Black Currant', 12.31),
(31, 'Rabbit - Legs', 32.43),
(32, 'tortillita', 450),
(33, 'Capon - Breast, Wing On', 46.37),
(34, 'Muffin Mix - Morning Glory', 95.33),
(35, 'Polloas', 10),
(36, 'Polloasw', 15),
(200, 'Pollo', 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
