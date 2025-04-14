public class Main {
    public static void main(String[] args) {
        testChainOfResponsibility();
        testCommandPattern();
    }
    private static void testChainOfResponsibility() {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();
        faq.setNext(junior).setNext(senior);
        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }
    }
    private static void testCommandPattern() {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat(20);
        Command turnOnLight = new TurnOnLightCommand(livingRoomLight);
        Command setThermostat = new SetThermostatCommand(thermostat, 22);
        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("light", turnOnLight);
        remote.setCommand("thermostat", setThermostat);
        remote.pressButton("light");
        remote.pressButton("thermostat");
        remote.undoButton();
        remote.pressButton("music_player");
    }
}
