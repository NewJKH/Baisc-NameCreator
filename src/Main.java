import controller.NameController;
import data.model.NickName;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        NickName prefix = new NickName(List.of("기철초풍","멋있는","재미있는"));
        NickName name = new NickName(List.of("돌고래","개발자","오랑우탄"));
        NickName suffix = new NickName(List.of("도전적인","노란색의","바보같은"));

        List<NickName> nickNames = new ArrayList<>();
        nickNames.add(prefix);
        nickNames.add(name);
        nickNames.add(suffix);

        new NameController(nickNames)
                .generator();
    }
}