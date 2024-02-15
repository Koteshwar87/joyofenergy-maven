package uk.tw.energy.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse <T> {

    // The status of the API response, indicating success or failure.
    private String status;

    // The HTTP status code associated with the API response.
    private Integer httpStatus;

    // A human-readable message providing additional information about the API response.
    private String message;

    // An internal code or identifier for the API response, aiding in error identification.
    private String internalCode;

    // The data payload included in the API response, holding the actual content.
    private T data;

    // Other methods implementation
}