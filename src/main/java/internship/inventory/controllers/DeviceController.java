package internship.inventory.controllers;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.services.CompanyService;
import internship.inventory.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/device/")
public class DeviceController {

    @Autowired
    private final DeviceService deviceService;


    public DeviceController(DeviceService deviceService){this.deviceService = deviceService;}

    @GetMapping
    public List<Device> getAllEmployees() {
        System.out.println("CALLED GET ALL");
        return deviceService.getAllDevices();
    }

    @GetMapping("get/{serial_number}")
    public Optional<Device> getDeviceBySN(@PathVariable("serial_number")String serial_number){
        return deviceService.getDeviceBySN(serial_number);
    }

    @PostMapping
    public void addDevice(@RequestBody Device device){
        System.out.println(device.getName());
    }

}
