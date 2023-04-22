package com.example.kea_domain.repository;

import com.example.kea_domain.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {

}
