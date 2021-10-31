import org.apache.avro.Schema;
import org.apache.trevni.avro.RandomData;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


public class Main {
    public static void main(String [] args) throws IOException {
        final String avroSchemeFileName = "TransformRequestToPegaModelCommand.avsc";
        File avroSchemeSource = new File("src/main/resources/input/avro/" + avroSchemeFileName);

        Schema schema = new Schema.Parser().parse(avroSchemeSource);

        Iterator<Object> it = new RandomData(schema, 1).iterator();
        System.out.println(it.next());
    }
}
