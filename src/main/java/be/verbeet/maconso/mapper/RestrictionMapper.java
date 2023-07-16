package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.entity.Restriction;
import org.mapstruct.Mapper;

/**
 * Created by Vince on 11-06-22.
 */
@Mapper(componentModel = "spring", uses = WalletMapper.class)
public interface RestrictionMapper {

    RestrictionDTO map(Restriction restriction);

    Restriction map(RestrictionDTO dto);
}
