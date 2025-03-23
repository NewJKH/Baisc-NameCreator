package controller;

import data.model.NickName;
import manager.NameManager;

import java.util.List;

public class NameController {
    private final List<NickName> nickNames;
    public NameController(List<NickName> nickNames) {
        this.nickNames = nickNames;
    }

    public void generator(){
        NameManager manager = new NameManager();

        String prefix = manager.get(nickNames.get(0));
        String name = manager.get(nickNames.get(1));
        String suffix = manager.get(nickNames.get(2));

        print(prefix,suffix,name);
    }
    public void print(String p, String s, String n){
        System.out.println(p+" "+s+" "+n);
    }
}
