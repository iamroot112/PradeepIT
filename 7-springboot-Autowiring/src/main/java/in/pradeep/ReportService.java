package in.pradeep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.pradeep.Dao.ReportDao;

@Service
public class ReportService {
private ReportDao reportDao;

@Autowired
//@Qualifier("Oracle")
public void setReportDao(ReportDao reportDao) {
	System.out.println("setter method calling");
	this.reportDao = reportDao;
}

public void generateReport() {
	String findData=reportDao.findData();
	System.out.println("generate report..");
}
}
