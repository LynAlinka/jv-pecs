package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        int numberOfExcavators = 2;
        for (int i = 0; i < numberOfExcavators; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}
