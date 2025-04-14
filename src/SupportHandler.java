public interface SupportHandler {
    SupportHandler setNext(SupportHandler nextHandler);
    void handle(String issue);
}
