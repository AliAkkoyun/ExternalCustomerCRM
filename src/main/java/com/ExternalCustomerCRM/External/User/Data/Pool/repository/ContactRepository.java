package com.ExternalCustomerCRM.External.User.Data.Pool.repository;

import com.ExternalCustomerCRM.External.User.Data.Pool.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
