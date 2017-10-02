package jasperReport;

import common.Random;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hoangtd on 10/2/2017.
 * http://o7planning.org/vi/10293/huong-dan-goi-bao-cao-jasperreport-trong-ung-dung-java
 */
public class PdfFromXmlFile {

    public static void main(String[] args) throws JRException, IOException {
        // 1. read file from demo-jasper.jasper
        File fileInput = new File("F:\\CNPM\\HoangPtit\\JavaCore\\src\\main\\resources\\jasper\\demo-jasper.jasper");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(fileInput);
        // 2. read file from demo-jasper.jrxml
//        JasperReport jasperReport = JasperCompileManager
//                .compileReport("F:\\CNPM\\HoangPtit\\JavaCore\\src\\main\\resources\\jasper\\demo-jasper.jrxml");

        // Tham số truyền vào báo cáo
        Map<String, Object> parameters = new HashMap<>();

        // model
        Model model = new Model();
        InputStream stream = new FileInputStream("F:\\CNPM\\HoangPtit\\JavaCore\\src\\main\\resources\\img\\20170730_094631.jpg");
        model.setTxtMessage("Demo jasper");
        model.setImgInput(stream);

        List modelTmp = Arrays.asList(model);
        // Data source
        // Đây là báo cáo đơn giản, không kết nối db
        // vì vậy không cần nguồn dữ liệu
        JRDataSource dataSource = new JRBeanCollectionDataSource(modelTmp);

        JasperPrint jasperPrint = JasperFillManager
                .fillReport(jasperReport, parameters, dataSource);

        // Đảm bảo thư mục đầu ra tồn tại
        File outDir = new File("F:/export");
        if (outDir != null) {
            outDir.mkdirs();
        }

        String fileName = Random.randomUUID() + ".pdf";

        // Chạy báo cáo và export ra file pdf
        JasperExportManager.exportReportToPdfFile(jasperPrint, "F:/export/" + fileName);

        // Chạy báo cáo và export ra file png
        fileName = "F:/export/" + Random.randomUUID() + ".png";
        extractPrintImage(fileName, jasperPrint);

        System.out.println("Finish!!!");
    }

    private static void extractPrintImage(String filePath, JasperPrint print) {
        File file = new File(filePath);
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
        }finally {
            if(ouputStream != null){
                try {
                    ouputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
