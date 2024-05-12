package com.harunsefainan.carrentalbackend.services.customer;

import com.harunsefainan.carrentalbackend.dto.CarDto;
import com.harunsefainan.carrentalbackend.entity.Car;
import com.harunsefainan.carrentalbackend.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CarRepository carRepository;

    @Override
    public List<CarDto> getAllCars() {
        return carRepository.findAll().stream().map(Car::getCarDto).collect(Collectors.toList());
    }
}
