package DesignPattern.FactoryMethodPattern;

abstract class Component {
    protected abstract String getComName();
    public Component(){
        System.out.println(this.getComName()+ "생성");
    }
}

class LightButton extends Component{
    @Override
    protected String getComName() {
        return "라이트 버튼";
    }
}
class DarkButton extends Component{
    @Override
    protected String getComName() {
        return "다크 버튼";
    }
}
class LightSwitch extends Component{
    @Override
    protected String getComName() {
        return "라이트 스위치";
    }
}
class DarkSwitch extends Component{
    @Override
    protected String getComName() {
        return "다크 스위치";
    }
}
class LightDropdown extends Component{

    @Override
    protected String getComName() {
        return "라이트 드랍다운";
    }
}
class DarkDropdown extends Component{

    @Override
    protected String getComName() {
        return "다크 드랍다운";
    }
}
