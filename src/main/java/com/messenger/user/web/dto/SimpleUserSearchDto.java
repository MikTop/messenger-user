package com.messenger.user.web.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleUserSearchDto {

    private Long id;

    private String username;

}
