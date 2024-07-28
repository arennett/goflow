package de.ar.gflow;

public abstract class StepAdapter implements StepIf{
    private final String stepName;
    private final int stepId;

    public StepAdapter(String stepName,int stepId){
        this.stepName = stepName;
        this.stepId = stepId;
    }

    @Override
    public String getStepName() {
        return stepName;
    }

    @Override
    public int getStepId() {
        return stepId;
    }
}
