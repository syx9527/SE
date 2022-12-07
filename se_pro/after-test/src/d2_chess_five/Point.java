package d2_chess_five;


import java.awt.Color;
/**
 * 棋子类
 * @author SYX
 */
public class Point {
    //棋盘中的x索引
    private final int x;
    private final int y;//棋盘中的y索引
    private final Color color;//颜色
    public static final int DIAMETER=30;//直径

    public Point(int x,int y,Color color){
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public int getX(){//拿到棋盘中x的索引
        return x;
    }
    public int getY(){
        return y;
    }
    public Color getColor(){//获得棋子的颜色
        return color;
    }
}