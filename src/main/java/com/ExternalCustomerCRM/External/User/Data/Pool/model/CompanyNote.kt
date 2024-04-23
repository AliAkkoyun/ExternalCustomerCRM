package com.ExternalCustomerCRM.External.User.Data.Pool.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.GenericGenerator
import java.text.DateFormat

@Entity
@Table(name = "company_note")
data class CompanyNote (

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.UUIDGenerator")
    val id: String?,
    val date: DateFormat?,
    val messageAuthor: String?,
    val message: String?,

        ){

}