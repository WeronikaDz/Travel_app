-- Wstawienie przykładowych danych dla tabeli Continent
INSERT INTO continent (id, continent_name) VALUES (1, 'Europe');
INSERT INTO continent (id, continent_name) VALUES (2, 'North America');
INSERT INTO continent (id, continent_name) VALUES (3, 'South America');
INSERT INTO continent (id, continent_name) VALUES (4, 'Africa');
-- Wstawienie przykładowych danych dla tabeli Country
INSERT INTO country (id, country_name, continent_id) VALUES (1, 'Poland', 1);
INSERT INTO country (id, country_name, continent_id) VALUES (2, 'Germany', 1);
INSERT INTO country (id, country_name, continent_id) VALUES (3, 'United States', 2);
INSERT INTO country (id, country_name, continent_id) VALUES (4, 'Brazil', 3);
INSERT INTO country (id, country_name, continent_id) VALUES (5, 'Egypt', 4);
-- Wstawienie przykładowych danych dla tabeli City
INSERT INTO city (id, city_name, country_id) VALUES (1, 'Warsaw', 1);
INSERT INTO city (id, city_name, country_id) VALUES (2, 'Berlin', 2);
INSERT INTO city (id, city_name, country_id) VALUES (3, 'New York City', 3);
INSERT INTO city (id, city_name, country_id) VALUES (4, 'Rio de Janeiro', 4);
INSERT INTO city (id, city_name, country_id) VALUES (5, 'Cairo', 5);

-- Wstawienie przykładowych danych dla tabeli Airport
INSERT INTO airport (id, airport_name, city_id) VALUES (1, 'Chopin Airport', 1);
INSERT INTO airport (id, airport_name, city_id) VALUES (2, 'Tegel Airport', 2);
INSERT INTO airport (id, airport_name, city_id) VALUES (3, 'JFK Airport', 3);
INSERT INTO airport (id, airport_name, city_id) VALUES (4, 'Galeão Airport', 4);
INSERT INTO airport (id, airport_name, city_id) VALUES (5, 'Cairo International Airport', 5);

-- Wstawienie przykładowych danych dla tabeli Hotel
INSERT INTO hotel (id, hotel_name, standard_in_stars, hotel_description, city_id) VALUES (1, 'Hotel Bristol', 5, 'Luxurious hotel in the heart of Warsaw', 1);
INSERT INTO hotel (id, hotel_name, standard_in_stars, hotel_description, city_id) VALUES (2, 'Grand Hotel', 4, 'Elegant hotel in Berlin city center', 2);
INSERT INTO hotel (id, hotel_name, standard_in_stars, hotel_description, city_id) VALUES (3, 'Marriott Marquis', 5, 'Luxury hotel near Times Square', 3);
INSERT INTO hotel (id, hotel_name, standard_in_stars, hotel_description, city_id) VALUES (4, 'Copacabana Palace', 5, 'Iconic hotel overlooking Copacabana Beach', 4);
INSERT INTO hotel (id, hotel_name, standard_in_stars, hotel_description, city_id) VALUES (5, 'Four Seasons Hotel Cairo', 5, 'Luxurious hotel with views of the Nile', 5);

-- Wstawienie przykładowych danych dla tabeli Traveler
INSERT INTO traveler (id, traveler_first_name, traveler_last_name, age) VALUES (1, 'John', 'Doe', 30);
INSERT INTO traveler (id, traveler_first_name, traveler_last_name, age) VALUES (2, 'Jane', 'Smith', 25);
INSERT INTO traveler (id, traveler_first_name, traveler_last_name, age) VALUES (3, 'Michael', 'Brown', 40);
INSERT INTO traveler (id, traveler_first_name, traveler_last_name, age) VALUES (4, 'Emily', 'Johnson', 35);
-- Wstawienie przykładowych danych dla tabeli TripPurchase
INSERT INTO trip_purchase (id, trip_id, traveler_id, trip_price) VALUES (1, 1, 1, 1200.00);
INSERT INTO trip_purchase (id, trip_id, traveler_id, trip_price) VALUES (2, 2, 2, 1800.00);
INSERT INTO trip_purchase (id, trip_id, traveler_id, trip_price) VALUES (3, 3, 3, 2500.00);
INSERT INTO trip_purchase (id, trip_id, traveler_id, trip_price) VALUES (4, 4, 4, 3500.00);

-- Wstawienie przykładowych danych dla tabeli Trip
INSERT INTO trip (id, city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids) VALUES
                                                                                                                                                                                                                                                                                                  (1, 1, 1, 1, 2, 2, 3, 3, 3, '2024-05-10', '2024-05-17', 7, 'BB', 1200.00, 600.00, TRUE, 50, 20),
                                                                                                                                                                                                                                                                                                  (2, 2, 2, 2, 1, 1, 4, 4, 4, '2024-06-15', '2024-06-25', 10, 'HB', 1800.00, 900.00, FALSE, 40, 15),
                                                                                                                                                                                                                                                                                                  (3, 3, 3, 3, 4, 4, 2, 2, 2, '2024-07-20', '2024-07-30', 10, 'FB', 2500.00, 1200.00, TRUE, 60, 25),
                                                                                                                                                                                                                                                                                                  (4, 4, 4, 4, 3, 3, 5, 5, 5, '2024-08-05', '2024-08-15', 10, 'AI', 3500.00, 1800.00, FALSE, 70, 30);