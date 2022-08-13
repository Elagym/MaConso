package be.verbeet.maconso.mapper;

import be.verbeet.maconso.dto.TransactionDTO;
import be.verbeet.maconso.model.Transaction;
import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vince on 13-08-22.
 */
@Mapper
public interface TransactionMapper {

    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);

    @Mapping(source = "transaction.wallet.id", target = "walletId")
    @Mapping(source = "transaction.wallet.label", target = "walletLabel")
    TransactionDTO map(Transaction transaction);

    default List<TransactionDTO> mapList(List<Transaction> transactions) {
        if (CollectionUtils.isEmpty(transactions)) {
            return Collections.EMPTY_LIST;
        }
        List<TransactionDTO> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            result.add(map(transaction));
        }
        return result;
    }

    Transaction map(TransactionDTO dto);
}
