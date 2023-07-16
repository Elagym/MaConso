package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.entity.Wallet;
import org.mapstruct.Mapper;

/**
 * Created by Vince on 11-06-22.
 */
@Mapper(componentModel = "spring")
public interface WalletMapper {

    WalletDTO map(Wallet wallet);

    Wallet map(WalletDTO dto);
}
