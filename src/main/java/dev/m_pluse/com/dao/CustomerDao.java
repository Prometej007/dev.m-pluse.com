package dev.m_pluse.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.m_pluse.com.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
