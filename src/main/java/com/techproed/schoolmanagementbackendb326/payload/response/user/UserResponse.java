package com.techproed.schoolmanagementbackendb326.payload.response.user;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.techproed.schoolmanagementbackendb326.payload.response.abstracts.BaseUserResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse extends BaseUserResponse {




}
