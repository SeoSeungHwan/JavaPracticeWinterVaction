package DesignPattern.StatePattern;

public class ModeSwitch {
    private ModeState modeState = new ModeStateLight();

    public void setModeState(ModeState modeState) {
        this.modeState = modeState;
    }

    public void onSwitch(){
        modeState.toggle(this);
    }

}
