package com.ExternalCustomerCRM.External.User.Data.Pool.dto.contact;

import com.ExternalCustomerCRM.External.User.Data.Pool.model.Contact;

public class ContactDtoConverter {

    //TODO buradaki company arıza çıkartıyor, kaba kodu yazdıktan sonra üzerine bak
    public ContactDto convert (Contact from){
        return new ContactDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getEmail(),
                from.getPhoneNumber(),
                from.getCompany()
        );
    }
}
