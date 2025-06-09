package org.kerin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagePayload {

    String requestId;
    boolean isDocument;
    List<KsError> ksErrorList;
}
