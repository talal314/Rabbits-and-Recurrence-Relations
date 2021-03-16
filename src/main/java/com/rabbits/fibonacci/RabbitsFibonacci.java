package com.rabbits.fibonacci;

/**
 * We assume that one pair of adult rabbits bring two pairs of rabbits and
 * it takes one month before the rabbit pair matures and are able to reproduce
 * and also in the beginning we have one immature pair of rabbits
 *
 */
public class RabbitsFibonacci
{
    public int PairsOfRabbits(int months,int offspring){
            int parents=1,child=1,tempValue;
            if(months<0 || offspring <0){
                throw new RuntimeException("Error. Negative number not valid");
            }
            for(int i=0;i<months-1;i++){
                tempValue=child * offspring;
                child=parents;
                parents=parents + tempValue;
            }
            return child;


    }
}
