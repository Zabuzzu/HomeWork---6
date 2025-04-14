import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> commandSlots = new HashMap<>();
    private Stack<Command> commandHistory = new Stack<>();
    public void setCommand(String slot, Command command) {
        commandSlots.put(slot, command);
    }
    public void pressButton(String slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
            commandHistory.push(command);
        } else {
            System.out.println("No command assigned to slot: " + slot);
        }
    }
    public void undoButton() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            System.out.println("Undo last command:");
            command.undo();
        } else {
            System.out.println("No command to undo.");
        }
    }
}
