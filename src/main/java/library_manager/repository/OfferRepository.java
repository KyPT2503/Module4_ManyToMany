package library_manager.repository;

import library_manager.model.Offer;
import library_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
