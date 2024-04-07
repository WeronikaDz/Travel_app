package com.travel_app.service;

import com.travel_app.entity.Trip;
import com.travel_app.entity.TripType;
import com.travel_app.repository.TripRepository;
import net.minidev.json.JSONValue;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.travel_app.entity.TripType.BB;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TripServiceTest {

    @Autowired
    private TripService tripService;
    @Autowired
    private TripRepository tripRepository;

    @Test
    void testFindTripsByAirportName() {
        String airportName = "Tegel Airport";
        List<Trip> trips = tripService.findTripsByAirportName(airportName);

        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByTripType() {
        TripType tripType = BB;
        List<Trip> trips = tripService.findTripsByType(tripType);

        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 2;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByDurationInDays() {
        int tripDurationInDays = 7;
        List<Trip> trips = tripService.findTripsByDurationInDays(tripDurationInDays);


        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByStandardInStars() {
        //given
        int standardInStars = 4;
        //when
        List<Trip> hotels = tripService.findTripsByStandardInStars(standardInStars);
        assertNotNull(hotels);
        //then
        int expectedNumberOfTrips = 2;
        assertEquals(expectedNumberOfTrips, hotels.size());
    }

    // todo w wolnej chwili napisać test
    @Test
    void testFindTripsByDepartureDate() {
//        LocalDate departureDate = LocalDate.parse("2024-06-15");

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        LocalDate departureDate = LocalDate.parse(("2024-06-15 00:00:00"));
        LocalDate departureDate = LocalDate.of(2024,06,15);

        List <Trip> trips = tripService.findTripsByDepartureDate(departureDate);
        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        System.out.println("Test wykonuje się poprawnie!");
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByReturnDate() {

        LocalDate returnDate = LocalDate.of(2024,06,25);

        List <Trip> trips = tripService.findTripsByReturnDate(returnDate);
        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByHotelName() {
        //given
        String hotelName = "Grand Hotel";
        //when
        List<Trip> hotels = tripService.findTripsByHotelName(hotelName);
        assertNotNull(hotels);

        //then
        int expectedNumberOfHotels = 1;
        assertEquals(expectedNumberOfHotels, hotels.size());
    }

// todo do poprawy
//  @Test
    void testSortByPriceForAdult() {
        try {
            // Połączenie z bazą danych H2
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", null);

            // Zapytanie SQL
            String sql = "SELECT * FROM trip ORDER BY price_for_adult DESC"; // Zastąp 'YourTableName' nazwą tabeli

            // Wykonanie zapytania i uzyskanie wyników
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Wyświetlenie rekordów
            while (rs.next()) {
                // Tutaj możesz dostosować sposób wyświetlania rekordów
                // Na przykład, jeśli chcesz wyświetlić konkretne kolumny, użyj odpowiednich metod get
                String record = rs.getString("price_for_adult"); // Zastąp 'columnName' nazwą kolumny
                System.out.println(record);
            }

            // Zamknięcie zasobów
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//        // Wstaw dane testowe do bazy danych
//        List<Trip> unsortedTrips = new ArrayList<>();
//        unsortedTrips.add(new Trip(4, 4, 4, 3, 3, 5, 5, 5, "2024-08-05", "2024-08-15", 10, "AI", 3500.00, 1800.00, false, 70, 30));
//
////                4L, 4L, 4L, 3L, 3L, 5L, 5L, 5L, "2024-08-05", "2024-08-15", 10, "AI", 3500.00, 1800.00, false, 70, 30));
////         (9, 9, 9, 5, 5, 1, 1, 1, '2024-12-10', '2024-12-15', 5, 'AI', 3500.00, 1800.00, TRUE, 80, 35);
////         (7, 7, 7, 2, 2, 5, 5, 5, '2024-10-05', '2024-10-15', 10, 'AI', 3000.00, 1500.00, TRUE, 70, 30);
////         (3, 3, 3, 4, 4, 2, 2, 2, '2024-07-23', '2024-07-30', 7, 'FB', 2500.00, 1200.00, TRUE, 60, 25);
////         (8, 8, 8, 4, 4, 3, 3, 3, '2024-11-10', '2024-11-20', 10, 'FB', 2500.00, 1200.00, FALSE, 60, 25);
////         (6, 6, 6, 3, 3, 4, 4, 4, '2024-09-19', '2024-09-20', 1, 'HB', 2000.00, 1000.00, FALSE, 50, 25);
////         (2, 2, 2, 1, 1, 4, 4, 4, '2024-06-15', '2024-06-25', 10, 'HB', 1800.00, 900.00, FALSE, 40, 15);
////         (11, 11, 11, 1, 1, 4, 4, 4, '2025-02-16', '2025-02-25', 9, 'HB', 1800.00, 900.00, TRUE, 40, 15);
////         (5, 5, 5, 1, 1, 2, 2, 2, '2024-08-28', '2024-08-30', 2, 'BB', 1500.00, 750.00, TRUE, 60, 20);
////         (10, 10, 10, 3, 3, 2, 2, 2, '2025-01-12', '2025-01-20', 8, 'BB', 1200.00, 600.00, FALSE, 50, 20);
//
        // Pobierz wycieczki z bazy danych


        // Posortuj wycieczki po cenie dla dorosłego przy użyciu serwisu
//        tripService.sortByPriceForAdult(trips);
//
//        // Sprawdź, czy wycieczki są posortowane poprawnie
//        assertEquals(new BigDecimal("1800.00"), trips.get(0).getPriceForAdult());
//        assertEquals(new BigDecimal("2500.00"), trips.get(1).getPriceForAdult());
//        assertEquals(new BigDecimal("3500.00"), trips.get(2).getPriceForAdult());
//    }

//    }
