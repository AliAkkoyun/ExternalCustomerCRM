package com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.request;

import java.text.DateFormat;

public record UpdateCompanyNoteDto(
        Long id,
        DateFormat date,
        String messageAuthor,
        String message
) {
}
