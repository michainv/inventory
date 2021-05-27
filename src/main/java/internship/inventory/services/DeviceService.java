package internship.inventory.services;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;



    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }
}
