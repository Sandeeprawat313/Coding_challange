package com.masi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masi.model.Entry;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
