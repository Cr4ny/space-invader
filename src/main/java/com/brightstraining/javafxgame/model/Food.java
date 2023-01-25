package com.brightstraining.javafxgame.model;

public class Food {
    private int Score;
    public static final long WIDTH = 10;
    public static final long HEIGHT = 10;
    public static final long GROUND_Y = Model.HEIGHT - Food.HEIGHT / 2;
    private long x = ((long) (Math.random ()*Model.WIDTH)+WIDTH/2);
    private long y = ((long) (Math.random ()*Model.HEIGHT)+HEIGHT/2);

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }
    public void update(Player player) {
        if (playerXEqualsFoodX (player) && playerYEqualsFoodY (player)){
            x = ((long) (Math.random ()*Model.WIDTH)+WIDTH/2);
            y = ((long) (Math.random ()* Model.HEIGHT)+HEIGHT/2);
        }
    }
    //Methode, die der Axis check
    public boolean playerXEqualsFoodX(Player player){
        // Wenn x == player.getX -13 bis player.getX + 13 dann return true;
        //
        if (x + WIDTH/2 >= (player.getX () - player.WIDTH/2)
                && x+ WIDTH/2 <= (player.getX () + player.WIDTH/2)) {
            return true;
        }
        return false;

    }
    public boolean playerYEqualsFoodY(Player player) {
        if (y + HEIGHT/2 >= (player.getY () - player.HEIGHT/2)
                && y + HEIGHT/2 <= (player.getY () + player.HEIGHT/2)) {
            return true;
        }
        return false;
    }

}