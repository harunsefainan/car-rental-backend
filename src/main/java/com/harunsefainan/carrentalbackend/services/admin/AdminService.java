package com.harunsefainan.carrentalbackend.services.admin;

import com.harunsefainan.carrentalbackend.dto.CarDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

}
