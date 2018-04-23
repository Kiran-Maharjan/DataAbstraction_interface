/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingkong.dataabstraction.entities;

/**
 *
 * @author kiran
 */
/*public class BaseGuitar extends Guitar{
    //--if there is play() in parent
        //--Again it calls guitar class function
        //--so override the play method of guitar parrent class
    //--else we should not override play() if there is no play() in parent
    @Override 
    public void play()
    {
        System.out.println("play BaseGuitar");
    }
  */
//public class BaseGuitar implements Playable{
//
//    @Override
//    public void play() {
//        System.out.println("play BaseGuitar");
//                }
//
//}


public class BaseGuitar extends Guitar{

    @Override
    public void play() {
        System.out.println("play BaseGuitar");
                }

}



