package org.launchcode.liftoffgroupproject.service;

import org.launchcode.liftoffgroupproject.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFileUploadService {

    @Autowired
    private UserRepository userRepository;


}
