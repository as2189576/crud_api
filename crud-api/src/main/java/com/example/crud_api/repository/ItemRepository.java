package com.example.crud_api.repository;

import com.example.crud_api.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long>{
        }
