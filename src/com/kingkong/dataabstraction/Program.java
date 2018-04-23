/*
** *****************kiranmaharjan8888@gmail.com
*Concept of:----
*override
* Abstraction:

* Concept of override:

*Constructor:

*Inheritence:
 */
package com.kingkong.dataabstraction;

import com.kingkong.dataabstraction.entities.BaseGuitar;
import com.kingkong.dataabstraction.entities.ElectricGuitar;
import com.kingkong.dataabstraction.entities.Football;
import com.kingkong.dataabstraction.entities.Guitar;
import com.kingkong.dataabstraction.entities.Playable;

/**
 *
 * @author kiran
 */
public class Program {

    
    public static void main(String[] args) {
        
        //..guitar -> parent class, other guitar -> child
       
  /* --uncomment 1
        ElectricGuitar g= new ElectricGuitar();
        g.play();//calls parent play()  */
  
/*-- solution 1: override parent play()
               
        solution2:  make fuction like plays1 or plays2. for new objects like electricguitar .. 
             g.play_ElectricGuitar();
    solution 3: so make abstract play() in parent 

        */      
  
           //Guitar g=new Guitar() {}; //-> instantiat
                //-> object cannot be created. it asks which guiatar? for abstract class
                //->constructor cannot be instantiated
//          Guitar g=new ElectricGuitar();
//           g.play();
//                  
            Playable g=new Football();
            g.play();
            
            
            Playable bg=new BaseGuitar();
            bg.play();
            Playable eg=new ElectricGuitar();
            eg.play();
            
            // --next solid design principle
            //--"s" stands for sigle response :: avoiding if/else
            

  
    }
    
}
