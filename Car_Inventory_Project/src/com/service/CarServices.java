package com.service;

import java.sql.SQLException;
import java.util.List;

import com.crudoperations.CarCrudOperations;
import com.pojo.Car;

public class CarServices {
 CarCrudOperations crud=new CarCrudOperations();
  public List<Car> viewCars() {
	  return crud.view();
  }
  public Car addCar(Car car) throws SQLException {
	  return crud.insertCar(car);
  }
  public String updateCar(String make,String model,float price) throws SQLException{
	  return crud.updateCar(make,model, price);
  }
public String deleteCar(String make,String model) throws SQLException {
	return crud.deleteCar(make,model);
	
}
}
  