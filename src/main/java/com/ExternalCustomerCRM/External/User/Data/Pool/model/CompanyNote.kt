package com.ExternalCustomerCRM.External.User.Data.Pool.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.GenericGenerator
import java.text.DateFormat
//
@Entity
@Table(name = "company_note")
data class CompanyNote @JvmOverloads constructor(

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.UUIDGenerator")
    val id: Long? = null,
    val date: DateFormat? = null,
    val messageAuthor: String? = null,
    val message: String? = null,
        )
{

    //TODO burada bir hata var. Sonra tekar bak
    constructor(date : DateFormat, messageAuthor: String?, message: String?) : this(
         "",
         date = date,
         messageAuthor = messageAuthor,
         message = message
    )

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CompanyNote

        if (id != other.id) return false
        if (date != other.date) return false
        if (messageAuthor != other.messageAuthor) return false
        if (message != other.message) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (date?.hashCode() ?: 0)
        result = 31 * result + (messageAuthor?.hashCode() ?: 0)
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "CompanyNote(id=$id, date=$date, messageAuthor=$messageAuthor, message=$message)"
    }
}