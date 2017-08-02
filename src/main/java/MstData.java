import java.util.HashMap;
import java.util.Map;

/**
 * Created by hoangtd on 8/4/2017.
 */
public class MstData {
    static Map<Integer, String> mstPapers = new HashMap<>();
    static Map<Integer, String> mstLaminations = new HashMap<>();
    static Map<Integer, String> packingMethod = new HashMap<>();
    static Map<Integer, String> classificationEndIndustry = new HashMap<>();
    static Map<Integer, String> classificationPackagingContainer = new HashMap<>();

    static{
        mstPapers.put(5,"SQカード");
        mstPapers.put(7,"JETエースW");
        mstPapers.put(20,"NEWピジョン");
        mstPapers.put(12,"TitanBoard");
        mstPapers.put(1,"SQカード");
        mstPapers.put(2,"NSコート");
        mstPapers.put(13,"SCコート");
        mstPapers.put(3,"サンコート");
        mstPapers.put(22,"CRC");

        mstLaminations.put(16,"K");
        mstLaminations.put(5,"K(NRK)");
        mstLaminations.put(6,"CWF");
        mstLaminations.put(9,"BWF");
        mstLaminations.put(3,"C");
        mstLaminations.put(1,"SCP");
        mstLaminations.put(14,"SAM-S");

        packingMethod.put(1,"ｸﾗﾌﾄ梱包（多久）");
        packingMethod.put(2,"ｸﾗﾌﾄ梱包（コダマ）");
        packingMethod.put(3,"ｸﾗﾌﾄ梱包（佐賀）");
        packingMethod.put(4,"ｼｭﾘﾝｸ梱包（佐賀）");
        packingMethod.put(5,"段ﾎﾞｰﾙ梱包（社用）");
        packingMethod.put(6,"段ﾎﾞｰﾙ梱包（専用）");
        packingMethod.put(7,"パレット板締め");

        classificationEndIndustry.put(1,"食料品製造業");
        classificationEndIndustry.put(2,"清涼飲料製造業及び茶");
        classificationEndIndustry.put(3,"酒類製造業");
        classificationEndIndustry.put(4,"油脂加工製品・石鹸");
        classificationEndIndustry.put(5,"医薬品製造業");
        classificationEndIndustry.put(6,"化粧品・歯磨・その他");
        classificationEndIndustry.put(7,"小売業");
        classificationEndIndustry.put(8,"その他の業種");

        classificationPackagingContainer.put(111,"その他の業種");
        classificationPackagingContainer.put(112,"その他の業種");
        classificationPackagingContainer.put(221,"その他の業種");
        classificationPackagingContainer.put(223,"その他の業種");
        classificationPackagingContainer.put(224,"その他の業種");
        classificationPackagingContainer.put(225,"その他の業種");
        classificationPackagingContainer.put(8,"その他の業種");
        classificationPackagingContainer.put(8,"その他の業種");
        classificationPackagingContainer.put(8,"その他の業種");

    }

    public static void main(String[] args) {
        Integer paperId = 12;
        String paperName = mstPapers.get(paperId);

        System.out.println(paperName);

        Integer a = null;
        Integer b = 100;

        if(a.equals(b)){
            System.out.println("OK");
        }
    }

}
