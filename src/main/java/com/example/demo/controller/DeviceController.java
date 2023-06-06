package com.example.demo.controller;

import com.example.demo.entity.Device;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/devices")
public class DeviceController {

    @GetMapping
    public List<Device> getAllDevices(){
        List<Device> devices = Arrays.asList(
                new Device(1, "NMSH"),
                new Device(1, "DSSH")
        );
        return devices;
    }
}
