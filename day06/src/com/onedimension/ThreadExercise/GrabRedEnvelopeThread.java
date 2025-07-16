package com.onedimension.ThreadExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class GrabRedEnvelopeThread implements Callable<Integer> {
    private final RedEnvelopeList redEnvelopeList;
    private Staff staff;

    public GrabRedEnvelopeThread(Staff staff, RedEnvelopeList redEnvelopeList) {
        this.redEnvelopeList = redEnvelopeList;
        this.staff = staff;
    }

//    @Override
//    public void run() {
//        Thread.currentThread().setName(staff.getId() + "号员工");
//        this.redEnvelopeList.grabRedEnvelope(this.staff);
//    }

    @Override
    public Integer call() throws Exception {
        Thread.currentThread().setName(staff.getId() + "号员工");
        return this.redEnvelopeList.grabRedEnvelope(this.staff);
    }
}
