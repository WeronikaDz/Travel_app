INSERT INTO continent (continent_name) VALUES ('Europe');
INSERT INTO continent (continent_name) VALUES ('North America');
INSERT INTO continent (continent_name) VALUES ('South America');
INSERT INTO continent (continent_name) VALUES ('Africa');
INSERT INTO continent (continent_name) VALUES ('Asia');
INSERT INTO continent (continent_name) VALUES ('Australia');
INSERT INTO continent (continent_name) VALUES ('Antarctica');
INSERT INTO continent (continent_name) VALUES ('Arctic');
INSERT INTO continent (continent_name) VALUES ('Oceania');
INSERT INTO continent (continent_name) VALUES ('Atlantis');
INSERT INTO continent (continent_name) VALUES ('Lemuria');
INSERT INTO continent (continent_name) VALUES ('Mu');
INSERT INTO continent (continent_name) VALUES ('Gondwana');
INSERT INTO continent (continent_name) VALUES ('Pangaea');
INSERT INTO continent (continent_name) VALUES ('Laurasia');
INSERT INTO continent (continent_name) VALUES ('Rodinia');
INSERT INTO continent (continent_name) VALUES ('Pannotia');
INSERT INTO continent (continent_name) VALUES ('Columbia');
INSERT INTO continent (continent_name) VALUES ('Kenorland');

INSERT INTO country (country_name, continent_id) VALUES ('Poland', 1);
INSERT INTO country (country_name, continent_id) VALUES ('Germany', 1);
INSERT INTO country (country_name, continent_id) VALUES ('United States', 2);
INSERT INTO country (country_name, continent_id) VALUES ('Brazil', 3);
INSERT INTO country (country_name, continent_id) VALUES ('Egypt', 4);
INSERT INTO country (country_name, continent_id) VALUES ('Canada', 2);
INSERT INTO country (country_name, continent_id) VALUES ('Australia', 6);
INSERT INTO country (country_name, continent_id) VALUES ('China', 5);
INSERT INTO country (country_name, continent_id) VALUES ('India', 5);
INSERT INTO country (country_name, continent_id) VALUES ('Russia', 1);
INSERT INTO country (country_name, continent_id) VALUES ('South Africa', 4);
INSERT INTO country (country_name, continent_id) VALUES ('Argentina', 3);
INSERT INTO country (country_name, continent_id) VALUES ('France', 1);
INSERT INTO country (country_name, continent_id) VALUES ('Spain', 1);
INSERT INTO country (country_name, continent_id) VALUES ('Italy', 1);
INSERT INTO country (country_name, continent_id) VALUES ('Japan', 5);
INSERT INTO country (country_name, continent_id) VALUES ('Mexico', 2);
INSERT INTO country (country_name, continent_id) VALUES ('Chile', 3);
INSERT INTO country (country_name, continent_id) VALUES ('Nigeria', 4);
INSERT INTO country (country_name, continent_id) VALUES ('Saudi Arabia', 5);

INSERT INTO city (city_name, country_id) VALUES ('Warsaw', 1);
INSERT INTO city (city_name, country_id) VALUES ('Berlin', 2);
INSERT INTO city (city_name, country_id) VALUES ('New York City', 3);
INSERT INTO city (city_name, country_id) VALUES ('Rio de Janeiro', 4);
INSERT INTO city (city_name, country_id) VALUES ('Cairo', 5);
INSERT INTO city (city_name, country_id) VALUES ('Toronto', 6);
INSERT INTO city (city_name, country_id) VALUES ('Sydney', 7);
INSERT INTO city (city_name, country_id) VALUES ('Beijing', 8);
INSERT INTO city (city_name, country_id) VALUES ('Mumbai', 9);
INSERT INTO city (city_name, country_id) VALUES ('Moscow', 10);
INSERT INTO city (city_name, country_id) VALUES ('Cape Town', 11);
INSERT INTO city (city_name, country_id) VALUES ('Buenos Aires', 12);
INSERT INTO city (city_name, country_id) VALUES ('Paris', 13);
INSERT INTO city (city_name, country_id) VALUES ('Madrid', 14);
INSERT INTO city (city_name, country_id) VALUES ('Rome', 15);
INSERT INTO city (city_name, country_id) VALUES ('Tokyo', 16);
INSERT INTO city (city_name, country_id) VALUES ('Mexico City', 17);
INSERT INTO city (city_name, country_id) VALUES ('Santiago', 18);
INSERT INTO city (city_name, country_id) VALUES ('Lagos', 19);
INSERT INTO city (city_name, country_id) VALUES ('Riyadh', 20);

INSERT INTO airport (airport_name, city_id) VALUES ('Chopin Airport', 1);
INSERT INTO airport (airport_name, city_id) VALUES ('Tegel Airport', 2);
INSERT INTO airport (airport_name, city_id) VALUES ('JFK Airport', 3);
INSERT INTO airport (airport_name, city_id) VALUES ('Galeão Airport', 4);
INSERT INTO airport (airport_name, city_id) VALUES ('Cairo International Airport', 5);
INSERT INTO airport (airport_name, city_id) VALUES ('Toronto Pearson Airport', 6);
INSERT INTO airport (airport_name, city_id) VALUES ('Sydney Airport', 7);
INSERT INTO airport (airport_name, city_id) VALUES ('Beijing Capital International Airport', 8);
INSERT INTO airport (airport_name, city_id) VALUES ('Chhatrapati Shivaji Maharaj International Airport', 9);
INSERT INTO airport (airport_name, city_id) VALUES ('Sheremetyevo International Airport', 10);
INSERT INTO airport (airport_name, city_id) VALUES ('Cape Town International Airport', 11);


INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Hotel Bristol', 5, 'Luxurious hotel in the heart of Warsaw', 1);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Grand Hotel', 4, 'Elegant hotel in Berlin city center', 2);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Marriott Marquis', 1, 'Luxury hotel near Times Square', 3);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Copacabana Palace', 5, 'Iconic hotel overlooking Copacabana Beach', 4);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Four Seasons Hotel Cairo', 5, 'Luxurious hotel with views of the Nile', 5);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Fairmont Royal York', 4, 'Historic luxury hotel in Toronto', 6);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Sydney Harbour Marriott Hotel', 5, 'Luxury hotel overlooking Sydney Harbour', 7);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Great Wall Hotel Beijing', 5, 'Luxury hotel near the Great Wall of China', 8);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The St. Regis Mumbai', 5, 'Luxury hotel in Mumbais business district', 9);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Radisson Collection Hotel, Moscow', 5, 'Luxury hotel in the heart of Moscow', 10);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Table Bay Hotel', 5, 'Luxury hotel overlooking Table Mountain', 11);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Alvear Palace Hotel', 5, 'Luxury hotel in Buenos Airess Recoleta district', 12);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Ritz Paris', 5, 'Iconic luxury hotel in Paris', 13);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Hotel Riu Plaza España', 4, 'Luxury hotel near the Royal Palace of Madrid', 14);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Westin Excelsior, Rome', 5, 'Luxury hotel on Romes Via Veneto', 15);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Hotel Chinzanso Tokyo', 5, 'Luxury hotel with beautiful gardens in Tokyo', 16);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Four Seasons Hotel Mexico City', 5, 'Luxury hotel in Mexico Citys Polanco district', 17);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Ritz-Carlton, Santiago', 5, 'Luxury hotel in the heart of Santiago', 18);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('The Federal Palace Hotel', 4, 'Luxury hotel in Lagos, Nigeria', 19);
INSERT INTO hotel (hotel_name, standard_in_stars, hotel_description, city_id) VALUES ('Ritz-Carlton Riyadh', 5, 'Luxury hotel in Riyadh, Saudi Arabia', 20);

INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Alice', 'Johnson', 28);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Robert', 'Williams', 35);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Sophia', 'Brown', 40);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('William', 'Jones', 32);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Olivia', 'Davis', 27);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('James', 'Miller', 45);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Evelyn', 'Wilson', 29);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Alexander', 'Taylor', 38);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Charlotte', 'Anderson', 31);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Daniel', 'Thomas', 33);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Amelia', 'Jackson', 36);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Mia', 'White', 30);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Benjamin', 'Harris', 39);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Ava', 'Martinez', 26);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Logan', 'Nelson', 34);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Emma', 'Thompson', 29);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Elijah', 'Moore', 37);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Harper', 'Roberts', 28);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Liam', 'Clark', 31);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Abigail', 'Hill', 35);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Mason', 'Mitchell', 33);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Emily', 'Perez', 27);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Jacob', 'Walker', 40);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Elizabeth', 'Young', 28);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Michael', 'Evans', 42);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Sofia', 'Lee', 25);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Matthew', 'Hernandez', 36);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Grace', 'King', 29);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Lucas', 'Adams', 34);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Avery', 'Scott', 30);
INSERT INTO traveler (traveler_first_name, traveler_last_name, age) VALUES ('Ella', 'Green', 32);


INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (1, 1, 1200.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (2, 2, 1800.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (3, 3, 2500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (4, 4, 3500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (1, 5, 1200.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (2, 6, 1800.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (3, 7, 2500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (4, 8, 3500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (1, 9, 1200.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (2, 10, 1800.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (3, 11, 2500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (4, 12, 3500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (1, 13, 1200.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (2, 14, 1800.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (3, 15, 2500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (4, 16, 3500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (1, 17, 1200.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (2, 18, 1800.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (3, 19, 2500.00);
INSERT INTO trip_purchase (trip_id, traveler_id, trip_price) VALUES (4, 20, 3500.00);


INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (2, 2, 2, 1, 1, 4, 4, 4, '2024-06-15', '2024-06-25', 10, 'HB', 1800.00, 900.00, FALSE, 40, 15);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (3, 3, 3, 4, 4, 2, 2, 2, '2024-07-23', '2024-07-30', 7, 'FB', 2500.00, 1200.00, TRUE, 60, 25);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (4, 4, 4, 3, 3, 5, 5, 5, '2024-08-05', '2024-08-15', 10, 'AI', 3500.00, 1800.00, FALSE, 70, 30);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (5, 5, 5, 1, 1, 2, 2, 2, '2024-08-28', '2024-08-30', 2, 'BB', 1500.00, 750.00, TRUE, 60, 20);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (6, 6, 6, 3, 3, 4, 4, 4, '2024-09-19', '2024-09-20', 1, 'HB', 2000.00, 1000.00, FALSE, 50, 25);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (7, 7, 7, 2, 2, 5, 5, 5, '2024-10-05', '2024-10-15', 10, 'AI', 3000.00, 1500.00, TRUE, 70, 30);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (8, 8, 8, 4, 4, 3, 3, 3, '2024-11-10', '2024-11-20', 10, 'FB', 2500.00, 1200.00, FALSE, 60, 25);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (9, 9, 9, 5, 5, 1, 1, 1, '2024-12-10', '2024-12-15', 5, 'AI', 3500.00, 1800.00, TRUE, 80, 35);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (10, 10, 10, 3, 3, 2, 2, 2, '2025-01-12', '2025-01-20', 8, 'BB', 1200.00, 600.00, FALSE, 50, 20);
INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids)
VALUES (11, 11, 11, 1, 1, 4, 4, 4, '2025-02-16', '2025-02-25', 9, 'HB', 1800.00, 900.00, TRUE, 40, 15);