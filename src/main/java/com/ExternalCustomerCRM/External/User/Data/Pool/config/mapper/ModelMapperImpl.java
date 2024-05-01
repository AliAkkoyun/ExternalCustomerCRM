package com.ExternalCustomerCRM.External.User.Data.Pool.config.mapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperImpl {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
