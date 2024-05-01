package com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.response;

import java.text.DateFormat;

public record CompanyNoteDto(
        Long id,
        DateFormat date,
        String messageAuthor,
        String message
){}
