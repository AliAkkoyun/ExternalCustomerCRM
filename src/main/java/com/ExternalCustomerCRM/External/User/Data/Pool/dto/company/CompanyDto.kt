package com.ExternalCustomerCRM.External.User.Data.Pool.dto.company

import com.ExternalCustomerCRM.External.User.Data.Pool.model.CompanyNote
import com.ExternalCustomerCRM.External.User.Data.Pool.model.Contact
import jakarta.persistence.FetchType
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne

data class CompanyDto(
    val id : String?,
    val name: String?,
    val commercialAgreement : String?,
    val companyNote : CompanyNote?,
    val contact : Set<Contact>?
){

}