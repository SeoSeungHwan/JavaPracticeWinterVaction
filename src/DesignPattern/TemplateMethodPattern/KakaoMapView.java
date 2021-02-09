package DesignPattern.TemplateMethodPattern;

public class KakaoMapView extends MapView{
    @Override
    protected void connectMapServer() {
        System.out.println("카카오 지도 서버 연결");
    }

    @Override
    protected void showMapOnScreen() {
        System.out.println("카카오 지도 출력");

    }

    @Override
    protected void moveToCurrentLocation() {
        System.out.println("카카오 지도에서 현재좌표로 이동");
    }
}
