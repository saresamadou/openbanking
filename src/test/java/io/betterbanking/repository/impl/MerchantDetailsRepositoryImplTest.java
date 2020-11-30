package io.betterbanking.repository.impl;

import io.betterbanking.repository.MerchantDetailsRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author sareaboudousamadou.
 */
class MerchantDetailsRepositoryImplTest {

    private MerchantDetailsRepository merchantDetailsRepository;


    @BeforeEach
    void setUp() {
        merchantDetailsRepository = new MerchantDetailsRepositoryImpl();
    }

    @Test
    void retrieveMerchantLogoMap() {
        Assertions.assertThat(merchantDetailsRepository.retrieveMerchantLogoMap().size()).isEqualTo(4);
    }
}