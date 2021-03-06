package com.nttdata.customerservice.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nttdata.customerservice.util.Constants;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonalCustomerDto {

    private final String id;

    @NotNull(message = Constants.NOT_NULL)
    private final String firstName;

    @NotNull(message = Constants.NOT_NULL)
    private final String lastName;

    @NotNull(message = Constants.NOT_NULL)
    private final String dni;

}
