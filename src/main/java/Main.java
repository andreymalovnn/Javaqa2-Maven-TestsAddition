public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long bonusBelowLimitForRegistered = service.calculate(1000, true);
        System.out.println(bonusBelowLimitForRegistered);

        long bonusOverLimitForRegistered = service.calculate(1_000_000, true);
        System.out.println(bonusOverLimitForRegistered);

        long bonusBelowLimitForUnRegistered = service.calculate(1000, false);
        System.out.println(bonusBelowLimitForUnRegistered);

        long bonusOverLimitForUnRegistered = service.calculate(1_000_000, false);
        System.out.println(bonusOverLimitForUnRegistered);
    }
}
