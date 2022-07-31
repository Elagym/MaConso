package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.model.Restriction;
import be.verbeet.maconso.model.Wallet;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vince on 11-06-22.
 */
public final class WalletMapper {

    public static WalletDTO map(Wallet wallet) {
        WalletDTO dto = new WalletDTO();
        dto.setId(wallet.getId());
        dto.setLabel(wallet.getLabel());
        dto.setAmount(wallet.getAmount());
        List<RestrictionDTO> restrictions = new ArrayList<>();
        for (Restriction restriction : wallet.getRestrictions()) {
            restrictions.add(RestrictionMapper.map(restriction));
        }
        dto.setRestrictions(restrictions);

        return dto;
    }

    public static Wallet map(WalletDTO dto) {
        Wallet wallet = new Wallet();
        wallet.setLabel(dto.getLabel());
        wallet.setAmount(BigDecimal.ZERO);
        List<Restriction> restrictions = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(dto.getRestrictions())) {
            for (RestrictionDTO restriction : dto.getRestrictions()) {
                restrictions.add(RestrictionMapper.map(restriction));
            }
        }
        wallet.setRestrictions(restrictions);

        return wallet;
    }
}
