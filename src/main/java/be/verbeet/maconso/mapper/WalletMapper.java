package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.WalletDTO;
import be.verbeet.maconso.model.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Vince on 11-06-22.
 */
@Mapper
public interface WalletMapper {

    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    WalletDTO map(Wallet wallet);

    Wallet map(WalletDTO dto);
}
