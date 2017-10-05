package javajasperReport;

import javacommon.Random;
import javaEnum.Enums;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;

/**
 * Created by hoangtd on 10/2/2017.
 * http://o7planning.org/vi/10293/huong-dan-goi-bao-cao-jasperreport-trong-ung-dung-java
 */
public class PdfFromXmlFile {

    private static final String PATH_URL = "F:/export/";
    private static final String URL_JASPER = "F:/HoangTd/JavaLearning/JavaCore/src/main/resources/jasper/jasper-user.jasper";
    private static final String URL_IMAGE = "F:/HoangTd/JavaLearning/JavaCore/src/main/resources/img/20170730_094631.jpg";

    public static void main(String[] args) throws JRException, IOException {
        //1. Get file jasper report
        JasperReport jasperReport = getJasperReport(URL_JASPER, Enums.FileTypeReport.JAPER);

        // create listUser
        List<UserReport> listUser = new ArrayList<>();
        Model model = new Model();

        UserReport user = new UserReport("hoangtd", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user);
        UserReport user1 = new UserReport("hoangtd1", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user1);
        UserReport user2 = new UserReport("hoangtd2", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user2);
        UserReport user3 = new UserReport("hoangtd3", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user3);
        UserReport user4 = new UserReport("hoangtd4", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user4);
        UserReport user5 = new UserReport("hoangtd5", "duyhoangptit@gmail.com", "23", "Hiệp Hòa - Bắc Giang", "0976653494", "Tạ Duy Hoàng");
        listUser.add(user5);

        model.setUserReports(listUser);

        JRBeanCollectionDataSource listUserJRBean = new JRBeanCollectionDataSource(model.getUserReports());

        //2. Data truyền vào file jasper
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("listUser", listUserJRBean);
        parameters.put("listUserTable", listUserJRBean);

        // model
        InputStream stream = new FileInputStream(URL_IMAGE);
        model.setTxtMessage("hoangtd.com");
        model.setImgInput(stream);

        List modelTmp = Arrays.asList(model);

        // Data source
        // Đây là báo cáo đơn giản, không kết nối db
        // vì vậy không cần nguồn dữ liệu, nếu có dữ liệu thì sử dụng JRBeanCollectionDataSource
        JRDataSource dataSource = new JRBeanCollectionDataSource(modelTmp);
        
        //3. Create JasperPrint
        JasperPrint jasperPrint = JasperFillManager
                .fillReport(jasperReport, parameters, dataSource);

        // Đảm bảo thư mục đầu ra tồn tại
        File outDir = new File(PATH_URL);
        if (outDir != null) {
            outDir.mkdirs();
        }

        // Chạy báo cáo và export ra file pdf
        String fileNamePdf = Random.randomUUID() + ".pdf";
        extractPrintPDF(null, PATH_URL, fileNamePdf, jasperPrint, parameters);

        // Chạy báo cáo và export ra file png
        String fileNameImg = Random.randomUUID() + ".png";
        extractPrintImage(PATH_URL,fileNameImg, jasperPrint);

        System.out.println("Finish!!!");
    }

    private static void extractPrintPDF(List model, String destPath, String filePath,
                                        JasperPrint jasperPrint, Map<String, Object> parameters) {
        // Chạy báo cáo và export ra file pdf
        try {
            JasperExportManager.exportReportToPdfFile(jasperPrint, destPath + filePath);
        } catch (JRException e) {
            e.printStackTrace();
        }
    }

    private static void extractPrintImage(String destPath, String filePath, JasperPrint print) {
        File file = new File(destPath + filePath);
        OutputStream ouputStream = null;
        try {
            ouputStream = new FileOutputStream(file);
            DefaultJasperReportsContext.getInstance();
            JasperPrintManager printManager = JasperPrintManager.getInstance(DefaultJasperReportsContext.getInstance());

            BufferedImage rendered_image = null;
            rendered_image = (BufferedImage) printManager.printPageToImage(print, 0, 1.0f);
            ImageIO.write(rendered_image, "png", ouputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ouputStream != null) {
                try {
                    ouputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static JasperReport getJasperReport(String urlFile, Enums.FileTypeReport typeFile) throws JRException {
        JasperReport jasperReport;
        if (typeFile.equals(Enums.FileTypeReport.JAPER)) {
            File fileInput = new File(urlFile);
            jasperReport = (JasperReport) JRLoader.loadObject(fileInput);
        } else if (typeFile.equals(Enums.FileTypeReport.JRXML)) {
            jasperReport = JasperCompileManager.compileReport(urlFile);
        } else {
            return null;
        }

        return jasperReport;
    }
}
