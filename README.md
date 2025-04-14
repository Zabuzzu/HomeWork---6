# Design Patterns Project

## Overview

This project demonstrates the implementation of two behavioral design patterns in Java:

1. **Chain of Responsibility – "Tech Support Request Handler"**  
   This pattern creates a chain of support handlers where each handler can either process an issue or pass it on to the next handler. The handlers include:
   - **FAQBotHandler**: Handles simple issues like `password_reset`.
   - **JuniorSupportHandler**: Handles issues such as `refund_request` and `billing_issue`.
   - **SeniorSupportHandler**: Handles more severe issues like `account_ban` and `data_loss` or escalates unresolved issues.

2. **Command Pattern – "Smart Home Remote Control"**  
   This pattern decouples the sender (invoker) from the receiver by encapsulating requests as command objects. The implementation includes:
   - **TurnOnLightCommand**: Turns on the light.
   - **SetThermostatCommand**: Sets a temperature on the thermostat.
   - **SmartHomeRemoteControl**: Acts as the invoker to execute and undo commands.

All code is contained within the `Main.java` file as static classes for demonstration purpose
