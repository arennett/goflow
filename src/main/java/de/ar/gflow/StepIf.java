package de.ar.gflow;

public interface StepIf {
    boolean entryCondition();

    boolean doAction();

    boolean exitCondition();

    String getName();

    String getStepName();

    int getStepId();

}
