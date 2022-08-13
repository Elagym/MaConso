package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.model.Restriction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by Vince on 11-06-22.
 */
@Mapper(uses = WalletMapper.class)
public interface RestrictionMapper {

    RestrictionMapper INSTANCE = Mappers.getMapper(RestrictionMapper.class);

    RestrictionDTO map(Restriction restriction);

    Restriction map(RestrictionDTO dto);
}
