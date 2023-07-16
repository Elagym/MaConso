package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.entity.Transaction;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by Vince on 13-08-22.
 */
@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionDTO map(Transaction transaction);

    List<TransactionDTO> mapList(List<Transaction> transactions);

    Transaction map(TransactionDTO dto);
}
