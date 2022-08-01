package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.model.Restriction;
import be.verbeet.maconso.repository.RestrictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Vince on 01-08-22.
 */
@Component
public class RestrictionServiceImpl implements RestrictionService {

    @Autowired
    private RestrictionRepository restrictionRepo;

    @Override
    public List<Restriction> findAllByWallet(Long walletId) {
        return null;
    }

    @Override
    public Restriction createRestriction(RestrictionDTO dto) {
        return null;
    }

    @Override
    public Restriction updateRestriction(RestrictionDTO dto) {
        return null;
    }

    @Override
    public void deleteRestriction(Long id) {
        restrictionRepo.deleteById(id);
    }
}
