package DesignPattern.MediatorPattern;

public class ModeSwitch {
    Mode mode = Mode.LIST;

    ModeMediator modeMediator;

    public void setModeMediator(ModeMediator modeMediator) {
        this.modeMediator = modeMediator;
    }
    public void toggleMode(){
        mode = mode ==Mode.LIST ? Mode.GALLERY: Mode.LIST;

        if(modeMediator != null){
            modeMediator.onModeChange(mode);
        }
    }

}

enum Mode {LIST, GALLERY}
