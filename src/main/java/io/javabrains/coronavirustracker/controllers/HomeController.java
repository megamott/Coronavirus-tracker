package io.javabrains.coronavirustracker.controllers;

import io.javabrains.coronavirustracker.models.LocationStats;
import io.javabrains.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Matvey Konoplyov
 */

@Controller
public class HomeController {

    final CoronaVirusDataService coronaVirusDataService;

    public HomeController(CoronaVirusDataService coronaVirusDataService) {
        this.coronaVirusDataService = coronaVirusDataService;
    }

    @GetMapping("/")
    public String home(Model model){

        List<LocationStats> allStats  = coronaVirusDataService.getAllStats();
        model.addAttribute("locationStats", allStats);

        int totalReportedCases = allStats.stream().mapToInt(LocationStats::getLatestTotalCases).sum();
        model.addAttribute("totalReportedCases", totalReportedCases);

        int totalNewCases = allStats.stream().mapToInt(LocationStats::getNewCases).sum();
        model.addAttribute("totalNewCases", totalNewCases);

        return "home";
    }

}
