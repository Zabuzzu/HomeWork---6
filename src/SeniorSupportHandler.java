public class SeniorSupportHandler extends AbstractSupportHandler {
    @Override
    public void handle(String issue) {
        if ("account_ban".equalsIgnoreCase(issue) || "data_loss".equalsIgnoreCase(issue)) {
            System.out.println("[SeniorSupport] Handled " + issue);
        } else {
            System.out.println("[SeniorSupport] Cannot handle " + issue + " — escalate manually");
        }
    }
}
