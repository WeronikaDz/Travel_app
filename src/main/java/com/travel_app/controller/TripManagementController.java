package com.travel_app.controller;

import com.travel_app.dtos.TripDTO;
import com.travel_app.entity.Trip;
import com.travel_app.service.TripService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management")
public class TripManagementController {
    private final TripService tripService;
    public TripManagementController(TripService tripService) {
        this.tripService = tripService;
    }
    @GetMapping("/alltrips")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public List<TripDTO> showTrips() {
        return tripService.findAll();
    }

    @PostMapping("/addtrip")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void addTrip(@RequestBody Trip trip) {
        tripService.addTrip(trip);
    }

    @DeleteMapping("/deletetrips/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteTrip(@PathVariable Long id) {
        tripService.deleteTrip(id);
    }

    @PutMapping("/updatetrips")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void updateTrip(@PathVariable Integer id, @RequestBody Trip trip) {
        tripService.updateTrip(id, trip);
//        System.out.printf("%s %s", id, trip);
//    }
// todo zerknąć czy to ma sens i dlaczego postman rzuca się o tego longa/Integera.
//    @PutMapping("/updatetrips/{id}")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public ResponseEntity<String> updateTrip(@PathVariable Integer id, @RequestBody Map<String, Object> tripUpdates) {
//        if (!tripRepository.existsById(Long.valueOf(id))) {
//            return new ResponseEntity<>("Trip not found", HttpStatus.NOT_FOUND);
//        }
//        Trip trip = tripRepository.findById(Long.valueOf(id)).orElse(null);
//        if (trip == null) {
//            return new ResponseEntity<>("Trip not found", HttpStatus.NOT_FOUND);
//        }
//
//        tripUpdates.forEach((key, value) -> {
//            switch (key) {
//                case "city":
//                    Map<String, Object> cityMap = (Map<String, Object>) value;
//                    City city = new City();
//                    city.setId((Long) cityMap.get("id"));
//                    trip.setCity(city);
//                    break;
//                case "airport":
//                    Map<String, Object> airportMap = (Map<String, Object>) value;
//                    Airport airport = new Airport();
//                    airport.setId((Long) airportMap.get("id"));
//                    trip.setAirport(airport);
//                    break;
//                case "hotel":
//                    Map<String, Object> hotelMap = (Map<String, Object>) value;
//                    Hotel hotel = new Hotel();
//                    hotel.setId((Long) hotelMap.get("id"));
//                    trip.setHotel(hotel);
//                    break;
//                case "cityFrom":
//                    Map<String, Object> cityFromMap = (Map<String, Object>) value;
//                    City cityFrom = new City();
//                    cityFrom.setId((Long) cityFromMap.get("id"));
//                    trip.setCityFrom(cityFrom);
//                    break;
//                case "airportFrom":
//                    Map<String, Object> airportFromMap = (Map<String, Object>) value;
//                    Airport airportFrom = new Airport();
//                    airportFrom.setId((Long) airportFromMap.get("id"));
//                    trip.setAirportFrom(airportFrom);
//                    break;
//                case "cityTo":
//                    Map<String, Object> cityToMap = (Map<String, Object>) value;
//                    City cityTo = new City();
//                    cityTo.setId((Long) cityToMap.get("id"));
//                    trip.setCityTo(cityTo);
//                    break;
//                case "airportTo":
//                    Map<String, Object> airportToMap = (Map<String, Object>) value;
//                    Airport airportTo = new Airport();
//                    airportTo.setId((Long) airportToMap.get("id"));
//                    trip.setAirportTo(airportTo);
//                    break;
//                case "hotelTo":
//                    Map<String, Object> hotelToMap = (Map<String, Object>) value;
//                    Hotel hotelTo = new Hotel();
//                    hotelTo.setId((Long) hotelToMap.get("id"));
//                    trip.setHotelTo(hotelTo);
//                    break;
//                case "departureDate":
//                    trip.setDepartureDate(new Date((String) value));
//                    break;
//                case "returnDate":
//                    trip.setReturnDate(new Date((String) value));
//                    break;
//                case "tripDurationInDays":
//                    trip.setTripDurationInDays((int) value);
//                    break;
//                case "tripType":
//                    trip.setTripType(TripType.valueOf((String) value));
//                    break;
//                case "priceForAdult":
//                    trip.setPriceForAdult(new BigDecimal((String) value));
//                    break;
//                case "priceForKid":
//                    trip.setPriceForKid(new BigDecimal((String) value));
//                    break;
//                case "isPromoted":
//                    trip.setPromoted((boolean) value);
//                    break;
//                case "numberOfSpotsForAdults":
//                    trip.setNumberOfSpotsForAdults((int) value);
//                    break;
//                case "numberOfSpotsForKids":
//                    trip.setNumberOfSpotsForKids((int) value);
//                    break;
//                default:
//                    // Ignore unknown fields or implement specific logic for them
//            }
//        });
//
//        // Save the updated trip
//        tripRepository.save(trip);
//
//        return new ResponseEntity<>("Trip updated successfully", HttpStatus.OK);
//    }
    }
}


