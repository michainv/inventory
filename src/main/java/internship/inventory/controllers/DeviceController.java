package internship.inventory.controllers;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.services.CompanyService;
import internship.inventory.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "api/device/")
public class DeviceController {

    @Autowired
    private final DeviceService deviceService;


    public DeviceController(DeviceService deviceService){this.deviceService = deviceService;}

    @GetMapping("get/all")
    public List<Device> getAllEmployees() {
        System.out.println("CALLED GET ALL");
        return deviceService.getAllDevices();
    }


}
