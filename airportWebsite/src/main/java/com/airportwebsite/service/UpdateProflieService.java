// UpdateProfileService.java
package com.airportwebsite.service;

import com.airportwebsite.dao.DashboardDAO;
import com.airportwebsite.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateProfileService {
    @Autowired
    private DashboardDAO dashboardDAO;

    public UserModel update(UserModel updatedUser) {
        return dashboardDAO.save(updatedUser);
    }
}