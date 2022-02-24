package com.microservices.project.msscbeerservice.repositories;

import com.microservices.project.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
