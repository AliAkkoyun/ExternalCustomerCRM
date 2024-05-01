package com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.request;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.company.response.CompanyDto;

public record CreateContactDto(
        Long id,
        CompanyDto company,
        String firstName,
        String lastName,
        String phoneNumber,
        String email
) {
}
