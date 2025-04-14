public class JuniorSupportHandler extends AbstractSupportHandler {
    @Override
    public void handle(String issue) {
        if ("refund_request".equalsIgnoreCase(issue) || "billing_issue".equalsIgnoreCase(issue)) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue + " — passing to next level");
            passToNext(issue);
        }
    }
}
