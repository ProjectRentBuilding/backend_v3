package com.codegym.web.services;

import com.codegym.dao.dto.ReportInt;

import java.util.List;

public interface ReportService {
    List<ReportInt> searchAllReport();
    List<ReportInt> searchAllReportHigh();
    List<ReportInt> searchAllReportLow();
}
