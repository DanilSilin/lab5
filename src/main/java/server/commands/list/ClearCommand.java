package server.commands.list;

import server.commands.Command;
import server.controller.VehicleController;
import server.exceptions.ArgumentException;

public class ClearCommand implements Command {
    private final VehicleController controller;

    public ClearCommand(VehicleController controller) {
        this.controller = controller;
    }

    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            throw new ArgumentException("Команда не должна содержать аргументов.");
        }
        controller.clear();
        System.out.println("Успешно очищено");
    }

    @Override
    public String description() {
        return "очищает коллекцию.";
    }
}
