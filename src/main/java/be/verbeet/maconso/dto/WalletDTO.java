package be.verbeet.maconso.dto;

import lombok.Builder;
import lombok.Value;

/**
 * Created by Vince on 11-06-22.
 */
@Value
@Builder
public class WalletDTO {

    private Long id;

    private String label;
}
