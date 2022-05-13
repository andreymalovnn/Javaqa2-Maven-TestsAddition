public class BonusService {
    public long calculate(long amount, boolean registered) {
        // С помощью метода calculate считаем bonus для использования в классе main.
        // Задаем метод calculate для возврата данных типа long.
        // Далее объявляем переменные, пишем логику расчета, условия и возвращаемый результат.
        // Если тип данных метода не указываем (void), тогда в итоге просто return;
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}