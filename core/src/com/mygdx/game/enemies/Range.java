/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.game.enemies;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.Cell;
import java.util.ArrayList;

/**
 * Класс врагов дальнего боя
 * @author PK
 */
public  class Range extends Enemy{
       
   public Range(Cell pos, ArrayList<Cell> road,int hp,int dmg,float speed, int moneyForKill, TextureRegion  pict, int range){
       super(pos,road,hp,dmg,speed,moneyForKill,pict);
         _rangeAttack=range;
    }
}
    
