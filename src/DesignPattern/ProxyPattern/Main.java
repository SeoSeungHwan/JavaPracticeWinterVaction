package DesignPattern.ProxyPattern;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Thumbnail> thumbnails = new ArrayList<>();

        thumbnails.add(new ProxyThumbnail("1번째 강좌","/first.mp4"));
        thumbnails.add(new ProxyThumbnail("2번째 강좌","/second.mp4"));
        thumbnails.add(new ProxyThumbnail("3번째 강좌","/third.mp4"));
        thumbnails.add(new ProxyThumbnail("4번째 강좌","/fourth.mp4"));
        thumbnails.add(new ProxyThumbnail("5번째 강좌","/fifth.mp4"));

        for(Thumbnail thumbnail : thumbnails){
            thumbnail.showTitle();
        }
        thumbnails.get(2).showPreview();
        thumbnails.get(1).showPreview();
        thumbnails.get(4).showPreview();

    }

}
