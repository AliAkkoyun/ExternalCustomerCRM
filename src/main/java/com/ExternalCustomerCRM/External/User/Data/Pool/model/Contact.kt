package com.ExternalCustomerCRM.External.User.Data.Pool.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "contact")
data class Contact (
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id : String?,
    @OneToMany(mappedBy = "contact", fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    val company: Company,
    val firstName: String?,
    val lastName: String?,
    val phoneNumber: String?,
    val email: String?,

        ) {


}