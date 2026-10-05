package com.ra.appointmentservice.service;

import com.ra.appointmentservice.dto.request.AppointmentRequestDTO;
import com.ra.appointmentservice.dto.response.AppointmentResponseDTO;


public interface AppointmentService {
    AppointmentResponseDTO createAppointment(AppointmentRequestDTO request);
}
