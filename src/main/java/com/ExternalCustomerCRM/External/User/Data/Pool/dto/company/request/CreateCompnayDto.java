package com.ExternalCustomerCRM.External.User.Data.Pool.dto.company.request;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.response.CompanyNoteDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.response.ContactDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.model.CompanyNote;

import java.util.Set;

public record CreateCompnayDto(
        Long id,
        String name,
        String commercialAgreement,
        CompanyNoteDto companyNoteDto,
        Set<ContactDto> contacts
) {
}
