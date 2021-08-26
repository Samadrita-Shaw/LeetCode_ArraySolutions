package com.company;

public class PangramSentence {
    public boolean checkIfPangram(String sentence) {
        int ctr=0;
        for(char alpha='a'; alpha<='z'; alpha++)
        {
            ctr=0;
            for(int i=0; i<sentence.length(); i++)
            {
                if(sentence.charAt(i)==alpha)
                    ctr++;
            }
            if(ctr==0)
                return false;
        }
        return true;
    }
}
