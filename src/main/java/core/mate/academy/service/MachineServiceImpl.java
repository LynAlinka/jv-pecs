package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> result = new ArrayList<>();

        if (type.equals(Bulldozer.class)) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            result.addAll(bulldozers);
        } else if (type.equals(Excavator.class)) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            result.addAll(excavators);
        } else if (type.equals(Truck.class)) {
            List<Truck> trucks = new TruckProducer().get();
            result.addAll(trucks);
        }
        return result;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
