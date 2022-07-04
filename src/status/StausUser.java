/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public enum Code {ZERO_REJECTED,ONE_PENDING,TWO_PROCESSING,THREE_APPROVED,}
   private Code code;
   
   public StausUser(Code c){
   this.code = c;
   }
 
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }
 
}
