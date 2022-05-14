import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class BonusServiceParametrizedTest {
    @ParameterizedTest
    @CsvFileSource (resources = {"/testdata.csv"})
    void pTest(long amount, boolean registered, long expected) {
        // Аннотируем @ParameterizedTest и задаем в тесте pTest принимаемые значения ().
        // Указываем источник данных @CsvSource и варианты значений ({ "1000,true,30", ... }).
        // Так мы разделили данные и код, что очень важно! Но данные нужно хранить в файле, а не в коде класса!
        // Папка Test - New - Directory - Resources - создать File CSV.
        // В файле testdata.csv указываем значения данных для теста
        // Аннотируем @CsvFileSource и указываем источник данных (resources = {"/testdata.csv"}).

        BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
