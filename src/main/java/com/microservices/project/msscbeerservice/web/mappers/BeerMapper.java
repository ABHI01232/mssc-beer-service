package com.microservices.project.msscbeerservice.web.mappers;

import com.microservices.project.msscbeerservice.domain.Beer;
import com.microservices.project.msscbeerservice.web.model.BeerDto;

import org.mapstruct.Mapper;

@Mapper(uses={DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);


    Beer BeerDtoToBeer(BeerDto dto);
}
