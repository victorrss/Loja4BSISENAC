package br.com.store.report;

import br.com.store.db.util.ConnectionUtils;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class SaleReport {

    private String path;
    private String pathToReportPackage;
    private Date startDate, endDate;

    public SaleReport(Date start, Date end) {
        this.path = this.getClass().getClassLoader().getResource("").getPath();
        this.pathToReportPackage = this.path + "br/com/store/report/";
        this.startDate = start;
        this.endDate = end;
        System.out.println(path);
    }

    public void view() throws Exception {
        Connection con = ConnectionUtils.getConnection();
        JasperReport report = JasperCompileManager.compileReport(this.getPathToReportPackage() + "sale.jrxml");

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("start", new java.sql.Timestamp(startDate.getTime()));
        Calendar c = Calendar.getInstance();
        c.setTime(endDate);
        c.add(Calendar.HOUR, 23);
        c.add(Calendar.MINUTE, 59);
        c.add(Calendar.SECOND, 59);
        endDate = c.getTime();
        parameters.put("end", new java.sql.Timestamp(endDate.getTime()));

        JasperPrint print = JasperFillManager.fillReport(report, parameters, con);
        JasperViewer.viewReport(print, false);

    }

    public String getPathToReportPackage() {
        return this.pathToReportPackage;
    }

    public String getPath() {
        return this.path;
    }
}
