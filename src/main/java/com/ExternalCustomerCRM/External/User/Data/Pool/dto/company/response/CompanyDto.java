package com.ExternalCustomerCRM.External.User.Data.Pool.dto.company.response;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.response.CompanyNoteDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.response.ContactDto;

import java.util.Set;

public record CompanyDto(
        Long id,
        String name,
        String commercialAgreement,
        CompanyNoteDto companyNoteDto,
        Set<ContactDto> contacts
) {
}
