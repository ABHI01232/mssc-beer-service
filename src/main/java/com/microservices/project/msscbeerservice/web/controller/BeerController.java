package com.microservices.project.msscbeerservice.web.controller;

import com.microservices.project.msscbeerservice.web.model.BeerDto;
import com.microservices.project.msscbeerservice.web.service.BeerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId)
    {  return new ResponseEntity<>(beerService.getById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody  @Validated  BeerDto beerDto)
    {

        return new ResponseEntity<>(beerService.saveNewBeer(beerDto), HttpStatus.CREATED);
    }


    @PutMapping("/{beerId}")
   public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId")UUID beerId,@RequestBody @Validated BeerDto beerDto)
    {
         return new ResponseEntity<>(beerService.updateBeer(beerId, beerDto), HttpStatus.NO_CONTENT);
    }
}
