package com.wcq.delegate.caseone;

import com.wcq.delegate.caseone.Leader;

public class Boss {

   public void announce(String command, Leader leader){
       leader.excute(command);
   }
}
