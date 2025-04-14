public abstract class AbstractSupportHandler implements SupportHandler {
    protected SupportHandler nextHandler;
    @Override
    public SupportHandler setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    protected void passToNext(String issue) {
        if (nextHandler != null) {
            nextHandler.handle(issue);
        } else {
            System.out.println("-> [Chain] Cannot handle " + issue + " — escalate manually");
        }
    }
}
