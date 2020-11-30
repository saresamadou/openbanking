package io.betterbanking.repository.impl;

import io.betterbanking.repository.MerchantDetailsRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sareaboudousamadou.
 */
@Component
public class MerchantDetailsRepositoryImpl implements MerchantDetailsRepository {

    @Override
    public Map<String, String> retrieveMerchantLogoMap() {
        Map<String, String> mapOfMerchantLogo = new HashMap<>();
        mapOfMerchantLogo.put("Acme", "acme-logo.png");
        mapOfMerchantLogo.put("Globex", "globex-logo.png");
        mapOfMerchantLogo.put("Morley", "morley-logo.png");
        mapOfMerchantLogo.put("Contoso", "contoso-logo.png");
        return mapOfMerchantLogo;
    }
}
