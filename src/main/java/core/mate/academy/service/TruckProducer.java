package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;

import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        return trucks;
    }
}
