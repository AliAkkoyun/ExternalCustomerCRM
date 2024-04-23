package com.ExternalCustomerCRM.External.User.Data.Pool.dto.companyNote;

import com.ExternalCustomerCRM.External.User.Data.Pool.model.CompanyNote;
import org.springframework.stereotype.Component;

@Component
public class CompanyNoteDtoConverter {

    public CompanyNoteDto convert(CompanyNote from){
        return new CompanyNoteDto(
                from.getId(),
                from.getDate(),
                from.getMessageAuthor(),
                from.getMessage()
        );
    }

}
