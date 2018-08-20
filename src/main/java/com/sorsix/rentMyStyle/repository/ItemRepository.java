package com.sorsix.rentMyStyle.repository;

import com.sorsix.rentMyStyle.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findAllByBrand(String brand);
    List<Item> findAllByColor(String color);
    List<Item> findAllBySize(String size);
    List<Item> findAllByPrice(Integer price);
}
