package com.orhanararat.accessor;

import com.orhanararat.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange")
public interface CurrencyConversionAccessor {
    @GetMapping("currency-exchange/from/{from}/to/{to}")
    CurrencyConversion getCurrencyExchange(@PathVariable String from, @PathVariable String to);
}
