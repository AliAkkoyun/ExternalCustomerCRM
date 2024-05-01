package com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.response;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.company.response.CompanyDto;

public record ContactDto(
        Long id,
        CompanyDto company,
        String firstName,
        String lastName,
        String phoneNumber,
        String email
) {
}
