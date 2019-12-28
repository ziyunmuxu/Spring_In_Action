package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuntu
 * @description
 * @date 2019/12/28
 */
@Component
public class CDPlayer implements MediaPlayer {

    @Autowired
    private CompactDisc cd;

//    private CompactDisc cd;
//
//    @Autowired
//    public CDPlayer(CompactDisc cd){
//        this.cd = cd;
//    }

    @Override
    public void play() {
        cd.play();
    }
}
