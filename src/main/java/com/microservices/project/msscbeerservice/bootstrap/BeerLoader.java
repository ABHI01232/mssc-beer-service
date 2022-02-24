package com.microservices.project.msscbeerservice.bootstrap;

import com.microservices.project.msscbeerservice.domain.Beer;
import com.microservices.project.msscbeerservice.web.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
   loadBeerObjects();
    }

    private void loadBeerObjects()
    {
        if(beerRepository.count()==0)
        {

            beerRepository.save(Beer.builder()
            .beerName("Budwieser")
                    .beerStyle("ipa")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
            .beerName("CAT")
                .beerStyle("Pale ALE")
                .quantityToBrew(200)
                .minOnHand(12)
                .upc(337010000501L)
                .price(new BigDecimal("11.95"))
                .build()

            );




        }
System.out.println("Loaded Beers: "+ beerRepository.count());
    }
}
