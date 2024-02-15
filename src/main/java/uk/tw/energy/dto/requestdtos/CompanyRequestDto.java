package uk.tw.energy.dto.requestdtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyRequestDto {
//    private String companyId;
    @NotNull(message = "Company name is required.")
    private String companyName;
}
