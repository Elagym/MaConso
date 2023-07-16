package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.entity.Restriction;
import be.verbeet.maconso.repository.RestrictionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vince on 01-08-22.
 */
@Service
@RequiredArgsConstructor
public class RestrictionServiceImpl implements RestrictionService {

    private final RestrictionRepository restrictionRepo;

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
