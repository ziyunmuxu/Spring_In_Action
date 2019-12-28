package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author yuntu
 * @description
 * @date 2019/12/28
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artists = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artists);
    }

    public static void main(String[] args) {
        new SgtPeppers().play();
    }
}
