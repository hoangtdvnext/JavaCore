import java.util.Arrays;
import java.util.List;

/**
 * Created by hoangtd on 9/27/2017.
 * https://viblo.asia/p/tf-idf-term-frequency-inverse-document-frequency-JQVkVZgKkyd
 * Trọng số của văn bản thu được qua thống kê thể hiện mức độ quan trọng của từ này trong một văn bản
 * văn bản này nằm trong 1 tập các văn bản được xét
 *
 * 'The nth most common word in a human language text occurs with a frequency inversely proportional to n.'
 */
public class TF0IDF {

    public static void main(String[] args) {
        List<String> doc1 = Arrays.asList("red", "green", "blue", "yellow", "red", "red");
        List<String> doc2 = Arrays.asList("red", "pink", "white", "dark", "orange", "pink");
        List<String> doc3 = Arrays.asList("green", "yellow", "white", "white", "purpil");
        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3);

        TF0IDF calculator = new TF0IDF();
        double tfidf = calculator.tf_idf(doc1, documents, "red");
        System.out.println("TF-IDF (red) = " + tfidf);
    }

    //tf
    public double tf(List<String> doc, String term){
        double result = 0;

        for(String word: doc){
            if(word.equalsIgnoreCase(term)){
                result++;
            }
        }

        return result/doc.size();
    }

    //idf
    public double idf(List<List<String>> docs, String term){
        double n = 0;

        for(List<String> doc: docs){
            for(String word: doc){
                if(term.equalsIgnoreCase(word)){
                    // dem xem term xuat hien tren bao nhieu van ban
                    n++;
                    break;
                }
            }
        }

        return Math.log(docs.size()/n);
    }

    //tf-idf(term frequency - inverse document frequency)
    public double tf_idf(List<String> doc, List<List<String>> docs, String term){
        return tf(doc, term) * idf(docs, term);
    }

}
