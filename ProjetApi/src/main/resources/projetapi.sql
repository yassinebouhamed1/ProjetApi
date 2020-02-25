CREATE TABLE IF NOT EXISTS `category` (
  `id_category` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `enabled` int(11) NOT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `parent_category_id_category` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id_category`),
  KEY `FKps2shilwbs1l59our5fa8fu79` (`parent_category_id_category`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `category` (`id_category`, `created_at`, `description`, `enabled`, `logo`, `name`, `updated_at`, `parent_category_id_category`) VALUES
(1, NULL, 'azerty', 2, NULL, 'cat', NULL, NULL),
(2, '2020-02-06 00:00:00', 'desc2', 2, 'logo2', 'aaaaa', '2020-02-13 00:00:00', 1),
(3, '2020-02-03 00:00:00', 'desc3', 3, 'logo3', 'name3', '2020-02-13 00:00:00', 1),
(4, '2020-02-29 00:00:00', 'desc4', 4, 'logo4', 'name4', '2020-02-23 00:00:00', 2),
(5, '2020-01-21 00:00:00', 'desc5', 1, 'logo5', 'name5', '2020-02-23 00:00:00', 2);



CREATE TABLE IF NOT EXISTS `workflow` (
  `id_workflow` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `enabled` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_workflow`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `workflow` (`id_workflow`, `description`, `enabled`, `name`) VALUES
(2, 'desc2', 2, 'abc'),
(3, 'desc3', 1, 'name3'),
(1, 'desc1', 2, 'abc'),
(4, 'desc4', 2, 'name4'),
(5, 'desc5', 5, 'name5');



CREATE TABLE IF NOT EXISTS `workflows` (
  `workflow_id_workflow` bigint(20) NOT NULL,
  `wf_id_workflow` bigint(20) NOT NULL,
  KEY `FKh2blq6hurrsirxp0i0pmk5ewj` (`wf_id_workflow`),
  KEY `FKesf6nxxv4w1pscxlqx3gms6v3` (`workflow_id_workflow`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `workflows` (`workflow_id_workflow`, `wf_id_workflow`) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 3);


CREATE TABLE IF NOT EXISTS `workflow_category` (
  `workflow_id_workflow` bigint(20) NOT NULL,
  `category_id_category` bigint(20) NOT NULL,
  KEY `FKjqgola7m9331kkcg7is2hbxwt` (`category_id_category`),
  KEY `FKexhhtj1un4wuwhvaylow1d0c0` (`workflow_id_workflow`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `workflow_category` (`workflow_id_workflow`, `category_id_category`) VALUES
(1, 1),
(2, 1),
(3, 1),
(2, 2),
(4, 2);
COMMIT;