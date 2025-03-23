package manager;

import data.model.NickName;

import java.util.Random;

public class NameManager {

    public String get(NickName nickName) {
        Random random = new Random();
        int r = random.nextInt(nickName.names().size());
        return nickName.names().get(r);
    }
}
