package library_manager.service.offer;

import library_manager.model.Offer;
import library_manager.model.User;
import library_manager.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class OfferService implements IOfferService {
    @Autowired
    private OfferRepository offerRepository;

    @Override
    public List<Offer> findAll() {
        return offerRepository.findAll();
    }

    @Override
    public Offer findById(long id) {
        return null;
    }

    @Override
    public Offer update(long id, Offer offer) {
        return null;
    }

    @Override
    public boolean remove(long id) {
        return false;
    }

    @Override
    public Offer save(Offer offer) {
        return offerRepository.save(offer);
    }
}
