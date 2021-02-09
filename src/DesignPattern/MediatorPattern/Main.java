package DesignPattern.MediatorPattern;

public class Main {
    public static void main(String[] args) {

        ModeSwitch modeSwitch = new ModeSwitch();
        ModeMediator modeMediator = new ModeMediator();

        modeSwitch.setModeMediator(modeMediator);

        modeMediator.addListener(new ListView());
        modeMediator.addListener(new GalleryView());
        modeMediator.addListener(new DataDownLoader());

        modeSwitch.toggleMode();
        modeSwitch.toggleMode();
    }
}
