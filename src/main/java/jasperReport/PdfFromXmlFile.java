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
        File fileInput = new File("F:\\HoangTd\\JavaLearning\\JavaCore\\src\\main\\resources\\jasper\\demo-jasper.jasper");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(fileInput);
        // 2. read file from demo-jasper.jrxml
//        JasperReport jasperReport = JasperCompileManager
//                .compileReport("F:\\HoangTd\\JavaLearning\\JavaCore\\src\\main\\resources\\jasper\\demo-jasper.jrxml");

        // Tham số truyền vào báo cáo
        Map<String, Object> parameters = new HashMap<>();

        // model
        Model model = new Model();
        InputStream stream = new FileInputStream("F:\\HoangTd\\JavaLearning\\JavaCore\\src\\main\\resources\\img\\20170730_094631.jpg");
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
        FileOutputStream outputStream = new FileOutputStream(fileInput);
        JasperPrintManager printManager = JasperPrintManager.getInstance(DefaultJasperReportsContext.getInstance());

        fileName = Random.randomUUID() + ".png";
        BufferedImage bufferedImage = (BufferedImage)printManager.printPageToImage(fileName, 0, 1.0f);
        ImageIO.write(bufferedImage, "png", outputStream);

        outputStream.close();
        System.out.println("Finish!!!");

    }
}
