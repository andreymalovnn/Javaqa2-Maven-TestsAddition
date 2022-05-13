import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    // Создаем тесты с говорящим названием под каждый случай.
    // Подключаем @Test JUnit.
    // В тесте объявляем объект service сервисного класса BonusService, который тестируем.
    // Задаем переменные, значения которых будем изменять, включая ОР.
    // Задаем переменную (формулу) для расчета ФР методом service.calculate.
    // Подключаем команды Assertions JUnit.
    // Сравниваем ОР и ФР методом assertEquals(expected, actual).
    // Обязательно пробуем уронить тесты с невалидными данными.

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}