package com.ExternalCustomerCRM.External.User.Data.Pool.dto.company;

import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companyNote.CompanyNoteDtoConverter;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact.ContactDtoConverter;
import org.springframework.stereotype.Component;

@Component
public class CompanyDtoConverter {

    private final ContactDtoConverter contactDtoConverter;

    private final CompanyNoteDtoConverter companyNoteDtoConverter;

    public CompanyDtoConverter(ContactDtoConverter contactDtoConverter, CompanyNoteDtoConverter companyNoteDtoConverter) {
        this.contactDtoConverter = contactDtoConverter;
        this.companyNoteDtoConverter = companyNoteDtoConverter;
    }



}
