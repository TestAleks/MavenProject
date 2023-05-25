public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 30;
        long bonus = service.calculate(1_000, true);
        System.out.println("1. " + expected + " == ? == " + bonus);

        expected = 500;
        bonus = service.calculate(1_000_000, true);
        System.out.println("2. " + expected + " == ? == " + bonus);

        expected = 10;
        bonus = service.calculate(1_000, false);
        System.out.println("4. " + expected + " == ? == " + bonus);

        expected = 500;
        bonus = service.calculate(1_000_000, false);
        System.out.println("3. " + expected + " == ? == " + bonus);



    }
}
