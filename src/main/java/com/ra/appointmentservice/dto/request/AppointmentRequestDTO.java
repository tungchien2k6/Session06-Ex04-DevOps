package com.ra.appointmentservice.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentRequestDTO {

    @NotNull(message = "ID Bệnh nhân không được để trống")
    private Long patientId;

    @NotNull(message = "ID Bác sĩ không được để trống")
    private Long doctorId;

    private LocalDateTime appointmentDate;

    private String reason;
}