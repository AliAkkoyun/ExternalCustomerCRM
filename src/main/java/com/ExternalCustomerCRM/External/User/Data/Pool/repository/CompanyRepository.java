package com.ExternalCustomerCRM.External.User.Data.Pool.repository;

import com.ExternalCustomerCRM.External.User.Data.Pool.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {
}
