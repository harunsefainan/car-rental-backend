package com.harunsefainan.carrentalbackend.services.admin;

import com.harunsefainan.carrentalbackend.dto.CarDto;

import java.io.IOException;

public interface AdminService {

    boolean postCar(CarDto carDto) throws IOException;

}
