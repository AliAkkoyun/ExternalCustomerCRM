package com.ExternalCustomerCRM.External.User.Data.Pool.service;

import com.ExternalCustomerCRM.External.User.Data.Pool.config.mapper.ModelMapperService;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.request.CreateCompanyNoteDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.dto.companynote.request.UpdateCompanyNoteDto;
import com.ExternalCustomerCRM.External.User.Data.Pool.exception.CompanyNoteNotFoundException;
import com.ExternalCustomerCRM.External.User.Data.Pool.model.CompanyNote;
import com.ExternalCustomerCRM.External.User.Data.Pool.repository.CompanyNoteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyNoteService {

    private final CompanyNoteRepository companyNoteRepository;
    private final ObjectMapper objectMapper;
    private final ModelMapperService modelMapperService;

    public CompanyNoteService(CompanyNoteRepository companyNoteRepository,
                              ObjectMapper objectMapper,
                              ModelMapperService modelMapperService) {
        this.companyNoteRepository = companyNoteRepository;
        this.objectMapper = objectMapper;
        this.modelMapperService = modelMapperService;
    }

    public void add(CreateCompanyNoteDto request){
        CompanyNote companyNote = this.modelMapperService.forRequest().map(request, CompanyNote.class);

        //iş kodları gelecek
        this.companyNoteRepository.save(companyNote);

    }

    public void update(UpdateCompanyNoteDto request){
        CompanyNote companyNote = this.modelMapperService.forRequest().map(request, CompanyNote.class);
        Optional<CompanyNote> existingNote = Optional.ofNullable(this.companyNoteRepository.findById(companyNote.getId())
                .orElseThrow(() -> new CompanyNoteNotFoundException("Company note not found! id info : " + companyNote.getId())));


    }

}
