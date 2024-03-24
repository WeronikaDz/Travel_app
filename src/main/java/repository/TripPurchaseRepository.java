package repository;

import entity.Continent;
import entity.TripPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripPurchaseRepository extends JpaRepository<TripPurchase, Long> {
}
