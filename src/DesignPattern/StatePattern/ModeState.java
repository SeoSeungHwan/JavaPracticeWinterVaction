package DesignPattern.StatePattern;

public interface ModeState {
    public void toggle(ModeSwitch modeSwitch);
}

class ModeStateLight implements ModeState{

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("LIGHT -> DARK");

        modeSwitch.setModeState(new ModeStateDark());
    }
}

class ModeStateDark implements  ModeState{

    @Override
    public void toggle(ModeSwitch modeSwitch) {
        System.out.println("DARK -> LIGHT");

        modeSwitch.setModeState(new ModeStateLight());
    }
}
