package com.ExternalCustomerCRM.External.User.Data.Pool.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator


@Table(name = "contact")
@Entity
data class Contact @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id : Long? = null,
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "company_id", nullable = false)
    val company: Company? = null,
    val firstName:String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null,
    val email: String? = null,

    ){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Contact

        if (id != other.id) return false
        if (company != other.company) return false
        if (firstName != other.firstName) return false
        if (lastName != other.lastName) return false
        if (phoneNumber != other.phoneNumber) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (company?.hashCode() ?: 0)
        result = 31 * result + (firstName?.hashCode() ?: 0)
        result = 31 * result + (lastName?.hashCode() ?: 0)
        result = 31 * result + (phoneNumber?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Contact(id=$id, company=$company, firstName=$firstName, lastName=$lastName, phoneNumber=$phoneNumber, email=$email)"
    }
}