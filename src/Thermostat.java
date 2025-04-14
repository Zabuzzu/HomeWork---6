public class Thermostat {
    private int temperature;
    private int previousTemperature;
    public Thermostat(int initialTemperature) {
        this.temperature = initialTemperature;
    }
    public void setTemperature(int temperature) {
        previousTemperature = this.temperature;
        this.temperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }
    public void revertTemperature() {
        System.out.println("[Thermostat] Reverting to previous temperature " + previousTemperature + "°C");
        temperature = previousTemperature;
    }
    public int getTemperature() {
        return temperature;
    }
}
