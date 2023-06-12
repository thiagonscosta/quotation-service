package org.br.mineradora.dto;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized
@Data 
@Builder 
@AllArgsConstructor 
public class QuotationDto {
    
    private Date date;

    private BigDecimal currencyPrice;
}
