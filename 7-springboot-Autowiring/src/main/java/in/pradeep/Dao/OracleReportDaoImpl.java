package in.pradeep.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("Oracle")
@Repository()
@Primary
public class OracleReportDaoImpl implements ReportDao {
	public OracleReportDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("OracleReportDaoImpl:: constructor");
	}
	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("featching report from Oracle-==>DB ");
		
		return "Report Data";
	}

}
