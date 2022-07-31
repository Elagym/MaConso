package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.RestrictionDTO;
import be.verbeet.maconso.model.Restriction;

/**
 * Created by Vince on 11-06-22.
 */
public final class RestrictionMapper {

    public static RestrictionDTO map(Restriction restriction) {
        RestrictionDTO dto = new RestrictionDTO();
        dto.setId(restriction.getId());

        return dto;
    }

    public static Restriction map(RestrictionDTO dto) {
        Restriction restriction = new Restriction();
        restriction.setId(dto.getId());

        return restriction;
    }
}
