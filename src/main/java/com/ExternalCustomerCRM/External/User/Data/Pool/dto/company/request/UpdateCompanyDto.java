package com.ExternalCustomerCRM.External.User.Data.Pool.dto.company.request;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.response.CompanyNoteDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.response.ContactDto;

import java.util.Set;

public record UpdateCompanyDto(
        Long id,
        String name,
        String commercialAgreement,
        CompanyNoteDto companyNoteDto,
        Set<ContactDto> contacts
) {
}
