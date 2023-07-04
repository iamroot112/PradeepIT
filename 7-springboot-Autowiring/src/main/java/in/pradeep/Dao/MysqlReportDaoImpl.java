package in.pradeep.Dao;

import org.springframework.stereotype.Repository;

//@Repository("Mysql")
@Repository()
public class MysqlReportDaoImpl implements ReportDao {
	public MysqlReportDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("MysqlReportDaoImpl:: constructor");
	}
	@Override
	public String findData() {
		// TODO Auto-generated method stub
		System.out.println("featching report from Mysql===>DB");
		
		return "Report Data";
	}

}
