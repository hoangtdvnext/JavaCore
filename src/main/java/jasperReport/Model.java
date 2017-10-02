package jasperReport;

import java.io.InputStream;

/**
 * Created by hoangtd on 10/2/2017.
 */
public class Model {
    InputStream imgInput;
    String txtMessage;

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
}
