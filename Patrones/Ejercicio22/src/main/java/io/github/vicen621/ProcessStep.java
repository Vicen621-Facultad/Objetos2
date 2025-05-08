package io.github.vicen621;

public abstract class ProcessStep {
    private boolean result;

    public void execute(MixingTank tank) {
        if (this.basicExecute(tank)) {
            this.setSuccess();
        } else {
            this.setFailure();
        }
    }

    public boolean isDone() {
        return this.result;
    }

    private void setFailure() {
        this.result = false;
    }

    private void setSuccess() {
        this.result = true;
    }

    protected abstract boolean basicExecute(MixingTank tank);
}
