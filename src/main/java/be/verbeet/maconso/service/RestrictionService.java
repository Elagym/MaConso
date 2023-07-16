package be.verbeet.maconso.service;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.entity.Restriction;

import java.util.List;

/**
 * Created by Vince on 01-08-22.
 */
public interface RestrictionService {

    List<Restriction> findAllByWallet(Long walletId);

    Restriction createRestriction(RestrictionDTO dto);

    Restriction updateRestriction(RestrictionDTO dto);

    void deleteRestriction(Long id);
}
