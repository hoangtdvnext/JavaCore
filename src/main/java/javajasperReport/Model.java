package javajasperReport;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hoangtd on 10/2/2017.
 */
public class Model {
    InputStream imgInput;
    String txtMessage;
    List<UserReport> userReports;

    public Model() {
        this.userReports = new ArrayList<>();
    }

    public InputStream getImgInput() {
        return imgInput;
    }

    public void setImgInput(InputStream imgInput) {
        this.imgInput = imgInput;
    }

    public String getTxtMessage() {
        return txtMessage;
    }

    public void setTxtMessage(String txtMessage) {
        this.txtMessage = txtMessage;
    }

    public List<UserReport> getUserReports() {
        return userReports;
    }

    public void setUserReports(List<UserReport> userReports) {
        this.userReports = userReports;
    }
}
