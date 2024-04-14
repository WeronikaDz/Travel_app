-- tworzenie tabeli airport

CREATE TABLE `airport`
(
    `city_id`      bigint       DEFAULT NULL,
    `id`           bigint NOT NULL AUTO_INCREMENT,
    `airport_name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY            `FKf583ieaw0ttnwklqy222tfru0` (`city_id`),
    CONSTRAINT `FKf583ieaw0ttnwklqy222tfru0` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli city

CREATE TABLE `city`
(
    `country_id` bigint       DEFAULT NULL,
    `id`         bigint NOT NULL AUTO_INCREMENT,
    `city_name`  varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY          `FKrpd7j1p7yxr784adkx4pyepba` (`country_id`),
    CONSTRAINT `FKrpd7j1p7yxr784adkx4pyepba` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli continent

CREATE TABLE `continent`
(
    `id`             bigint NOT NULL AUTO_INCREMENT,
    `continent_name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli country

CREATE TABLE `country`
(
    `continent_id` bigint       DEFAULT NULL,
    `id`           bigint NOT NULL AUTO_INCREMENT,
    `country_name` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY            `FKpymfsgrl32dy3gtl9r7rykkjg` (`continent_id`),
    CONSTRAINT `FKpymfsgrl32dy3gtl9r7rykkjg` FOREIGN KEY (`continent_id`) REFERENCES `continent` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli hotel

CREATE TABLE `hotel`
(
    `standard_in_stars` int          DEFAULT NULL,
    `city_id`           bigint       DEFAULT NULL,
    `id`                bigint NOT NULL AUTO_INCREMENT,
    `hotel_description` varchar(255) DEFAULT NULL,
    `hotel_name`        varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY                 `FKf1iabdv6bi2yohh9h48wce42x` (`city_id`),
    CONSTRAINT `FKf1iabdv6bi2yohh9h48wce42x` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli traveler

CREATE TABLE `traveler`
(
    `age`                 int          DEFAULT NULL,
    `id`                  bigint NOT NULL AUTO_INCREMENT,
    `traveler_first_name` varchar(255) DEFAULT NULL,
    `traveler_last_name`  varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli trip

CREATE TABLE `trip`
(
    `is_promoted`                bit(1)                     DEFAULT NULL,
    `number_of_spots_for_adults` int                        DEFAULT NULL,
    `number_of_spots_for_kids`   int                        DEFAULT NULL,
    `price_for_adult`            decimal(38, 2)             DEFAULT NULL,
    `price_for_kid`              decimal(38, 2)             DEFAULT NULL,
    `trip_duration_in_days`      int                        DEFAULT NULL,
    `airport_from_id`            bigint                     DEFAULT NULL,
    `airport_id`                 bigint                     DEFAULT NULL,
    `airport_to_id`              bigint                     DEFAULT NULL,
    `city_from_id`               bigint                     DEFAULT NULL,
    `city_id`                    bigint                     DEFAULT NULL,
    `city_to_id`                 bigint                     DEFAULT NULL,
    `departure_date`             datetime(6)                DEFAULT NULL,
    `hotel_id`                   bigint                     DEFAULT NULL,
    `hotel_to_id`                bigint                     DEFAULT NULL,
    `id`                         bigint NOT NULL AUTO_INCREMENT,
    `return_date`                datetime(6)                DEFAULT NULL,
    `trip_type`                  enum ('BB','HB','FB','AI') DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- tworzenie tabeli trip_purchase

CREATE TABLE `trip_purchase`
(
    `trip_price`  decimal(38, 2) DEFAULT NULL,
    `id`          bigint NOT NULL AUTO_INCREMENT,
    `traveler_id` bigint         DEFAULT NULL,
    `trip_id`     bigint         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;