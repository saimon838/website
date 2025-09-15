// RegisterService.java
package com.airportwebsite.service;

import com.airportwebsite.dao.DashboardDAO;
import com.airportwebsite.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private DashboardDAO dashboardDAO;

    public boolean register(UserModel user) {
        if (dashboardDAO.existsById(user.getUsername())) {
            return false; // User exists
        }
        dashboardDAO.save(user);
        return true;
    }
}