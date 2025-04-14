public class FAQBotHandler extends AbstractSupportHandler {
    @Override
    public void handle(String issue) {
        if ("password_reset".equalsIgnoreCase(issue)) {
            System.out.println("[FAQBot] Handled " + issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue + " — passing to next level");
            passToNext(issue);
        }
    }
}
