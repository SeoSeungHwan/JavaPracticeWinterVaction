package DesignPattern.FactoryMethodPattern;

import com.sun.prism.Texture;

interface CompFactory{
    public Component getComp(Usage usage);
}

class LightCompFactory implements CompFactory{

    @Override
    public Component getComp(Usage usage) {
        if(usage == Usage.PRESS){
            return new LightButton();
        }else if(usage == Usage.TOGGLE){
            return new LightSwitch();
        }else{
            return new LightDropdown();
        }
    }
}

class DarkCompFactory implements CompFactory{

    @Override
    public Component getComp(Usage usage) {
        if(usage == Usage.PRESS){
            return new DarkButton();
        }else if(usage == Usage.TOGGLE){
            return new DarkSwitch();
        }else{
            return new DarkDropdown();
        }
    }
}