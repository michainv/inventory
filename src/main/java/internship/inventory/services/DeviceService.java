package internship.inventory.services;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;



    public List<Device> getAllDevices() {

        return deviceRepository.findAll();
    }

    public Optional<Device> getDeviceBySN(String serial_number) {
        return deviceRepository.findBySerialNumber(serial_number);
    }
}
