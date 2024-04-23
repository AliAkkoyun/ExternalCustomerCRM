package com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact

import com.ExternalCustomerCRM.External.User.Data.Pool.model.Company
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany

data class ContactDto (
    val id : String?,
    val company: Company,
    val firstName: String?,
    val lastName: String?,
    val phoneNumber: String?,
    val email: String?
        ) {
}