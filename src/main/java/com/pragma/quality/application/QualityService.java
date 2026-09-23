package com.pragma.quality.application;

import com.pragma.quality.domain.QualityDomain;
import com.pragma.quality.infrastructure.QualityRepository;
import org.springframework.stereotype.Service;

@Service
public class QualityService implements QualityDomain {
    private final QualityRepository repository;

    public QualityService(QualityRepository repository) {
        this.repository = repository;
    }

    // Implementación de la lógica de negocio
}