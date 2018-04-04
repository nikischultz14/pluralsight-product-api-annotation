package com.wiredbraincoffee.pluralsightproductapiannotation.repositories;

import com.wiredbraincoffee.pluralsightproductapiannotation.model.Product;
import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {

}
