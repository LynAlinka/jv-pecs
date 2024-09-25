package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> result = new ArrayList<>();

        if (type.equals(Bulldozer.class)) {
            result = (List<T>) new BulldozerProducer().get();
        }
        if (type.equals(Excavator.class)) {
            result = (List<T>) new ExcavatorProducer().get();
        }
        if (type.equals(Truck.class)) {
            result = (List<T>) new TruckProducer().get();
        }

        return result;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
