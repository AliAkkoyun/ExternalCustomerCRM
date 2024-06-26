package com.ExternalCustomerCRM.External.User.Data.Pool.model

import jakarta.persistence.*
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.GenericGenerator

//TODO buradaki model tanımlamalarını ve ilişkileri sonra ele al.

@Entity
@Table(name = "company")
data class Company @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id : Long? = null,
    val name: String? = null,
    val commercialAgreement : String? = null,

    @OneToOne(fetch = FetchType.LAZY)
    val companyNote : CompanyNote? = null,
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    val contact : Set<Contact>? = null

    )
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Company

        if (id != other.id) return false
        if (name != other.name) return false
        if (commercialAgreement != other.commercialAgreement) return false
        if (companyNote != other.companyNote) return false
        if (contact != other.contact) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (commercialAgreement?.hashCode() ?: 0)
        result = 31 * result + (companyNote?.hashCode() ?: 0)
        result = 31 * result + (contact?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Company(id=$id, name=$name, commercialAgreement=$commercialAgreement, companyNote=$companyNote, contact=$contact)"
    }
}