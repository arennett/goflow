package de.ar.gflow;

public interface WorkFlowIf {

    void addStep(StepIf step, int seqId, int nextSeqId) throws WorkFlowException;

    StepIf getStep(int stepId);

    boolean doNext(boolean checkExit, boolean checkEntry);

    boolean doNext(int _stepSeqId, boolean checkExit, boolean checkEntry);

    StepIf getCurrentStep();

    int getCurrentStepId();

    boolean initialize();

    boolean doNext();

    boolean isFinished();
}
