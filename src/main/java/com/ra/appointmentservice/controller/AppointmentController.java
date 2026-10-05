package com.ra.appointmentservice.controller;

import com.ra.appointmentservice.dto.request.AppointmentRequestDTO;
import com.ra.appointmentservice.dto.response.AppointmentResponseDTO;
import com.ra.appointmentservice.service.AppointmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ResponseEntity<AppointmentResponseDTO> createAppointment(@Valid @RequestBody AppointmentRequestDTO request) {
        return new ResponseEntity<>(appointmentService.createAppointment(request), HttpStatus.CREATED);
    }
}