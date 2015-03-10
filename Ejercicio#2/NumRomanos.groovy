
/**
 * Created by Sintel on 07/03/2015.
 */

  Integer num = 456
  List numRomUni = ['','I','II','III','IV','V','VI','VII','VIII','IX']
  List numRomDec = ['','X','XX','XXX', 'XL','L', 'LX', 'LXX', 'LXXX', 'XC']
  List numRomCen = ['','C', 'CC','CC','CD', 'D', 'DC', 'DCC','DCC','CM']
  List numRomMil = ['','M','MM','MMM']

        Integer u = num%10       
        Integer d = num/10
        Integer c = num/100     
        Integer m = num/1000

    if (num<=9){
        numRomUni.eachWithIndex{ numRomano, index ->
            if (num == index){
                println "$num = " +numRomano
            }
         }   
    }else if (num >= 10 && num <= 99){              
            println "$num = " + numRomDec[d] + numRomUni[u]
            }else if (num >= 100 && num <= 999){
                d = d%10                                           
                println "$num = "+ numRomCen[c] + numRomDec[d] + numRomUni[u]
                }else if(num>= 1000 && num <= 3999){
                    d = d%10 
                    c = c%10                    
                    println "$num = " +numRomMil[m] + numRomCen[c] + numRomDec[d] + numRomUni[u]
                    }
            
        
    





