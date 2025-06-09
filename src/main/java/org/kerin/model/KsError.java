package org.kerin.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class KsError {

    String ksErrorCode;
    String ksErrorTitle;
    String ksErrorDetails;

}
