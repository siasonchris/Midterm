/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author chris
 */
public class GenerateStatus {
    StausUser[] s = new StausUser[4];
     public void generate(){
          for( StausUser.Code  c :StausUser.Code.values() ){
          s[0] = new StausUser(c);
          }
     }

}
