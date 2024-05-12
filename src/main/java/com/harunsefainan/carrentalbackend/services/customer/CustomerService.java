package com.harunsefainan.carrentalbackend.services.customer;

import com.harunsefainan.carrentalbackend.dto.BookACarDto;
import com.harunsefainan.carrentalbackend.dto.CarDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookACar(BookACarDto bookACarDto);

    CarDto getCarById(Long carId);

}
