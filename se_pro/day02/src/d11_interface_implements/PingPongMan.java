package d11_interface_implements;

public class PingPongMan implements SportMan, Law {
    private String name;


    public PingPongMan() {
    }

    public PingPongMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(this.name + "要遵章守法，不能打假球!");
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑步训练");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛");
    }
}
